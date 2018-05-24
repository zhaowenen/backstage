package com.baojia.backstage.domain.deposit.dto;

import java.util.Date;

/**
* @Title: DepositWithdrawHistoryDto  
* @Description:  押金扣款记录查询列表前端传入参数
* @author renjing  
* @date 2018年5月23日 下午7:13:44
 */
public class DepositWithdrawHistoryDto {
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
    
}