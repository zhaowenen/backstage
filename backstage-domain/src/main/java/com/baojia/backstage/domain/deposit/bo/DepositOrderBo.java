package com.baojia.backstage.domain.deposit.bo;

import java.util.Date;


/**
* @Title: DepositOrderBo  
* @Description: 押金订单查询列表接口返回
* @author renjing  
* @date 2018年5月23日 下午18:02:49
 */
public class DepositOrderBo {
    private Long depositOrderId;

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
     * 充值时间
     */
    private Date rechargeTime;


    /**
     * 支付方式(1:微信,2:支付宝)
     */
    private Integer payMethod;


    /**
     * 退款时间
     */
    private Date refundTime;
    
    
	public Long getDepositOrderId() {
		return depositOrderId;
	}


	public void setDepositOrderId(Long depositOrderId) {
		this.depositOrderId = depositOrderId;
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


	public Date getRechargeTime() {
		return rechargeTime;
	}


	public void setRechargeTime(Date rechargeTime) {
		this.rechargeTime = rechargeTime;
	}


	public Integer getPayMethod() {
		return payMethod;
	}


	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}


	public Date getRefundTime() {
		return refundTime;
	}


	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
	}

}