package com.baojia.backstage.depositservice.modules.deposit.service.impl;


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.collections4.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.backstage.depositsdk.service.models.DepositApply;
import com.baojia.backstage.depositsdk.service.models.DepositOrder;
import com.baojia.backstage.depositsdk.service.models.RefundRecord;
import com.baojia.backstage.depositsdk.service.models.UserWalletLog;
import com.baojia.backstage.depositsdk.service.service.BusinessService;
import com.baojia.backstage.depositservice.datasources.DataSourceNames;
import com.baojia.backstage.depositservice.datasources.DynamicDataSource;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositApplyMapper;
import com.baojia.backstage.depositservice.modules.deposit.dao.DepositOrderMapper;
import com.baojia.backstage.depositservice.modules.deposit.dao.RefundRecordMapper;
import com.baojia.backstage.depositservice.modules.deposit.dao.UserWalletLogMapper;
import com.baomidou.mybatisplus.annotations.DataSource;

import enums.DelFlagStatus;
import enums.deposit.DepositApplyType;
import enums.deposit.DepositAuditingStatus;
import enums.deposit.DepositCapitalReason;
import enums.deposit.DepositRefundType;
import enums.deposit.DepositStatus;
import enums.order.RefundStatus;
import enums.order.RefundType;
import enums.wallet.LockStatus;
import enums.wallet.OperationType;
import enums.wallet.RechargeStatus;

/**
* @Title: BusinessServiceImpl  
* @Description: 业务相关实现类
* @author renjing  
* @date 2018年5月26日 下午2:14:02
 */
@Component
@Service(interfaceClass = BusinessService.class)
public class BusinessServiceImpl  implements BusinessService{
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private DepositApplyMapper depositApplyMapper;
	@Autowired
	private RefundRecordMapper refundRecordMapper;
	@Autowired
	private DepositOrderMapper depositOrderMapper;
	@Autowired
	private UserWalletLogMapper userWalletLogMapper;
	
