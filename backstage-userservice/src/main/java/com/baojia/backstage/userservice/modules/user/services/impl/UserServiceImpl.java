package com.baojia.backstage.userservice.modules.user.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baojia.backstage.ordersdk.models.UserEntity;
import com.baojia.backstage.ordersdk.services.IOrdersService;
import com.baojia.backstage.ordersdk.services.UserService;
import com.baojia.backstage.userservice.common.utils.OkHttpUtil;
import com.baojia.backstage.userservice.modules.user.dao.OrdersMapper;
import com.baojia.backstage.userservice.modules.user.dao.UserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: OrdersServiceImpl
 * @Description: 订单实现类
 * @date 2018/5/22 15:07
 */
@Component
@Service(interfaceClass = UserService.class)
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {
    @Qualifier(value = "okHttpUtil")
    private OkHttpUtil okHttpUtil;
    @Value("${lock.bike.command.url}")
    private String lockBikeUrl;


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
