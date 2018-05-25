package com.baojia.backstage.depositservice.modules.deposit.service.impl;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baojia.backstage.depositsdk.service.service.RefundRecordService;
import com.baojia.backstage.depositservice.datasources.DataSourceNames;
import com.baojia.backstage.depositservice.datasources.DynamicDataSource;
import com.baojia.backstage.depositservice.modules.deposit.dao.RefundRecordMapper;
import com.baomidou.mybatisplus.annotations.DataSource;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import enums.deposit.DepositPayMethodStatus;

/**
* @Title: RefundRecordServiceImpl  
* @Description:  退款流水实现类
* @author renjing  
* @date 2018年5月25日 下午6:30:21
 */
@Component
@Service(interfaceClass = RefundRecordService.class)
public class RefundRecordServiceImpl  extends ServiceImpl<RefundRecordMapper, RefundRecord> implements RefundRecordService{

	@Override
	public void withdrawDeposit(Long depositOrderId) {
		DynamicDataSource.setDataSource(DataSourceNames.SECOND);
		RefundRecord refundRecord = new RefundRecord();
		refundRecord.setOrderNo("test001");
		refundRecord.setRefundAmount(new BigDecimal(299));
		refundRecord.setRefundMethod(DepositPayMethodStatus.WECHAT.getType());
		refundRecord.setRefundType(2);
		refundRecord.setRefundStatus(0);
		refundRecord.setCreateTime(new Date());
		baseMapper.insert(refundRecord);
		DynamicDataSource.clearDataSource();
	}


}
