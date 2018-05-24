package com.baojia.backstage.userservice.modules.user.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.usersdk.models.OrdersOperateEntity;
import com.baojia.backstage.usersdk.services.IOrderOperateService;
import com.baojia.backstage.userservice.modules.user.dao.OrdersOperateMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/22 15:08
 */
@Component
@Service(version = "1.0.0")
public class OrdersOperateServiceImpl extends ServiceImpl<OrdersOperateMapper, OrdersOperateEntity>
        implements IOrderOperateService {
}
