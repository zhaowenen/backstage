package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wxr
 * @Title: 订单表
 * @date 2018/5/22 14:02
 */
@TableName("orders")
public class OrdersEntity{
    /**
     * Column: orders.order_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long orderId;

    /**
     *   订单号
     * Column: orders.order_no
     @mbggenerated 2018-05-22 13:57:34
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders.user_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long userId;

    /**
     *   车辆id
     * Column: orders.bike_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long bikeId;

    /**
     *   订单状态
     * Column: orders.order_status
     @mbggenerated 2018-05-22 13:57:34
     */
    private Integer orderStatus;

    /**
     *   订单金额
     * Column: orders.order_amount
     @mbggenerated 2018-05-22 13:57:34
     */
    private BigDecimal orderAmount;

    /**
     *   支付状态 0-未支付 100支付成功
     * Column: orders.pay_status
     @mbggenerated 2018-05-22 13:57:34
     */
    private Integer payStatus;

    /**
     *   支付方式 1 -微信 2 -支付宝 3 - 蜜币
     * Column: orders.pay_method
     @mbggenerated 2018-05-22 13:57:34
     */
    private Integer payMethod;

    /**
     *   支付金额
     * Column: orders.pay_amount
     @mbggenerated 2018-05-22 13:57:34
     */
    private Integer payAmount;

    /**
     *   支付时间
     * Column: orders.pay_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date payTime;

    /**
     *   运营区id
     * Column: orders.operate_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long operateId;

    /**
     *   公司id
     * Column: orders.company_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long companyId;

    /**
     *   城市code
     * Column: orders.city_code
     @mbggenerated 2018-05-22 13:57:34
     */
    private String cityCode;

    /**
     *   县区code
     * Column: orders.ad_code
     @mbggenerated 2018-05-22 13:57:34
     */
    private String adCode;

    /**
     *   活动id
     * Column: orders.activity_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long activityId;

    /**
     *   活动抵扣金额
     * Column: orders.activity_amount
     @mbggenerated 2018-05-22 13:57:34
     */
    private BigDecimal activityAmount;

    /**
     *   优惠券id
     * Column: orders.coupon_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long couponId;

    /**
     *   优惠券抵扣金额
     * Column: orders.coupon_amount
     @mbggenerated 2018-05-22 13:57:34
     */
    private BigDecimal couponAmount;

    /**
     *   创建时间
     * Column: orders.create_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders.modify_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date modifyTime;

    /**
     * Table: orders
     @mbggenerated 2018-05-22 13:57:34
     */
    private static final long serialVersionUID = 1L;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
        this.payAmount = payAmount;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
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

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public BigDecimal getActivityAmount() {
        return activityAmount;
    }

    public void setActivityAmount(BigDecimal activityAmount) {
        this.activityAmount = activityAmount;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
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
