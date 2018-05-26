package com.baojia.backstage.orderservice.modules.order.dao;

import com.baojia.backstage.ordersdk.models.PaymentRecordEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.Map;

/**
 * @author wxr
 * @Title: 订单流水
 * @date 2018/5/22 15:04
 */
public interface PaymentRecordMapper extends BaseMapper<PaymentRecordEntity>{
    /**
 　　* @Description: 根据取模的数字，选择取第几个订单表payment_record
 　　* @param orderId-订单编号，num取模数字
 　　* @return PaymentRecordEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/25 15:02
 　　*/
    PaymentRecordEntity getPaymentRecordByOid(Map<String,Object> map);
}
