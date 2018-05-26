package com.baojia.backstage.domain.user.bo;

import java.awt.print.PrinterGraphics;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 业务对象 封装类型 押金记录
 * @Auther: YUANEL
 * @Date: 2018/5/25 16:46
 * @Description:
 */
public class DepositLogBo implements Serializable {

    private String id;
    private Date payTime;//缴纳时间
    private String payPlatform;//缴纳平台
    private String pay_method;//支付方式 1微信 2支付宝
    private BigDecimal rechargeAmount;//支付金额
    private Integer status;//是否已提现      2提现
    private Integer refundType;//提现方式


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(String payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getPay_method() {
        return pay_method;
    }

    public void setPay_method(String pay_method) {
        this.pay_method = pay_method;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }
}
