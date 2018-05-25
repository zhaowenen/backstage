package com.baojia.backstage.domain.deposit.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Title: DepositApply
 * @Description: 押金扣款/提现申请查询列表接口返回
 * @author renjing
 * @date 2018年5月23日 上午11:38:49
 */
public class DepositApplyBo implements Serializable {
	/**
	 * 主键
	 */
	private Long did;

	/**
	 * 用户姓名
	 */
	private String userName;

	/**
	 * 用户手机号
	 */
	private String userPhone;

	/**
	 * 申请金额 正数
	 */
	private BigDecimal applyAmount;

	/**
	 * 申请人姓名
	 */
	private String applyUserName;

	/**
	 * 说明
	 */
	private String applyNode;

	/**
	 * 修改时间
	 */
	private Date modifyTime;

	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone == null ? null : userPhone.trim();
	}

	public BigDecimal getApplyAmount() {
		return applyAmount;
	}

	public void setApplyAmount(BigDecimal applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName == null ? null : applyUserName.trim();
	}

	public String getApplyNode() {
		return applyNode;
	}

	public void setApplyNode(String applyNode) {
		this.applyNode = applyNode == null ? null : applyNode.trim();
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
}