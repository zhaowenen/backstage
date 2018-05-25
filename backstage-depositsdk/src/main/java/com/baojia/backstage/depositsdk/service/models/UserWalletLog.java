package com.baojia.backstage.depositsdk.service.models;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
* @Title: UserWalletLog  
* @Description:  钱包操作记录表
* @author renjing  
* @date 2018年5月25日 下午12:03:35
 */
@TableName("user_wallet_log")
public class UserWalletLog {
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 充值押金状态(1:已交,2:未交)
     */
    private Integer rechargeStatus;

    /**
     * 押金金额
     */
    private Integer depositAmount;

    /**
     * 押金变化金额
     */
    private BigDecimal depositAmountChange;

    /**
     * 押金锁定状态(1:未锁定,2:锁定)
     */
    private Integer lockStatus;

    /**
     * 押金来源(1:小蜜,2:蜜蜂)
     */
    private Integer depositFrom;

    /**
     * 押金充值时间
     */
    private Date depositTime;

    /**
     * 城市码(高德)
     */
    private String cityCode;

    /**
     * 地区编码(高德)
     */
    private String adCode;

    /**
     * 蜜币总金额
     */
    private BigDecimal miCoinAmount;

    /**
     * 蜜币总额变化
     */
    private BigDecimal miCoinAmountChange;

    /**
     * 充值金额
     */
    private BigDecimal rechargeAmount;

    /**
     * 充值金额变化
     */
    private BigDecimal rechargeAmountChange;

    /**
     * 赠送金额
     */
    private BigDecimal giveAmount;

    /**
     * 赠送金额变化
     */
    private BigDecimal giveAmountChange;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 操作类型(1:押金充值,2:押金退款,3:蜜币充值,4:蜜币消费,5:解锁押金,6:锁定押金)
     */
    private Integer type;

    /**
     * 是否删除 0-已删除 1-未删除
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 备注
     */
    private String remarks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRechargeStatus() {
        return rechargeStatus;
    }

    public void setRechargeStatus(Integer rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    public Integer getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Integer depositAmount) {
        this.depositAmount = depositAmount;
    }

    public BigDecimal getDepositAmountChange() {
        return depositAmountChange;
    }

    public void setDepositAmountChange(BigDecimal depositAmountChange) {
        this.depositAmountChange = depositAmountChange;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public Integer getDepositFrom() {
        return depositFrom;
    }

    public void setDepositFrom(Integer depositFrom) {
        this.depositFrom = depositFrom;
    }

    public Date getDepositTime() {
        return depositTime;
    }

    public void setDepositTime(Date depositTime) {
        this.depositTime = depositTime;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode == null ? null : adCode.trim();
    }

    public BigDecimal getMiCoinAmount() {
        return miCoinAmount;
    }

    public void setMiCoinAmount(BigDecimal miCoinAmount) {
        this.miCoinAmount = miCoinAmount;
    }

    public BigDecimal getMiCoinAmountChange() {
        return miCoinAmountChange;
    }

    public void setMiCoinAmountChange(BigDecimal miCoinAmountChange) {
        this.miCoinAmountChange = miCoinAmountChange;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getRechargeAmountChange() {
        return rechargeAmountChange;
    }

    public void setRechargeAmountChange(BigDecimal rechargeAmountChange) {
        this.rechargeAmountChange = rechargeAmountChange;
    }

    public BigDecimal getGiveAmount() {
        return giveAmount;
    }

    public void setGiveAmount(BigDecimal giveAmount) {
        this.giveAmount = giveAmount;
    }

    public BigDecimal getGiveAmountChange() {
        return giveAmountChange;
    }

    public void setGiveAmountChange(BigDecimal giveAmountChange) {
        this.giveAmountChange = giveAmountChange;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}