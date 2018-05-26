package com.baojia.backstage.usersdk.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: user_wallet
@mbggenerated do_not_delete_during_merge 2018-05-24 16:56:21
 */
public class UserWalletEntity implements Serializable {
    /**
     * Column: user_wallet.id
    @mbggenerated 2018-05-24 16:56:21
     */
    private Long id;

    /**
     *   �û�ID
     * Column: user_wallet.user_id
    @mbggenerated 2018-05-24 16:56:21
     */
    private String userId;

    /**
     *   ��ֵѺ��״̬(1:�ѽ�,2:δ��)
     * Column: user_wallet.recharge_status
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer rechargeStatus;

    /**
     *   Ѻ����
     * Column: user_wallet.deposit_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer depositAmount;

    /**
     *   Ѻ������״̬(1:δ����,2:����)
     * Column: user_wallet.lock_status
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer lockStatus;

    /**
     *   Ѻ����Դ(1:С��,2:�۷�)
     * Column: user_wallet.deposit_from
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer depositFrom;

    /**
     *   Ѻ���ֵʱ��
     * Column: user_wallet.deposit_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date depositTime;

    /**
     *   ������(�ߵ�)
     * Column: user_wallet.city_code
    @mbggenerated 2018-05-24 16:56:21
     */
    private String cityCode;

    /**
     *   ��������(�ߵ�)
     * Column: user_wallet.ad_code
    @mbggenerated 2018-05-24 16:56:21
     */
    private String adCode;

    /**
     *   �۱��ܽ��
     * Column: user_wallet.mi_coin_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal miCoinAmount;

    /**
     *   ��ֵ���
     * Column: user_wallet.recharge_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal rechargeAmount;

    /**
     *   ���ͽ��
     * Column: user_wallet.give_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal giveAmount;

    /**
     *   �Ƿ�ɾ�� 0-��ɾ�� 1-δɾ��
     * Column: user_wallet.del_flag
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer delFlag;

    /**
     *   ����ʱ��
     * Column: user_wallet.create_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date createTime;

    /**
     *   �޸�ʱ��
     * Column: user_wallet.modify_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date modifyTime;

    /**
     * Table: user_wallet
    @mbggenerated 2018-05-24 16:56:21
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getGiveAmount() {
        return giveAmount;
    }

    public void setGiveAmount(BigDecimal giveAmount) {
        this.giveAmount = giveAmount;
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
}