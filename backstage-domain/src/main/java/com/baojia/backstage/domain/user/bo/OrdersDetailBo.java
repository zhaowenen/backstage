package com.baojia.backstage.domain.user.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wxr
 * @Title: OrdersDetailBo
 * @Description: 订单详情复杂对象
 * @date 2018/5/23 16:10
 */
public class OrdersDetailBo implements Serializable{
    private Integer orderTType;//下单类型 1-预约 2-扫码
    private Double bikeTakeMileage;//取车时续航里程
    private Integer orderStatus;//订单状态100-已预约 200-已取车 300-已还车 400-已取消 500-人工取消 600-人工结束
    private String userName;//用户姓名
    private String userMobile;//用户手机号
    private Date createTime;//订单创建时间
    private String plate_no;//车牌号
    private String appVersion;//下单是手机版本信息
    private String bikeTakeAdress;//取车时车辆位置
    private String userTakeAdress;//取车时手机位置
    private String bikeReturnAdress;//还车时车辆位置
    private String userReturnAdress;//还车时手机位置
    private Date returnBikeTime;//还车时间
    //费用信息
    private Double orderAmount;//应收订单总费用
    //骑行时长
    //时长收费
    private Double ordersMileage;//订单里程(骑行里程)
    //里程收费
    private Double activityAmount;//活动抵扣金额
    private Double couponAmount;//优惠券抵扣金额
    private Long couponId;//优惠券id
    private Double payAmount;//支付金额

    //订单支付记录(可能有多个，支付成功或支付未成功)
    private Integer paymentType;//支付方式100-用车 200-充值押金 300-充值蜜币
    private String outTradeNo;//商户订单号

    public Integer getOrderTType() {
        return orderTType;
    }

    public void setOrderTType(Integer orderTType) {
        this.orderTType = orderTType;
    }

    public Double getBikeTakeMileage() {
        return bikeTakeMileage;
    }

    public void setBikeTakeMileage(Double bikeTakeMileage) {
        this.bikeTakeMileage = bikeTakeMileage;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPlate_no() {
        return plate_no;
    }

    public void setPlate_no(String plate_no) {
        this.plate_no = plate_no;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getBikeTakeAdress() {
        return bikeTakeAdress;
    }

    public void setBikeTakeAdress(String bikeTakeAdress) {
        this.bikeTakeAdress = bikeTakeAdress;
    }

    public String getUserTakeAdress() {
        return userTakeAdress;
    }

    public void setUserTakeAdress(String userTakeAdress) {
        this.userTakeAdress = userTakeAdress;
    }

    public String getBikeReturnAdress() {
        return bikeReturnAdress;
    }

    public void setBikeReturnAdress(String bikeReturnAdress) {
        this.bikeReturnAdress = bikeReturnAdress;
    }

    public String getUserReturnAdress() {
        return userReturnAdress;
    }

    public void setUserReturnAdress(String userReturnAdress) {
        this.userReturnAdress = userReturnAdress;
    }

    public Date getReturnBikeTime() {
        return returnBikeTime;
    }

    public void setReturnBikeTime(Date returnBikeTime) {
        this.returnBikeTime = returnBikeTime;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getOrdersMileage() {
        return ordersMileage;
    }

    public void setOrdersMileage(Double ordersMileage) {
        this.ordersMileage = ordersMileage;
    }

    public Double getActivityAmount() {
        return activityAmount;
    }

    public void setActivityAmount(Double activityAmount) {
        this.activityAmount = activityAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }
}
