package com.baojia.backstage.userservice.modules.user.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.models.OrdersDetailEntity;
import com.baojia.backstage.ordersdk.services.IOrderDetailService;
import com.baojia.backstage.userservice.modules.user.dao.OrdersDetailMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: OrdersDetailServiceImpl
 * @Description: 订单详情实现类
 * @date 2018/5/22 15:07
 */
@Component
@Service(version = "1.0.0")
public class OrdersDetailServiceImpl extends ServiceImpl<OrdersDetailMapper, OrdersDetailEntity>
        implements IOrderDetailService {

}
