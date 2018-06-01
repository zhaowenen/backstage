package com.baojia.backstage.userservice.modules.user.dao;

import java.util.List;
import java.util.Map;

import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;


/**
 * @author wxr
 * @Title: 订单表
 * @date 2018/5/22 15:02
 */
public interface OrdersMapper extends BaseMapper<OrdersEntity> {
    List<OrdersBo> complexOrdersPage();
    /**
　　* @Description: 根据取模的数字，选择取第几个订单表orders
　　* @param orderId-订单编号，num取模数字
　　* @return OrdersEntity
　　* @throws
　　* @author wxr
　　* @date 2018/5/25 15:02
　　*/
    OrdersEntity getOrderById(Map<String,Object> map);
}
