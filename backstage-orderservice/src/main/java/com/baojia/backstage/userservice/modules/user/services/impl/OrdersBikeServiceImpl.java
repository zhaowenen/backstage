package com.baojia.backstage.userservice.modules.user.services.impl;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.usersdk.models.OrdersBikeEntity;
import com.baojia.backstage.usersdk.services.IOrdersBikeService;
import com.baojia.backstage.userservice.modules.user.dao.OrdersBikeMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

/**
 * @author wxr
 * @Title: OrdersBikeServiceImpl
 * @description 订单车辆实现类
 * @date 2018/5/22 15:06*/


@Component
@Service(interfaceClass = IOrdersBikeService.class)
public class OrdersBikeServiceImpl  extends ServiceImpl<OrdersBikeMapper, OrdersBikeEntity> implements IOrdersBikeService{

    @Override
    public OrdersBikeEntity getOrdersBikeByOid(Map<String,Object> map) {
        return baseMapper.getOrderBikeByOrderId(map);
    }
}
