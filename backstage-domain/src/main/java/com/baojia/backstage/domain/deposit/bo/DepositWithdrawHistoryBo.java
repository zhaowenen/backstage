package com.baojia.backstage.domain.deposit.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
* @Title: DepositWithdrawHistoryBo  
* @Description: 押金扣款记录查询列表接口返回
* @author renjing  
* @date 2018年5月23日 下午19:17:57
 */
public class DepositWithdrawHistoryBo implements Serializable{
	private Long id;

    /**
     * 用户姓名
     */
    private String userName;
    
    /**
     * 用户手机号
     */
    private String mobile;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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