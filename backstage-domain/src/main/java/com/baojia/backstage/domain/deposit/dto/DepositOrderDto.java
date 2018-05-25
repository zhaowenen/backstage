package com.baojia.backstage.domain.deposit.dto;


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
	private String startTime;

	/**
	 * 结束时间
	 */
	private String endTime;

	/**
	 * 支付方式(1:微信,2:支付宝)
	 */
	private Integer payMethod;


	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getPayMethod() {
		return payMethod;
	}

	public void setPayMethod(Integer payMethod) {
		this.payMethod = payMethod;
	}

}