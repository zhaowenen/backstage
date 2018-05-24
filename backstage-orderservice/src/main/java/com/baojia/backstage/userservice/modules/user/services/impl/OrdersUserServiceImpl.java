package com.baojia.backstage.userservice.modules.user.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.usersdk.models.OrdersUserEntity;
import com.baojia.backstage.usersdk.services.IOrdersUserService;
import com.baojia.backstage.userservice.modules.user.dao.OrdersUserMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: OrdersUserServiceImpl
 * @Description: 订单用户实现类
 * @date 2018/5/22 15:09
 */
@Component
@Service(version = "1.0.0")
public class OrdersUserServiceImpl extends ServiceImpl<OrdersUserMapper, OrdersUserEntity> implements IOrdersUserService {
}
