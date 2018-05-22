package com.baojia.backstage.domain.order.bo;

/**
 * @author wxr
 * @Title: OrdersBo
 * @Description: 业务对象，封装对象、复杂对象 ，里面可能包含多个类
 * @date 2018/5/22 17:06
 */
public class OrdersBo {
    private String orderNo;//订单编号
    private String mobile;//手机号
    private String plateNo;//车牌号
    private String nickName;//用户昵称
    private String takeAdress;//取车地址
    private Double ordersMileage;//订单里程数
    private Double orderAmount;//订单金额
    private Integer orderStatus;//订单状态

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTakeAdress() {
        return takeAdress;
    }

    public void setTakeAdress(String takeAdress) {
        this.takeAdress = takeAdress;
    }

    public Double getOrdersMileage() {
        return ordersMileage;
    }

    public void setOrdersMileage(Double ordersMileage) {
        this.ordersMileage = ordersMileage;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}
