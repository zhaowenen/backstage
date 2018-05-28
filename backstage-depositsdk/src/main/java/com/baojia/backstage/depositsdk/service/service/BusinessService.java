package com.baojia.backstage.depositsdk.service.service;



import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;


public interface BusinessService {
	
	Map<String, Object> addDepositApply(Integer type, Long userId, String userName, String userPhone, BigDecimal beforeAmount, BigDecimal changeAmount, 
			Long applyUserId, String applyUserName, Integer userMode, String userRealName, String userAccount, Long depositOrderId);
	
	Map<String, Object> addRefundRecord(Map<String, Object> map, Long userId, BigDecimal amount, Integer refundMethod);
	
	void updateDepositStauts(Long depositApplyId, Long refundRecordId, Long depositOrderId, String status, String applyUserName,
			BigDecimal beforeAmount, BigDecimal changeAmount, Date payTime, Long userId, Integer depositFrom, String orderNo);
	
	void updateRefundRecord(Long refundRecordId, String outTradeNo);

}
