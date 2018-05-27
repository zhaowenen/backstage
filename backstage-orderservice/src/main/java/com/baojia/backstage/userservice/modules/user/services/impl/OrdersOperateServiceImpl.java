package com.baojia.backstage.userservice.modules.user.services.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.services.IOrdersOperateService;
import com.baojia.backstage.usersdk.models.OrdersOperateEntity;
import com.baojia.backstage.userservice.modules.user.dao.OrdersOperateMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

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
