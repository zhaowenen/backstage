package com.baojia.backstage.depositsdk.service.service;


import java.util.List;

import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baomidou.mybatisplus.service.IService;

public interface RefundRecordService extends IService<RefundRecord>{
	
	void withdrawDeposit(Long depositOrderId);
}
