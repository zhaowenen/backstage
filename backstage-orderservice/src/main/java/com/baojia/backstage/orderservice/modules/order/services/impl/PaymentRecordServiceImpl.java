package com.baojia.backstage.orderservice.modules.order.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.ordersdk.models.PaymentRecordEntity;
import com.baojia.backstage.ordersdk.services.IPaymentRecordService;
import com.baojia.backstage.orderservice.modules.order.dao.PaymentRecordMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wxr
 * @Title: PaymentRecordServiceImpl
 * @Description: 支付流水表
 * @date 2018/5/22 15:09
 */
@Component
@Service(interfaceClass = IPaymentRecordService.class)
public class PaymentRecordServiceImpl extends ServiceImpl<PaymentRecordMapper, PaymentRecordEntity> implements IPaymentRecordService {
    @Override
    public PaymentRecordEntity getPaymentRecordByOid(Map<String,Object> map) {
        return baseMapper.getPaymentRecordByOid(map);
    }
}
