package com.baojia.backstage.ordersdk.services;

import com.baojia.backstage.ordersdk.models.PaymentRecordEntity;
import com.baomidou.mybatisplus.service.IService;

import java.util.Map;

/**
 * @author wxr
 * @Title: IPaymentRecordService
 * @Description: 支付流水
 * @date 2018/5/26 11:05
 */
public interface IPaymentRecordService  extends IService<PaymentRecordEntity> {
    /**
 　　* @Description: 根据订单编号查询订单用户信息
 　　* @param orderNo ,num
 　　* @return OrdersUserEntity
 　　* @throws
 　　* @author wxr
 　　* @date 2018/5/26
 　　*/
    PaymentRecordEntity getPaymentRecordByOid(Map<String,Object> map);
}
