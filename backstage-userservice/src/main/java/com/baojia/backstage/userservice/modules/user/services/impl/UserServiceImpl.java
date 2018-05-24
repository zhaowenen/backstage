package com.baojia.backstage.userservice.modules.user.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.user.bo.UserInfoBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baojia.backstage.usersdk.models.UserOperateLogEntity;
import com.baojia.backstage.usersdk.models.UserWalletEntity;
import com.baojia.backstage.usersdk.models.UserWalletLogEntity;
import com.baojia.backstage.usersdk.services.IUserService;
import com.baojia.backstage.userservice.common.utils.OkHttpUtil;
import com.baojia.backstage.userservice.modules.user.dao.UserCouponMapper;
import com.baojia.backstage.userservice.modules.user.dao.UserMapper;
import com.baojia.backstage.userservice.modules.user.dao.UserWalletMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: OrdersServiceImpl
 * @Description: 订单实现类
 * @date 2018/5/22 15:07
 */
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
    @Qualifier(value = "okHttpUtil")
    private OkHttpUtil okHttpUtil;
    @Value("${lock.bike.command.url}")
    private String lockBikeUrl;


    @Autowired
    private UserCouponMapper userCouponMapper;

    @Autowired
    private UserWalletMapper userWalletMapper;

    /**
     * 条件分页查询用户管理页面
     * @param pageNum
     * @param pageSize
     * @param userDto
     * @return
     */
    @Override
    public PageUtils pageUserInfoBo(int pageNum, int pageSize, UserDto userDto) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfoBo> userList = baseMapper.listByUserDto(userDto);
        PageInfo<UserInfoBo> pageInfo = new PageInfo<UserInfoBo>(userList);
        userList = pageInfo.getList();
        for (UserInfoBo userInfoBo : userList) {
           Integer validNum =  userCouponMapper.countValidNum(userInfoBo.getUserId());
           userInfoBo.setCashCoupon(validNum);
        }
        PageUtils page = new PageUtils(userList, (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }

    /**
     * 锁定用户押金
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean lockUserDeposit(String userId,String remarks) {
        boolean flag = false;
        Integer type = 6;//锁定押金
        UserWalletEntity userWalletEntity =  userWalletMapper.selectByUserIdForUpdate(userId);
        if(userWalletEntity != null && userWalletEntity.getLockStatus() ==1){
            userWalletEntity.setLockStatus(2);
            userWalletMapper.updateUserWallet(userWalletEntity);
            this.addWalletLog(userWalletEntity,type,remarks);
            flag = true;
        }
        return flag;
    }

    /**
     * 解锁用户押金
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean unlockUserDeposit(String userId) {
        boolean flag = false;
        Integer type = 5;//解锁押金
        UserWalletEntity userWalletEntity =  userWalletMapper.selectByUserIdForUpdate(userId);
        if(userWalletEntity != null && userWalletEntity.getLockStatus() ==2){
            userWalletEntity.setLockStatus(1);
            userWalletMapper.updateUserWallet(userWalletEntity);
            this.addWalletLog(userWalletEntity,type,"");
            flag = true;
        }
        return flag;
    }


    /**
     * 拉黑用户
     * @param userId
     * @param remarks
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean pullBlack(String userId, String remarks) {
        boolean flag = false;
        Integer type = 1;//拉黑用户
        UserEntity user = baseMapper.selectByUserIdForUpdate(userId);
        if(user != null && user.getBlackStatus()!=2){
            user.setBlackStatus(2);//拉黑状态
            baseMapper.updateUserEntity(user);
            this.addOperateUserLog(user,type,remarks);
            flag = true;
        }
        return flag;
    }

    /**
     * 解除拉黑用户
     * @param userId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
    public boolean liftBlack(String userId) {
        boolean flag = false;
        Integer type = 1;//解锁拉黑用户
        UserEntity user = baseMapper.selectByUserIdForUpdate(userId);
        if(user != null && user.getBlackStatus()!=1){
            user.setBlackStatus(1);//解锁拉黑状态
            baseMapper.updateUserEntity(user);
            this.addOperateUserLog(user,type,"");
            flag = true;
        }
        return flag;
    }


    /**
     * 增加用户操作记录
     * @param user
     * @param type
     * @param remarks
     */
    private void addOperateUserLog(UserEntity user, Integer type, String remarks) {
        UserOperateLogEntity userOperateLogEntity = new UserOperateLogEntity();
        userOperateLogEntity.setUserId(user.getUserId());
        userOperateLogEntity.setOperateType(type);
        userOperateLogEntity.setDelFlag(1);
        userOperateLogEntity.setRemarks(remarks);
        if(type ==1){
            userOperateLogEntity.setOperateOldText("未拉黑");
            userOperateLogEntity.setOperateNewText("拉黑");
        }else if(type ==2){
            userOperateLogEntity.setOperateOldText("拉黑");
            userOperateLogEntity.setOperateNewText("未拉黑");
        }
        baseMapper.insertUserOperateLog(userOperateLogEntity);
    }

    /**
     * 增加用户操作押金记录
     * @param userWalletEntity
     * @param type
     * @param remarks
     */
    private void addWalletLog(UserWalletEntity userWalletEntity, Integer type, String remarks) {
        UserWalletLogEntity uwel = new UserWalletLogEntity();
        BigDecimal changeMone = new BigDecimal(0);
        uwel.setUserId(userWalletEntity.getUserId());
        uwel.setRechargeStatus(1);
        uwel.setDepositAmount(userWalletEntity.getDepositAmount());
        uwel.setDepositAmountChange(changeMone);
        uwel.setDepositFrom(userWalletEntity.getDepositFrom());
        uwel.setDepositTime(userWalletEntity.getDepositTime());
        uwel.setCityCode(userWalletEntity.getCityCode());
        uwel.setAdCode(userWalletEntity.getAdCode());
        uwel.setMiCoinAmount(userWalletEntity.getMiCoinAmount());
        uwel.setMiCoinAmountChange(changeMone);
        uwel.setRechargeAmount(userWalletEntity.getRechargeAmount());
        uwel.setRechargeAmountChange(changeMone);
        uwel.setGiveAmount(userWalletEntity.getGiveAmount());
        uwel.setGiveAmountChange(changeMone);
        uwel.setType(type);
        uwel.setDelFlag(1);
        uwel.setRemarks(remarks);
        if(type == 5){//解锁
            uwel.setLockStatus(2);//押金锁定
            uwel.setOrderNo("unlockdeposit");
        }else if(type == 6){
            uwel.setLockStatus(1);//押金锁定
            uwel.setOrderNo("lockdeposit");
        }
        userWalletMapper.insertUserWalletLog(uwel);
    }


    @Override
    public PageUtils pageInfo(int pageNum, int pageSize) {

        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserEntity> userList = baseMapper.selectAll();
        PageInfo<UserEntity> pageInfo = new PageInfo<UserEntity>(userList);
        PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }

    @Override
    public PageUtils pageInfoByMap(int pageNum, int pageSize, Map<String, Object> param) {
        PageHelper.startPage(pageNum, pageSize);
        List<UserEntity> userList = baseMapper.selectByMap(param);
        PageInfo<UserEntity> pageInfo = new PageInfo<UserEntity>(userList);
        PageUtils page = new PageUtils(pageInfo.getList(), (int)pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getPageNum());
        return page;
    }
}
