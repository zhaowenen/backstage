package com.baojia.backstage.usersdk.services;

import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.user.bo.UserDetailBo;
import com.baojia.backstage.domain.user.dto.UserDto;
import com.baojia.backstage.usersdk.models.UserEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * 用户管理服务相关
 * @Auther: YUANERL
 * @Date: 2018/5/24 10:23
 * @Description:
 */
public interface IUserService extends IService<UserEntity> {

    PageUtils pageUserInfoBo(int pageNum, int pageSize,UserDto userDto);

    boolean lockUserDeposit(String userId,String remarks);

    boolean unlockUserDeposit(String userId);

    boolean pullBlack(String userId,String remarks);

    boolean liftBlack(String userId);

    UserDetailBo getUserDetail(String userId);

    PageUtils pageUerBlackLog(int pageNum, int pageSize,String userId);

    PageUtils pageUserLockLog(int pageNum, int pageSize,String userId);

    PageUtils pageUserDepositLog(int pageNum, int pageSize,String userId);

    PageUtils pageUserCouponLog(int pageNum, int pageSize,String userId);

    PageUtils pageUserBalanceLog(int pageNum, int pageSize,String userId);



}
