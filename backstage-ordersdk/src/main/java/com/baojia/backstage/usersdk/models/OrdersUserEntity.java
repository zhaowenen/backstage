package com.baojia.backstage.usersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: orders_user_0
 @mbggenerated do_not_delete_during_merge 2018-05-26 10:47:14
 */
@TableName("orders_user")
public class OrdersUserEntity implements Serializable {
    /**
     * Column: orders_user_0.orders_user_id
     @mbggenerated 2018-05-26 10:47:14
     */
    private Long ordersUserId;

    /**
     *   订单号
     * Column: orders_user_0.order_no
     @mbggenerated 2018-05-26 10:47:14
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders_user_0.user_id
     @mbggenerated 2018-05-26 10:47:14
     */
    private Long userId;

    /**
     *   用户手机号
     * Column: orders_user_0.user_mobile
     @mbggenerated 2018-05-26 10:47:14
     */
    private String userMobile;

    /**
     *   用车开始时间
     * Column: orders_user_0.begin_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date beginTime;

    /**
     *   用车结束时间
     * Column: orders_user_0.end_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date endTime;

    /**
     *   预约用车时间
     * Column: orders_user_0.reserve_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date reserveTime;

    /**
     *   预约到期时间
     * Column: orders_user_0.reserve_end_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date reserveEndTime;

    /**
     *   订单时长 分钟
     * Column: orders_user_0.order_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Integer orderTime;

    /**
     *   取车用户纬度 高德
     * Column: orders_user_0.take_user_latitude
     @mbggenerated 2018-05-26 10:47:14
     */
    private Double takeUserLatitude;

    /**
     *   还车用户经度 高德
     * Column: orders_user_0.take_user_longitude
     @mbggenerated 2018-05-26 10:47:14
     */
    private Double takeUserLongitude;

    /**
     *   还车用户纬度 高德
     * Column: orders_user_0.return_user_latitude
     @mbggenerated 2018-05-26 10:47:14
     */
    private Double returnUserLatitude;

    /**
     *   还车用户经度 高德
     * Column: orders_user_0.return_user_longitude
     @mbggenerated 2018-05-26 10:47:14
     */
    private Double returnUserLongitude;

    /**
     *   用户手机取车地址
     * Column: orders_user_0.user_take_adress
     @mbggenerated 2018-05-26 10:47:14
     */
    private String userTakeAdress;

    /**
     *   用户手机还车地址
     * Column: orders_user_0.user_return_adress
     @mbggenerated 2018-05-26 10:47:14
     */
    private String userReturnAdress;

    /**
     *   app版本
     * Column: orders_user_0.app_version
     @mbggenerated 2018-05-26 10:47:14
     */
    private String appVersion;

    /**
     *   订单来源app 100- 小蜜 200-蜜蜂
     * Column: orders_user_0.app_from
     @mbggenerated 2018-05-26 10:47:14
     */
    private Integer appFrom;

    /**
     *   设备类型 1-ios 2-android
     * Column: orders_user_0.device_type
     @mbggenerated 2018-05-26 10:47:14
     */
    private Integer deviceType;

    /**
     *   费用详情
     * Column: orders_user_0.fee_detail
     @mbggenerated 2018-05-26 10:47:14
     */
    private String feeDetail;

    /**
     *   是否收取调度费 0-不收取 1-收取
     * Column: orders_user_0.is_dispatch
     @mbggenerated 2018-05-26 10:47:14
     */
    private Integer isDispatch;

    /**
     *   调度费金额
     * Column: orders_user_0.dispath_fee
     @mbggenerated 2018-05-26 10:47:14
     */
    private BigDecimal dispathFee;

    /**
     *   创建时间
     * Column: orders_user_0.create_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_user_0.modify_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date modifyTime;

    /**
     * Table: orders_user_0
     @mbggenerated 2018-05-26 10:47:14
     */
    private static final long serialVersionUID = 1L;

    public Long getOrdersUserId() {
        return ordersUserId;
    }

    public void setOrdersUserId(Long ordersUserId) {
        this.ordersUserId = ordersUserId;
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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public Date getReserveEndTime() {
        return reserveEndTime;
    }

    public void setReserveEndTime(Date reserveEndTime) {
        this.reserveEndTime = reserveEndTime;
    }

    public Integer getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Integer orderTime) {
        this.orderTime = orderTime;
    }

    public Double getTakeUserLatitude() {
        return takeUserLatitude;
    }

    public void setTakeUserLatitude(Double takeUserLatitude) {
        this.takeUserLatitude = takeUserLatitude;
    }

    public Double getTakeUserLongitude() {
        return takeUserLongitude;
    }

    public void setTakeUserLongitude(Double takeUserLongitude) {
        this.takeUserLongitude = takeUserLongitude;
    }

    public Double getReturnUserLatitude() {
        return returnUserLatitude;
    }

    public void setReturnUserLatitude(Double returnUserLatitude) {
        this.returnUserLatitude = returnUserLatitude;
    }

    public Double getReturnUserLongitude() {
        return returnUserLongitude;
    }

    public void setReturnUserLongitude(Double returnUserLongitude) {
        this.returnUserLongitude = returnUserLongitude;
    }

    public String getUserTakeAdress() {
        return userTakeAdress;
    }

    public void setUserTakeAdress(String userTakeAdress) {
        this.userTakeAdress = userTakeAdress == null ? null : userTakeAdress.trim();
    }

    public String getUserReturnAdress() {
        return userReturnAdress;
    }

    public void setUserReturnAdress(String userReturnAdress) {
        this.userReturnAdress = userReturnAdress == null ? null : userReturnAdress.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public Integer getAppFrom() {
        return appFrom;
    }

    public void setAppFrom(Integer appFrom) {
        this.appFrom = appFrom;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getFeeDetail() {
        return feeDetail;
    }

    public void setFeeDetail(String feeDetail) {
        this.feeDetail = feeDetail == null ? null : feeDetail.trim();
    }

    public Integer getIsDispatch() {
        return isDispatch;
    }

    public void setIsDispatch(Integer isDispatch) {
        this.isDispatch = isDispatch;
    }

    public BigDecimal getDispathFee() {
        return dispathFee;
    }

    public void setDispathFee(BigDecimal dispathFee) {
        this.dispathFee = dispathFee;
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