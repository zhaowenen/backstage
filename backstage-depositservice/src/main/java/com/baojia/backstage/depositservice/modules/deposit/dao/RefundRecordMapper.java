package com.baojia.backstage.depositservice.modules.deposit.dao;

import com.baojia.backstage.depositsdk.service.models.RefundRecord;

public interface RefundRecordMapper {
	
    int deleteByPrimaryKey(Long refundId);

    int insert(RefundRecord record);

    int insertSelective(RefundRecord record);

    RefundRecord selectByPrimaryKey(Long refundId);

    int updateByPrimaryKeySelective(RefundRecord record);

    int updateByPrimaryKey(RefundRecord record);
}