	@Transactional
	@Override
	public Map<String, Object> addWithDrawInfo(Integer type, Long userId, String userName, String userPhone, BigDecimal beforeAmount, BigDecimal changeAmount,
			Long applyUserId, String applyUserName, Integer userMode, String userRealName, String userAccount, Long depositOrderId) {
		Map<String, Object> res = new HashMap<>();
		
		Long withDrawApplyId = null;
		Long DeductApplyId = null;
		Long refundRecordId = null;
		String orderNo = null;
		if(type == DepositApplyType.WITHDRAW.getType()) {	//提现
			logger.info("生产提现相关表记录！");
			//1.添加提现申请表
			withDrawApplyId = addDepositApply(DepositApplyType.WITHDRAW.getType(), userId, userName, userPhone, beforeAmount, applyUserId, applyUserName, userMode, userName, userAccount, depositOrderId, DepositCapitalReason.CONSOLE_WITHDRAW, DepositCapitalReason.CONSOLE_WITHDRAW);
			//2.添加退款流水表
			 Map<String, Object> map = addRefundRecord(userId, beforeAmount, userMode);
			 refundRecordId = MapUtils.getLong(map, "refundRecordId");
			 orderNo = MapUtils.getString(map, "orderNo");
		}else {	//扣款（扣款和提现同时进行，所以需要增加提现申请和扣款申请两条记录）
			//注意计算扣款和提现金额
		}
		res.put("withDrawApplyId", withDrawApplyId);
		res.put("refundRecordId", refundRecordId);
		res.put("DeductApplyId", DeductApplyId);
		res.put("orderNo", orderNo);
		return res;
	}
	
	
	@Transactional
	@Override
	public void updateDepositStauts(Long depositApplyId, Long refundRecordId, Long depositOrderId, String status,
			String applyUserName, BigDecimal beforeAmount, BigDecimal changeAmount, Date payTime, Long userId, Integer depositFrom,
			String orderNo, String outTradeNo) {
		if("success".equals(status)) {
			//1.更新提现申请表审批状态为“支付成功”
			DepositApply depositApply = new DepositApply();
			depositApply.setDid(depositApplyId);
			depositApply.setAuditingState(DepositAuditingStatus.PAY_SUCCESS.getType());
			depositApply.setModifyTime(new Date());
			depositApplyMapper.updateById(depositApply);
			
			//2.更新退款流水表退款状态为“退款成功”
			DynamicDataSource.setDataSource(DataSourceNames.SECOND);
			RefundRecord record = new RefundRecord();
			record.setRefundId(refundRecordId);
			record.setRefundStatus(RefundStatus.REFUND_SUCCESS.getType());
			record.setOutTradeNo(outTradeNo);
			record.setModifyTime(new Date());
			refundRecordMapper.updateById(record);
			DynamicDataSource.clearDataSource();
			
			//3.更新押金订单表提现相关
			DepositOrder depositOrder = new DepositOrder();
			depositOrder.setDepositOrderId(depositOrderId);
			depositOrder.setStatus(DepositStatus.WITHDRAW.getType());
			depositOrder.setRefundType(DepositRefundType.CONSOLE_BACK_TRACK_WITHDRAW.getType());
			depositOrder.setRefundAmount(beforeAmount.subtract(changeAmount));
			depositOrder.setRefundTime(new Date());
			depositOrder.setModifyTime(new Date());
			depositOrderMapper.updateById(depositOrder);
			
			//4.查最新一条钱包操作记录用与封装下面添加记录中的其他信息
			UserWalletLog lastLog = userWalletLogMapper.selectNewColumn();
			//5.添加钱包操作记录表
			UserWalletLog userWalletLog = new UserWalletLog();
			userWalletLog.setUserId(userId);
			userWalletLog.setRechargeStatus(RechargeStatus.PAID.getType());
			userWalletLog.setLockStatus(LockStatus.NOT_LOCK.getType());
			userWalletLog.setDepositAmount(beforeAmount);
			userWalletLog.setDepositAmountChange(new BigDecimal(0).subtract(changeAmount));
			userWalletLog.setDepositFrom(depositFrom);
			userWalletLog.setDepositTime(payTime);
			userWalletLog.setOrderNo(orderNo);
			userWalletLog.setDelFlag(DelFlagStatus.EFFECTIVE.getType());
			userWalletLog.setType(OperationType.DEPOSIT_RECHARGE.getType());
			userWalletLog.setOperateUser(applyUserName);
			userWalletLog.setCreateTime(new Date());
			userWalletLog.setAdCode("BJHD");	//需要定位
			userWalletLog.setCityCode("BJ");
			if(lastLog != null) {
				userWalletLog.setMiCoinAmount(lastLog.getMiCoinAmount());
				userWalletLog.setMiCoinAmountChange(lastLog.getMiCoinAmountChange());
				userWalletLog.setRechargeAmount(lastLog.getRechargeAmount());
				userWalletLog.setRechargeAmountChange(lastLog.getRechargeAmountChange());
				userWalletLog.setGiveAmount(lastLog.getGiveAmount());
				userWalletLog.setGiveAmountChange(lastLog.getGiveAmountChange());
			}
			userWalletLogMapper.insert(userWalletLog);
		}else {
			//更新提现申请表审批状态为“支付失败”
			DepositApply depositApply = new DepositApply();
			depositApply.setDid(depositApplyId);
			depositApply.setAuditingState(DepositAuditingStatus.PAY_FAIL.getType());
			depositApply.setModifyTime(new Date());
			depositApplyMapper.updateById(depositApply);
		}
	}
	
	
	public Long addDepositApply(Integer type, Long userId, String userName, String userPhone, BigDecimal applyAmount,
			Long applyUserId, String applyUserName, Integer userMode, String userRealName, String userAccount, Long depositOrderId,
			String capitalReasonName, String applyNode) {

		DepositApply depositApply = new DepositApply();
		if(type == DepositApplyType.WITHDRAW.getType()) {
			depositApply.setApplyType(DepositApplyType.WITHDRAW.getType());
		}
		if(type == DepositApplyType.DEDUCT.getType()) {
			depositApply.setApplyType(DepositApplyType.DEDUCT.getType());
		}
		depositApply.setCapitalReasonName(capitalReasonName);
		depositApply.setApplyNode(applyNode);
		depositApply.setUserId(userId);
		depositApply.setUserName(userName);
		depositApply.setApplyAmount(applyAmount);
		depositApply.setApplyUserId(applyUserId);
		depositApply.setApplyUserName(applyUserName);
		depositApply.setCapitalReasonId(null);	//不知道填啥
		depositApply.setUserMode(userMode);
		depositApply.setUserRealName(userRealName);
		depositApply.setUserAccount(userAccount);	
		//因为没有审批步骤，所以直接审核通过，审核人就是申请人（查押金详情时会用到审批状态为通过的记录，这样可以保证一条押金只有一条状态为通过的申请，查押金详情时不会返回多条数据）
		depositApply.setAuditingState(DepositAuditingStatus.PASS.getType());
		depositApply.setAuditingNote(DepositAuditingStatus.PASS.getName());
		depositApply.setAuditingUserId(applyUserId);	
		depositApply.setAuditingUserName(applyUserName);
		depositApply.setDepositOrderId(depositOrderId);
		depositApply.setCreateTime(new Date());
		depositApplyMapper.insertSelective(depositApply);
		
		return depositApply.getDid();
	}

	@DataSource(name = DataSourceNames.SECOND)
	public Map<String, Object> addRefundRecord(Long userId, BigDecimal amount, Integer refundMethod) {
		Map<String, Object> res = new HashMap<>();
		DynamicDataSource.setDataSource(DataSourceNames.SECOND);
		logger.info("当前数据源：" + DynamicDataSource.getDataSource());
		RefundRecord refundRecord = new RefundRecord();
		String orderNo = UUID.randomUUID().toString();
		refundRecord.setOrderNo(orderNo);
		refundRecord.setRefundAmount(amount);
		refundRecord.setRefundMethod(refundMethod);
		refundRecord.setRefundType(RefundType.DEPOSIT.getType());
		refundRecord.setRefundStatus(RefundStatus.UN_REFUND.getType());
		refundRecord.setUserId(userId);
		refundRecord.setCreateTime(new Date());
		refundRecordMapper.insertSelective(refundRecord);
		
		DynamicDataSource.clearDataSource();
		res.put("refundRecordId", refundRecord.getRefundId());
		res.put("orderNo", orderNo);
		return res;
	}

}
