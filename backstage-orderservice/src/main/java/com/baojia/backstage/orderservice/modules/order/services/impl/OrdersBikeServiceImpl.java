package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.models.OrdersBikeEntity;
import com.baojia.backstage.ordersdk.services.IOrdersBikeService;
import com.baojia.backstage.orderservice.modules.order.dao.OrdersBikeMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: OrdersBikeServiceImpl
 * @description 订单车辆实现类
 * @date 2018/5/22 15:06
 */
@Component
@Service(version = "1.0.0")
public class OrdersBikeServiceImpl  extends ServiceImpl<OrdersBikeMapper, OrdersBikeEntity> implements IOrdersBikeService{

}
