package com.baojia.backstage.userservice.modules.user.dao;

import java.util.Map;

import com.baojia.backstage.usersdk.models.OrdersBikeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

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
