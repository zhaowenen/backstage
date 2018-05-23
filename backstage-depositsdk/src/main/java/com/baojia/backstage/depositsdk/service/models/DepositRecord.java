package com.baojia.backstage.depositsdk.service.models;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
* @Title: DepositApply  
* @Description: 押金交易记录表
* @author renjing  
* @date 2018年5月23日 上午11:38:49
 */
@TableName("deposit_record")
public class DepositRecord {
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
     * 交易类型 100缴纳, 200提现, 300扣款
     */
    private Short recordType;

    /**
     * 申请表id
     */
    private Long applyId;

    /**
     * 记录金额 正数
     */
    private BigDecimal recordAmount;

    /**
     * 支付途径 100微信原路退回,200支付宝原路退回, 300银联转帐,400微信转帐,500支付宝转帐
     */
    private Short payType;

    /**
     * 用户帐号
     */
    private String userAccount;

    /**
     * 支付交易号
     */
    private String payTradeId;

    /**
     * 支付状态 0表示失败 1表示成功
     */
    private Short payState;

    /**
     * 创建时间
     */
    private Date createTime;

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

    public Short getRecordType() {
        return recordType;
    }

    public void setRecordType(Short recordType) {
        this.recordType = recordType;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    public BigDecimal getRecordAmount() {
        return recordAmount;
    }

    public void setRecordAmount(BigDecimal recordAmount) {
        this.recordAmount = recordAmount;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getPayTradeId() {
        return payTradeId;
    }

    public void setPayTradeId(String payTradeId) {
        this.payTradeId = payTradeId == null ? null : payTradeId.trim();
    }

    public Short getPayState() {
        return payState;
    }

    public void setPayState(Short payState) {
        this.payState = payState;
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
}