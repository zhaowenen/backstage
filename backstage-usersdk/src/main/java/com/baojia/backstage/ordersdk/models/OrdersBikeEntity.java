package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.util.Date;

/**
 * @author wxr
 * @Title: 订单车辆表
 * @date 2018/5/2214:13
 */
@TableName("orders_bike")
public class OrdersBikeEntity {
    /**
     * Column: orders_bike.id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long id;

    /**
     *   订单号
     * Column: orders_bike.order_no
     @mbggenerated 2018-05-22 13:57:34
     */
    private String orderNo;

    /**
     *   车辆id
     * Column: orders_bike.bike_id
     @mbggenerated 2018-05-22 13:57:34
     */
    private Long bikeId;

    /**
     *   车牌号
     * Column: orders_bike.plate_no
     @mbggenerated 2018-05-22 13:57:34
     */
    private String plateNo;

    /**
     *   取车纬度原生
     * Column: orders_bike.take_latitude
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double takeLatitude;

    /**
     *   取车经度原生
     * Column: orders_bike.take_longitude
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double takeLongitude;

    /**
     *   还车纬度原生
     * Column: orders_bike.return_latitude
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double returnLatitude;

    /**
     *   还车经度原生
     * Column: orders_bike.return_longitude
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double returnLongitude;

    /**
     *   取车gps定位时间
     * Column: orders_bike.take_gps_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date takeGpsTime;

    /**
     *   取车gps定位时间
     * Column: orders_bike.return_gps_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date returnGpsTime;

    /**
     *   取车地址
     * Column: orders_bike.take_adress
     @mbggenerated 2018-05-22 13:57:34
     */
    private String takeAdress;

    /**
     *   还车地址
     * Column: orders_bike.return_adress
     @mbggenerated 2018-05-22 13:57:34
     */
    private String returnAdress;

    /**
     *   imei
     * Column: orders_bike.imei
     @mbggenerated 2018-05-22 13:57:34
     */
    private String imei;

    /**
     *   取车里程数
     * Column: orders_bike.take_mileage
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double takeMileage;

    /**
     *   还车里程数
     * Column: orders_bike.return_mileage
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double returnMileage;

    /**
     *   订单里程数
     * Column: orders_bike.orders_mileage
     @mbggenerated 2018-05-22 13:57:34
     */
    private Double ordersMileage;

    /**
     *   创建时间
     * Column: orders_bike.create_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_bike.modify_time
     @mbggenerated 2018-05-22 13:57:34
     */
    private Date modifyTime;

    /**
     * Table: orders_bike
     @mbggenerated 2018-05-22 13:57:34
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

    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo == null ? null : plateNo.trim();
    }

    public Double getTakeLatitude() {
        return takeLatitude;
    }

    public void setTakeLatitude(Double takeLatitude) {
        this.takeLatitude = takeLatitude;
    }

    public Double getTakeLongitude() {
        return takeLongitude;
    }

    public void setTakeLongitude(Double takeLongitude) {
        this.takeLongitude = takeLongitude;
    }

    public Double getReturnLatitude() {
        return returnLatitude;
    }

    public void setReturnLatitude(Double returnLatitude) {
        this.returnLatitude = returnLatitude;
    }

    public Double getReturnLongitude() {
        return returnLongitude;
    }

    public void setReturnLongitude(Double returnLongitude) {
        this.returnLongitude = returnLongitude;
    }

    public Date getTakeGpsTime() {
        return takeGpsTime;
    }

    public void setTakeGpsTime(Date takeGpsTime) {
        this.takeGpsTime = takeGpsTime;
    }

    public Date getReturnGpsTime() {
        return returnGpsTime;
    }

    public void setReturnGpsTime(Date returnGpsTime) {
        this.returnGpsTime = returnGpsTime;
    }

    public String getTakeAdress() {
        return takeAdress;
    }

    public void setTakeAdress(String takeAdress) {
        this.takeAdress = takeAdress == null ? null : takeAdress.trim();
    }

    public String getReturnAdress() {
        return returnAdress;
    }

    public void setReturnAdress(String returnAdress) {
        this.returnAdress = returnAdress == null ? null : returnAdress.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Double getTakeMileage() {
        return takeMileage;
    }

    public void setTakeMileage(Double takeMileage) {
        this.takeMileage = takeMileage;
    }

    public Double getReturnMileage() {
        return returnMileage;
    }

    public void setReturnMileage(Double returnMileage) {
        this.returnMileage = returnMileage;
    }

    public Double getOrdersMileage() {
        return ordersMileage;
    }

    public void setOrdersMileage(Double ordersMileage) {
        this.ordersMileage = ordersMileage;
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
