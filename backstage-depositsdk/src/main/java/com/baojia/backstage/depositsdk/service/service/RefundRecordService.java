package com.baojia.backstage.depositsdk.service.service;


import java.math.BigDecimal;

import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baomidou.mybatisplus.service.IService;

public interface RefundRecordService extends IService<RefundRecord>{
	
	void withdrawDeposit(String realName, BigDecimal amount, Integer refundType, String userAccount);
}
