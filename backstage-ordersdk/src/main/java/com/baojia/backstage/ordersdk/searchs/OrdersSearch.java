package com.baojia.backstage.ordersdk.searchs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wxr
 * @Title: OrdersSearch
 * @Description: es订单信息放在es中
 * @date 2018/5/24 14:52
 */
@Document(indexName = "orders", replicas = 0, refreshInterval = "-1")
public class OrdersSearch implements Serializable{
    @Id
    private Long orderId;
    private Integer orderType;//下单类型 1-预约 2-扫码
    private String orderNo;//订单号--
    private Integer userId;//用户id
    private String userName;//用户姓名
    private String userMobile;//用户手机号
    private Date createTime;//订单创建时间
    private Double bikeTakeMileage;//取车时续航里程
    private Integer orderStatus;//订单状态100-已预约 200-已取车 300-已还车 400-已取消 500-人工取消 600-人工结束
    private Double ridingTime;//骑行时间 骑行时长
    private Double ordersMileage;//订单里程(骑行里程)

    private String plateNo;//车牌号
    private String appVersion;//下单是手机版本信息
    private String bikeTakeAdress;//取车时车辆位置
    private String userTakeAdress;//取车时手机位置
    private String bikeReturnAdress;//还车时车辆位置
    private String userReturnAdress;//还车时手机位置
    private Date returnBikeTime;//还车时间
    //费用信息
    private BigDecimal orderAmount;//应收订单总费用
    private BigDecimal timeAmount;//时长费用
    private BigDecimal mileageAmount;//里程费用
    private BigDecimal activityAmount;//活动抵扣金额
    private BigDecimal couponAmount;//优惠券抵扣金额
    private Long couponId;//优惠券id
    private Integer payAmount;//支付金额

    //订单支付记录
    private Integer paymentType;//支付方式100-用车 200-充值押金 300-充值蜜币
    private String outTradeNo;//商户订单号
    private BigDecimal giveMiAmount;//蜜币支付时花费赠送蜜币数量
    private BigDecimal miAmount;//蜜币支付时花费充值蜜币数量


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
        this.orderNo = orderNo;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public Double getRidingTime() {
        return ridingTime;
    }

    public void setRidingTime(Double ridingTime) {
        this.ridingTime = ridingTime;
    }

    public Double getOrdersMileage() {
        return ordersMileage;
    }

    public void setOrdersMileage(Double ordersMileage) {
        this.ordersMileage = ordersMileage;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
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

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getTimeAmount() {
        return timeAmount;
    }

    public void setTimeAmount(BigDecimal timeAmount) {
        this.timeAmount = timeAmount;
    }

    public BigDecimal getMileageAmount() {
        return mileageAmount;
    }

    public void setMileageAmount(BigDecimal mileageAmount) {
        this.mileageAmount = mileageAmount;
    }

    public BigDecimal getActivityAmount() {
        return activityAmount;
    }

    public void setActivityAmount(BigDecimal activityAmount) {
        this.activityAmount = activityAmount;
    }

    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Integer getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Integer payAmount) {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "OrdersSearch{" +
                "orderId=" + orderId +
                ", orderType=" + orderType +
                ", orderNo='" + orderNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", createTime=" + createTime +
                ", bikeTakeMileage=" + bikeTakeMileage +
                ", orderStatus=" + orderStatus +
                ", ridingTime=" + ridingTime +
                ", ordersMileage=" + ordersMileage +
                ", plateNo='" + plateNo + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", bikeTakeAdress='" + bikeTakeAdress + '\'' +
                ", userTakeAdress='" + userTakeAdress + '\'' +
                ", bikeReturnAdress='" + bikeReturnAdress + '\'' +
                ", userReturnAdress='" + userReturnAdress + '\'' +
                ", returnBikeTime=" + returnBikeTime +
                ", orderAmount=" + orderAmount +
                ", timeAmount=" + timeAmount +
                ", mileageAmount=" + mileageAmount +
                ", activityAmount=" + activityAmount +
                ", couponAmount=" + couponAmount +
                ", couponId=" + couponId +
                ", payAmount=" + payAmount +
                ", paymentType=" + paymentType +
                ", outTradeNo=" + outTradeNo +
                ", giveMiAmount=" + giveMiAmount +
                ", miAmount=" + miAmount +
                '}';
    }
}
