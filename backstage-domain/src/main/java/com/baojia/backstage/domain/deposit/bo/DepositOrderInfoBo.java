package com.baojia.backstage.domain.deposit.bo;

import java.math.BigDecimal;
import java.util.Date;


/**
* @Title: DepositOrderInfoBo  
* @Description: 押金订单详情接口返回
* @author renjing  
* @date 2018年5月23日 下午18:52:29
 */
public class DepositOrderInfoBo {
    private Long depositOrderId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户姓名
     */
    private String userName;
    
    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 订单状态
     */
    private Integer status;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付方式(1:微信,2:支付宝)
     */
    private Integer payMethod;

    /**
     * 提现方式(1:原路退款)
     */
    private Integer refundType;

    /**
     * 提现时间
     */
    private Date refundTime;

    /**
     * 提现账号
     */
    private String accountNumber;

    /**
     * 操作人
     */
    private String opsUser;

    /**
     * 扣款时间
     */
    private Date deductMoneyTime;
    
    /**
     * 扣除金额
     */
    private BigDecimal deductAmount;
    
    /**
     * 扣款备注
     */
    private String deductMoneyMemo;

	public Long getDepositOrderId() {
		return depositOrderId;
	}

	public void setDepositOrderId(Long depositOrderId) {
		this.depositOrderId = depositOrderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
	}

	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOpsUser() {
		return opsUser;
	}

	public void setOpsUser(String opsUser) {
		this.opsUser = opsUser;
	}

	public Date getDeductMoneyTime() {
		return deductMoneyTime;
	}

	public void setDeductMoneyTime(Date deductMoneyTime) {
		this.deductMoneyTime = deductMoneyTime;
	}

	public BigDecimal getDeductAmount() {
		return deductAmount;
	}

	public void setDeductAmount(BigDecimal deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getDeductMoneyMemo() {
		return deductMoneyMemo;
	}

	public void setDeductMoneyMemo(String deductMoneyMemo) {
		this.deductMoneyMemo = deductMoneyMemo;
	}
    
}