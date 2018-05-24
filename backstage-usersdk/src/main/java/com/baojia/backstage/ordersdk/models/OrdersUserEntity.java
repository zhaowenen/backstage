package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author wxr
 * @Title: 订单用户表
 * @date 2018/5/2214:18
 */
@TableName("orders_user")
public class OrdersUserEntity {
    /**
     * Column: orders_user.id
     @mbggenerated 2018-05-22 13:57:35
     */
    private Long id;

    /**
     *   订单号
     * Column: orders_user.order_no
     @mbggenerated 2018-05-22 13:57:35
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders_user.user_id
     @mbggenerated 2018-05-22 13:57:35
     */
    private Long userId;

    /**
     *   用户手机号
     * Column: orders_user.user_mobile
     @mbggenerated 2018-05-22 13:57:35
     */
    private String userMobile;

    /**
     *   用车开始时间
     * Column: orders_user.begin_time
     @mbggenerated 2018-05-22 13:57:35
     */
    private Date beginTime;

    /**
     *   用车结束时间
     * Column: orders_user.end_time
     @mbggenerated 2018-05-22 13:57:35
     */
    private Date endTime;

    /**
     *   取车用户纬度 高德
     * Column: orders_user.take_user_latitude
     @mbggenerated 2018-05-22 13:57:35
     */
    private Double takeUserLatitude;

    /**
     *   还车用户经度 高德
     * Column: orders_user.take_user_longitude
     @mbggenerated 2018-05-22 13:57:35
     */
    private Double takeUserLongitude;

    /**
     *   还车用户纬度 高德
     * Column: orders_user.return_user_latitude
     @mbggenerated 2018-05-22 13:57:35
     */
    private Double returnUserLatitude;

    /**
     *   还车用户经度 高德
     * Column: orders_user.return_user_longitude
     @mbggenerated 2018-05-22 13:57:35
     */
    private Double returnUserLongitude;

    /**
     *   app版本
     * Column: orders_user.app_version
     @mbggenerated 2018-05-22 13:57:35
     */
    private String appVersion;

    /**
     *   订单来源app 1- 小蜜 2-蜜蜂
     * Column: orders_user.app_from
     @mbggenerated 2018-05-22 13:57:35
     */
    private Integer appFrom;

    /**
     *   ios/android
     * Column: orders_user.device_type
     @mbggenerated 2018-05-22 13:57:35
     */
    private String deviceType;

    /**
     *   费用详情
     * Column: orders_user.fee_detail
     @mbggenerated 2018-05-22 13:57:35
     */
    private String feeDetail;

    /**
     *   创建时间
     * Column: orders_user.create_time
     @mbggenerated 2018-05-22 13:57:35
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_user.modify_time
     @mbggenerated 2018-05-22 13:57:35
     */
    private Date modifyTime;

    /**
     * Table: orders_user
     @mbggenerated 2018-05-22 13:57:35
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getFeeDetail() {
        return feeDetail;
    }

    public void setFeeDetail(String feeDetail) {
        this.feeDetail = feeDetail == null ? null : feeDetail.trim();
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
