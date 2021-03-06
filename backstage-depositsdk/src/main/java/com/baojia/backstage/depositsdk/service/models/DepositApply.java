package com.baojia.backstage.depositsdk.service.models;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
* @Title: DepositApply  
* @Description: 押金扣款/提现申请表
* @author renjing  
* @date 2018年5月23日 上午11:38:49
 */
@TableName("deposit_apply")
public class DepositApply {
    /**
     * 主键
     */
    private Long did;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 用户手机号
     */
    private String userPhone;

    /**
     * 申请类型 200提现, 300扣款
     */
    private Integer applyType;

    /**
     * 申请金额  正数
     */
    private BigDecimal applyAmount;

    /**
     * 申请人ID
     */
    private Long applyUserId;

    /**
     * 申请人姓名
     */
    private String applyUserName;

    /**
     * 资金类型ID 
     */
    private Long capitalReasonId;

    /**
     * 申请原因
     */
    private String capitalReasonName;

    /**
     * 说明
     */
    private String applyNode;

    /**
     * 用户收款方式 100微信、200支付宝、300银行
     */
    private Integer userMode;

    /**
     * 收款人真实姓名
     */
    private String userRealName;

    /**
     * 收款帐号
     */
    private String userAccount;

    /**
     * 审批状态 100待审核,200审核通过, 300审核拒绝,400支付成功,500支付失败
     */
    private Integer auditingState;

    /**
     * 审批人姓名
     */
    private String auditingUserName;

    /**
     * 审批人ID
     */
    private Long auditingUserId;

    /**
     * 审批说明
     */
    private String auditingNote;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;
    
    /**
     * 押金订单ID
     */
    private Long depositOrderId;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    public Long getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(Long applyUserId) {
        this.applyUserId = applyUserId;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public Long getCapitalReasonId() {
        return capitalReasonId;
    }

    public void setCapitalReasonId(Long capitalReasonId) {
        this.capitalReasonId = capitalReasonId;
    }

    public String getCapitalReasonName() {
        return capitalReasonName;
    }

    public void setCapitalReasonName(String capitalReasonName) {
        this.capitalReasonName = capitalReasonName == null ? null : capitalReasonName.trim();
    }

    public String getApplyNode() {
        return applyNode;
    }

    public void setApplyNode(String applyNode) {
        this.applyNode = applyNode == null ? null : applyNode.trim();
    }

    public Integer getUserMode() {
        return userMode;
    }

    public void setUserMode(Integer userMode) {
        this.userMode = userMode;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName == null ? null : userRealName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Integer getAuditingState() {
        return auditingState;
    }

    public void setAuditingState(Integer auditingState) {
        this.auditingState = auditingState;
    }

    public String getAuditingUserName() {
        return auditingUserName;
    }

    public void setAuditingUserName(String auditingUserName) {
        this.auditingUserName = auditingUserName == null ? null : auditingUserName.trim();
    }

    public Long getAuditingUserId() {
        return auditingUserId;
    }

    public void setAuditingUserId(Long auditingUserId) {
        this.auditingUserId = auditingUserId;
    }

    public String getAuditingNote() {
        return auditingNote;
    }

    public void setAuditingNote(String auditingNote) {
        this.auditingNote = auditingNote == null ? null : auditingNote.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

	public Long getDepositOrderId() {
		return depositOrderId;
	}

	public void setDepositOrderId(Long depositOrderId) {
		this.depositOrderId = depositOrderId;
	}
    
}