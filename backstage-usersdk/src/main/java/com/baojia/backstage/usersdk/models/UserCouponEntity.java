package com.baojia.backstage.usersdk.models;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: user_coupon
 @mbggenerated do_not_delete_during_merge 2018-05-24 14:18:49
 */
public class UserCouponEntity implements Serializable {
    /**
     * Column: user_coupon.id
     @mbggenerated 2018-05-24 14:18:49
     */
    private Long id;

    /**
     *   用户ID
     * Column: user_coupon.user_id
     @mbggenerated 2018-05-24 14:18:49
     */
    private Long userId;

    /**
     *   用户手机号
     * Column: user_coupon.mobile
     @mbggenerated 2018-05-24 14:18:49
     */
    private String mobile;

    /**
     *   优惠券ID
     * Column: user_coupon.coupon_id
     @mbggenerated 2018-05-24 14:18:49
     */
    private Long couponId;

    /**
     *   到期时间
     * Column: user_coupon.expiry_time
     @mbggenerated 2018-05-24 14:18:49
     */
    private Date expiryTime;

    /**
     *   领取时间
     * Column: user_coupon.receive_time
     @mbggenerated 2018-05-24 14:18:49
     */
    private Date receiveTime;

    /**
     *   使用时间
     * Column: user_coupon.use_time
     @mbggenerated 2018-05-24 14:18:49
     */
    private Date useTime;

    /**
     *   优惠券状态(1:未使用,2:已使用)
     * Column: user_coupon.coupon_status
     @mbggenerated 2018-05-24 14:18:49
     */
    private Integer couponStatus;

    /**
     *   获取的方式(未定义)
     * Column: user_coupon.from_type
     @mbggenerated 2018-05-24 14:18:49
     */
    private Integer fromType;

    /**
     *   获取的方式ID
     * Column: user_coupon.from_id
     @mbggenerated 2018-05-24 14:18:49
     */
    private Long fromId;

    /**
     *   是否删除 0-已删除 1-未删除
     * Column: user_coupon.del_flag
     @mbggenerated 2018-05-24 14:18:49
     */
    private Integer delFlag;

    /**
     *   创建时间
     * Column: user_coupon.create_time
     @mbggenerated 2018-05-24 14:18:49
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: user_coupon.modify_time
     @mbggenerated 2018-05-24 14:18:49
     */
    private Date modifyTime;

    /**
     * Table: user_coupon
     @mbggenerated 2018-05-24 14:18:49
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public Integer getFromType() {
        return fromType;
    }

    public void setFromType(Integer fromType) {
        this.fromType = fromType;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
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