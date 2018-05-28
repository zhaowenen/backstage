package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: orders_0
 @mbggenerated do_not_delete_during_merge 2018-05-26 10:47:12
 */
@TableName("orders")
public class OrdersEntity implements Serializable {
    /**
     * Column: orders_0.order_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long orderId;

    /**
     *   订单号
     * Column: orders_0.order_no
     @mbggenerated 2018-05-26 10:47:12
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders_0.user_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long userId;

    /**
     *   车辆id
     * Column: orders_0.bike_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long bikeId;

    /**
     *   订单状态 100-已预约 200-已取车 300-已还车 400-已取消
     * Column: orders_0.order_status
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer orderStatus;

    /**
     *   取消类型 100-用户取消 200-人工取消 300-超时取消 400-扫码不是本车辆导致的取消
     * Column: orders_0.cancel_type
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer cancelType;

    /**
     *   还车类型 100-用户还车 200-人工还车
     * Column: orders_0.return_type
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer returnType;

    /**
     *   下单类型 1-预约用车 2-扫码用车
     * Column: orders_0.order_type
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer orderType;

    /**
     *   订单金额
     * Column: orders_0.order_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private BigDecimal orderAmount;

    /**
     *   支付状态 0-未支付 100支付成功
     * Column: orders_0.pay_status
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer payStatus;

    /**
     *   支付方式 100 -微信 200 -支付宝 300 - 蜜币
     * Column: orders_0.pay_method
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer payMethod;

    /**
     *   支付金额
     * Column: orders_0.pay_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private Integer payAmount;

    /**
     *   支付时间
     * Column: orders_0.pay_time
     @mbggenerated 2018-05-26 10:47:12
     */
    private Date payTime;

    /**
     *   运营区id
     * Column: orders_0.operate_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long operateId;

    /**
     *   公司id
     * Column: orders_0.company_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long companyId;

    /**
     *   城市code
     * Column: orders_0.city_code
     @mbggenerated 2018-05-26 10:47:12
     */
    private String cityCode;

    /**
     *   县区code
     * Column: orders_0.ad_code
     @mbggenerated 2018-05-26 10:47:12
     */
    private String adCode;

    /**
     *   活动id
     * Column: orders_0.activity_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long activityId;

    /**
     *   活动抵扣金额
     * Column: orders_0.activity_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private BigDecimal activityAmount;

    /**
     *   优惠券id
     * Column: orders_0.coupon_id
     @mbggenerated 2018-05-26 10:47:12
     */
    private Long couponId;

    /**
     *   优惠券抵扣金额
     * Column: orders_0.coupon_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private BigDecimal couponAmount;

    /**
     *   蜜币支付时花费赠送蜜币数量
     * Column: orders_0.give_mi_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private BigDecimal giveMiAmount;

    /**
     *   蜜币支付时花费充值蜜币数量
     * Column: orders_0.mi_amount
     @mbggenerated 2018-05-26 10:47:12
     */
    private BigDecimal miAmount;

    /**
     *   创建时间
     * Column: orders_0.create_time
     @mbggenerated 2018-05-26 10:47:12
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_0.modify_time
     @mbggenerated 2018-05-26 10:47:12
     */
    private Date modifyTime;

    /**
     * Table: orders_0
     @mbggenerated 2018-05-26 10:47:12
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

    public Integer getCancelType() {
        return cancelType;
    }

    public void setCancelType(Integer cancelType) {
        this.cancelType = cancelType;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public BigDecimal getGiveMiAmount() {
        return giveMiAmount;
    }

    public void setGiveMiAmount(BigDecimal giveMiAmount) {
        this.giveMiAmount = giveMiAmount;
    }

    public BigDecimal getMiAmount() {
        return miAmount;
    }

    public void setMiAmount(BigDecimal miAmount) {
        this.miAmount = miAmount;
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
