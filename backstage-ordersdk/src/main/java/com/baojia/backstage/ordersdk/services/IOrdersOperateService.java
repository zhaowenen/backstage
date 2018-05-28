package com.baojia.backstage.ordersdk.services;

import java.util.List;
import java.util.Map;

import com.baojia.backstage.usersdk.models.OrdersOperateEntity;
import com.baomidou.mybatisplus.service.IService;

/**
 * @author wxr
 * @Title: 订单操作服务
 * @Description: dubbo
 * @date 2018/5/22 14:40
 */
public interface IOrdersOperateService extends IService<OrdersOperateEntity> {
    /**
 　　* @Description: 根据订单编号查询订单车辆信息
 　　* @param orderNo ,num
 　　* @return OrdersBikeEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/26
 　　*/
    List<OrdersOperateEntity> listOrdersOperateByOid(Map<String,Object> map);
}
