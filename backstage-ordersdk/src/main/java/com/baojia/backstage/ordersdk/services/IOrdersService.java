package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.common.auth.util.PageUtils;
import com.baojia.backstage.orderdomain.bo.OrdersBo;
import com.baojia.backstage.ordersdk.models.OrdersEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: 订单服务
 * @Description: dubbo
 * @date 2018/5/22 14:22
 */
public interface IOrdersService extends IService<OrdersEntity>{
    PageUtils complexOrdersPage(int pageNum, int pageSize);
}
