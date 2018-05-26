package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.models.OrdersUserEntity;
import com.baojia.backstage.ordersdk.services.IOrdersUserService;
import com.baojia.backstage.ordersdk.services.IPaymentRecordService;
import com.baojia.backstage.orderservice.modules.order.dao.OrdersUserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

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
