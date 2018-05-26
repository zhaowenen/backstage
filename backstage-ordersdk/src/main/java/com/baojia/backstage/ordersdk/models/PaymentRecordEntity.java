package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: payment_record_0
@mbggenerated do_not_delete_during_merge 2018-05-26 10:47:15
 */
@TableName("payment_record")
public class PaymentRecordEntity implements Serializable {
    /**
     * Column: payment_record_0.payment_id
    @mbggenerated 2018-05-26 10:47:15
     */
    private Long paymentId;

    /**
     *   ������
     * Column: payment_record_0.order_no
    @mbggenerated 2018-05-26 10:47:15
     */
    private String orderNo;

    /**
     *   ֧������ 100-�ó� 200-��ֵѺ�� 300-��ֵ�۱�
     * Column: payment_record_0.payment_type
    @mbggenerated 2018-05-26 10:47:15
     */
    private Integer paymentType;

    /**
     *   ֧��״̬ 0-δ֧�� 100 -֧���ɹ�
     * Column: payment_record_0.pay_status
    @mbggenerated 2018-05-26 10:47:15
     */
    private Integer payStatus;

    /**
     *   ֧�����
     * Column: payment_record_0.pay_amount
    @mbggenerated 2018-05-26 10:47:15
     */
    private BigDecimal payAmount;

    /**
     *   �̻�������
     * Column: payment_record_0.out_trade_no
    @mbggenerated 2018-05-26 10:47:15
     */
    private String outTradeNo;

    /**
     *   ֧��ʱ��
     * Column: payment_record_0.pay_time
    @mbggenerated 2018-05-26 10:47:15
     */
    private Date payTime;

    /**
     *   ֧����ʽ 100 -΢�� 200 -֧���� 
     * Column: payment_record_0.pay_method
    @mbggenerated 2018-05-26 10:47:15
     */
    private Integer payMethod;

    /**
     *   ����ʱ��
     * Column: payment_record_0.create_time
    @mbggenerated 2018-05-26 10:47:15
     */
    private Date createTime;

    /**
     *   �޸�ʱ��
     * Column: payment_record_0.modify_time
    @mbggenerated 2018-05-26 10:47:15
     */
    private Date modifyTime;

    /**
     * Column: payment_record_0.user_id
    @mbggenerated 2018-05-26 10:47:15
     */
    private Long userId;

    /**
     * Table: payment_record_0
    @mbggenerated 2018-05-26 10:47:15
     */
    private static final long serialVersionUID = 1L;

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}