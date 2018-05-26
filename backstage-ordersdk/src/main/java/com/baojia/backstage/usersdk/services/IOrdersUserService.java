package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baojia.backstage.ordersdk.models.OrdersUserEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * @author wxr
 * @Title: 订单用户服务
 * @Description: dubbo
 * @date 2018/5/22 14:22
 */
public interface IOrdersUserService extends IService<OrdersUserEntity>{
    /**
 　　* @Description: 根据订单编号查询订单用户信息
 　　* @param orderNo ,num
 　　* @return OrdersUserEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/26
 　　*/
    OrdersUserEntity getOrdersUserByOid(Map<String,Object> map);
}
