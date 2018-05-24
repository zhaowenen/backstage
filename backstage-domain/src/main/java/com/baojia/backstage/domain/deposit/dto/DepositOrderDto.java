package com.baojia.backstage.domain.deposit.dto;

import java.util.Date;

import com.baojia.backstage.domain.common.BaseDto;

/**
 * @Title: DepositOrderDto
 * @Description: 押金订单列表前端传入参数
 * @author renjing
 * @date 2018年5月23日 下午17:55:49
 */
public class DepositOrderDto extends BaseDto {

	/**
	 * 订单状态
	 */
	private Integer status;

	/**
	 * 开始时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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