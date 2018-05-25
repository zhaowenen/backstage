package com.baojia.backstage.domain.deposit.dto;


import com.baojia.backstage.domain.common.BaseDto;


/**
* @Title: DepositApply  
* @Description: 押金扣款/提现申请记录前端传入参数
* @author renjing  
* @date 2018年5月23日 上午11:38:49
 */
public class DepositApplyDto extends BaseDto{
	/**
	 * 开始时间
	 */
	private String startTime;

	/**
	 * 结束时间
	 */
	private String endTime;
	
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
	
}