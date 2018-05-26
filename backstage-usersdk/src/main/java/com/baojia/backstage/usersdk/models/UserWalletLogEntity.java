package com.baojia.backstage.usersdk.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: user_wallet_log
@mbggenerated do_not_delete_during_merge 2018-05-24 16:56:21
 */
public class UserWalletLogEntity implements Serializable {
    /**
     * Column: user_wallet_log.id
    @mbggenerated 2018-05-24 16:56:21
     */
    private Long id;

    /**
     *   �û�ID
     * Column: user_wallet_log.user_id
    @mbggenerated 2018-05-24 16:56:21
     */
    private Long userId;

    /**
     *   ��ֵѺ��״̬(1:�ѽ�,2:δ��)
     * Column: user_wallet_log.recharge_status
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer rechargeStatus;

    /**
     *   Ѻ����
     * Column: user_wallet_log.deposit_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer depositAmount;

    /**
     *   Ѻ��仯���
     * Column: user_wallet_log.deposit_amount _change
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal depositAmountChange;

    /**
     *   Ѻ������״̬(1:δ����,2:����)
     * Column: user_wallet_log.lock_status
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer lockStatus;

    /**
     *   Ѻ����Դ(1:С��,2:�۷�)
     * Column: user_wallet_log.deposit_from
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer depositFrom;

    /**
     *   Ѻ���ֵʱ��
     * Column: user_wallet_log.deposit_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date depositTime;

    /**
     *   ������(�ߵ�)
     * Column: user_wallet_log.city_code
    @mbggenerated 2018-05-24 16:56:21
     */
    private String cityCode;

    /**
     *   ��������(�ߵ�)
     * Column: user_wallet_log.ad_code
    @mbggenerated 2018-05-24 16:56:21
     */
    private String adCode;

    /**
     *   �۱��ܽ��
     * Column: user_wallet_log.mi_coin_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal miCoinAmount;

    /**
     *   �۱��ܶ�仯
     * Column: user_wallet_log.mi_coin_amount_change
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal miCoinAmountChange;

    /**
     *   ��ֵ���
     * Column: user_wallet_log.recharge_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal rechargeAmount;

    /**
     *   ��ֵ���仯
     * Column: user_wallet_log.recharge_amount_change
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal rechargeAmountChange;

    /**
     *   ���ͽ��
     * Column: user_wallet_log.give_amount
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal giveAmount;

    /**
     *   ���ͽ��仯
     * Column: user_wallet_log.give_amount _change
    @mbggenerated 2018-05-24 16:56:21
     */
    private BigDecimal giveAmountChange;

    /**
     *   ������
     * Column: user_wallet_log.order_no
    @mbggenerated 2018-05-24 16:56:21
     */
    private String orderNo;

    /**
     *   ��������(1:Ѻ���ֵ,2:Ѻ���˿�,3:�۱ҳ�ֵ,4:�۱�����)
     * Column: user_wallet_log.type
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer type;

    /**
     *   �Ƿ�ɾ�� 0-��ɾ�� 1-δɾ��
     * Column: user_wallet_log.del_flag
    @mbggenerated 2018-05-24 16:56:21
     */
    private Integer delFlag;

    /**
     *   ����ʱ��
     * Column: user_wallet_log.create_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date createTime;

    /**
     *   �޸�ʱ��
     * Column: user_wallet_log.modify_time
    @mbggenerated 2018-05-24 16:56:21
     */
    private Date modifyTime;

    /**
     *   ��ע
     * Column: user_wallet_log.remarks
    @mbggenerated 2018-05-24 16:56:21
     */
    private String remarks;

    /**
     * Table: user_wallet_log
    @mbggenerated 2018-05-24 16:56:21
     */
    private static final long serialVersionUID = 1L;

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