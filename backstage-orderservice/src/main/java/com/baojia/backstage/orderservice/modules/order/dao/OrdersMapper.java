package com.baojia.backstage.orderservice.modules.order.dao;

import com.baojia.backstage.domain.order.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * @author wxr
 * @Title: 订单表
 * @date 2018/5/22 15:02
 */
public interface OrdersMapper extends BaseMapper<OrdersEntity>{
    List<OrdersBo> complexOrdersPage();
}
