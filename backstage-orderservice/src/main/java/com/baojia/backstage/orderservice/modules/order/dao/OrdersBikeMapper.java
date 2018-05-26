package com.baojia.backstage.orderservice.modules.order.dao;

import com.baojia.backstage.domain.order.dto.OrdersDto;
import com.baojia.backstage.ordersdk.models.OrdersBikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.Map;

/**
 * @author wxr
 * @Title: 订单车辆
 * @date 2018/5/22 14:56
 */
public interface OrdersBikeMapper extends BaseMapper<OrdersBikeEntity>{
    /**
 　　* @Description: 根据取模的数字，选择取第几个订单表orders_bike
 　　* @param map-订单编号，num取模数字
 　　* @return OrdersBikeEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/25 15:02
 　　*/
    OrdersBikeEntity getOrderBikeByOrderId(Map<String,Object> map);
}
