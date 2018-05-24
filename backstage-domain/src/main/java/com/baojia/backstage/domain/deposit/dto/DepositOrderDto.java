package com.baojia.backstage.domain.deposit.dto;


import java.util.Date;

import com.baojia.backstage.domain.common.BaseDto;

/**
* @Title: DepositOrderDto  
* @Description: 押金订单列表前端传入参数
* @author renjing  
* @date 2018年5月23日 下午17:55:49
 */
public class DepositOrderDto extends BaseDto{
	
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
     * 用户手机号
     */
    private String mobile;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
    
}