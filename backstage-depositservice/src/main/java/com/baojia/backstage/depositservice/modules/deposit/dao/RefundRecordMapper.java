package com.baojia.backstage.depositservice.modules.deposit.dao;

import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface RefundRecordMapper extends BaseMapper<RefundRecord>{
	
	int insertSelective(RefundRecord refundRecord);
}