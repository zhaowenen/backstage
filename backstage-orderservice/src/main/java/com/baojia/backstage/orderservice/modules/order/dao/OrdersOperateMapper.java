package com.baojia.backstage.orderservice.modules.order.dao;

import com.baojia.backstage.ordersdk.models.OrdersOperateEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: 订单操作
 * @date 2018/5/22 15:04
 */
public interface OrdersOperateMapper extends BaseMapper<OrdersOperateEntity>{
    /**
 　　* @Description: 根据取模的数字，选择取第几个订单表orders_bike
 　　* @param map-订单编号，num取模数字
 　　* @return List<OrdersOperateEntity>
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/25 15:02
 　　*/
    List<OrdersOperateEntity> listOrderOperateByOid(Map<String,Object> map);
}
