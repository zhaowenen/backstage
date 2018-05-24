package com.baojia.backstage.domain.deposit.dto;



import com.baojia.backstage.domain.common.BaseDto;

/**
* @Title: DepositOrderInfoDto  
* @Description: 押金订单详情前端传入参数
* @author renjing  
* @date 2018年5月23日 下午18:42:09
 */
public class DepositOrderInfoDto extends BaseDto{
	
	private Long depositOrderId;

	public Long getDepositOrderId() {
		return depositOrderId;
	}

	public void setDepositOrderId(Long depositOrderId) {
		this.depositOrderId = depositOrderId;
	}
}