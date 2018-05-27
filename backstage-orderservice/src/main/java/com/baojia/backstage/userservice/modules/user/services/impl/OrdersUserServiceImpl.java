package com.baojia.backstage.userservice.modules.user.services.impl;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.usersdk.models.OrdersUserEntity;
import com.baojia.backstage.usersdk.services.IOrdersUserService;
import com.baojia.backstage.userservice.modules.user.dao.OrdersUserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author wxr
 * @Title: OrdersUserServiceImpl
 * @Description: 订单用户实现类
 * @date 2018/5/22 15:09
 */
@Component
@Service(interfaceClass = IOrdersUserService.class)
public class OrdersUserServiceImpl extends ServiceImpl<OrdersUserMapper, OrdersUserEntity> implements IOrdersUserService {
    @Override
    public OrdersUserEntity getOrdersUserByOid(Map<String,Object> map) {
        return baseMapper.getOrderUserByOid(map);
    }
}
