package com.baojia.backstage.depositsdk.service.models;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
* @Title: RefundRecord  
* @Description: 退款流水表 
* @author renjing  
* @date 2018年5月25日 下午6:23:02
 */
@TableName("refund_record")
public class RefundRecord {
    private Long refundId;

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 退款类型 1-用车 2-充值押金 3-充值蜜币
     */
    private Integer refundType;

    /**
     * 退款状态 0-未退款 100 -退款中 200-退款成功
     */
    private Integer refundStatus;

    /**
     * 退款金额
     */
    private BigDecimal refundAmount;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 退款时间
     */
    private Date refundTime;

    /**
     * 退款方式 1 -微信 2 -支付宝 
     */
    private Integer refundMethod;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private Long userId;

    public Long getRefundId() {
        return refundId;
    }

    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Date getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getRefundMethod() {
        return refundMethod;
    }

    public void setRefundMethod(Integer refundMethod) {
        this.refundMethod = refundMethod;
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