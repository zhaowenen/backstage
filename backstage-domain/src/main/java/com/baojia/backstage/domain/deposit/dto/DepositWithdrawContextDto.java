package com.baojia.backstage.domain.deposit.dto;

import java.math.BigDecimal;

/**
* @Title: DepositWithdrawContextDto  
* @Description:  添加押金扣款内容前端传入参数
* @author renjing  
* @date 2018年5月23日 下午8:45:24
 */
public class DepositWithdrawContextDto {
	/**
     * 扣除金额
     */
    private BigDecimal deductAmount;
    
    /**
     * 扣款原因
     */
    private String cause;
    
    /**
     * 扣款备注
     */
    private String deductMoneyMemo;

	public BigDecimal getDeductAmount() {
		return deductAmount;
	}

	public void setDeductAmount(BigDecimal deductAmount) {
		this.deductAmount = deductAmount;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDeductMoneyMemo() {
		return deductMoneyMemo;
	}

	public void setDeductMoneyMemo(String deductMoneyMemo) {
		this.deductMoneyMemo = deductMoneyMemo;
	}

}