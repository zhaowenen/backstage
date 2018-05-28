package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.models.OrdersOperateEntity;
import com.baojia.backstage.ordersdk.services.IOrdersOperateService;
import com.baojia.backstage.orderservice.modules.order.dao.OrdersOperateMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/22 15:08
 */
@Component
@Service(interfaceClass = IOrdersOperateService.class)
public class OrdersOperateServiceImpl extends ServiceImpl<OrdersOperateMapper, OrdersOperateEntity>
        implements IOrdersOperateService {
    @Override
    public List<OrdersOperateEntity> listOrdersOperateByOid(Map<String,Object> map) {
        return baseMapper.listOrderOperateByOid(map);
    }
}
