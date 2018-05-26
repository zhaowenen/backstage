package com.baojia.backstage.ordersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: orders_bike_0
 @mbggenerated do_not_delete_during_merge 2018-05-26 10:47:13
 */
@TableName("orders_bike")
public class OrdersBikeEntity implements Serializable {
    /**
     * Column: orders_bike_0.orders_bike_id
     @mbggenerated 2018-05-26 10:47:13
     */
    private Long ordersBikeId;

    /**
     *   订单号
     * Column: orders_bike_0.order_no
     @mbggenerated 2018-05-26 10:47:13
     */
    private String orderNo;

    /**
     *   车辆id
     * Column: orders_bike_0.bike_id
     @mbggenerated 2018-05-26 10:47:13
     */
    private Long bikeId;

    /**
     *   车牌号
     * Column: orders_bike_0.plate_no
     @mbggenerated 2018-05-26 10:47:13
     */
    private String plateNo;

    /**
     *   取车纬度原生
     * Column: orders_bike_0.take_latitude
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double takeLatitude;

    /**
     *   取车经度原生
     * Column: orders_bike_0.take_longitude
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double takeLongitude;

    /**
     *   还车纬度原生
     * Column: orders_bike_0.return_latitude
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double returnLatitude;

    /**
     *   还车经度原生
     * Column: orders_bike_0.return_longitude
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double returnLongitude;

    /**
     *   取车gps定位时间
     * Column: orders_bike_0.take_gps_time
     @mbggenerated 2018-05-26 10:47:13
     */
    private Date takeGpsTime;

    /**
     *   取车gps定位时间
     * Column: orders_bike_0.return_gps_time
     @mbggenerated 2018-05-26 10:47:13
     */
    private Date returnGpsTime;

    /**
     *   取车地址
     * Column: orders_bike_0.take_adress
     @mbggenerated 2018-05-26 10:47:13
     */
    private String takeAdress;

    /**
     *   还车地址
     * Column: orders_bike_0.return_adress
     @mbggenerated 2018-05-26 10:47:13
     */
    private String returnAdress;

    /**
     *   imei
     * Column: orders_bike_0.imei
     @mbggenerated 2018-05-26 10:47:13
     */
    private String imei;

    /**
     *   取车里程数
     * Column: orders_bike_0.take_mileage
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double takeMileage;

    /**
     *   还车里程数
     * Column: orders_bike_0.return_mileage
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double returnMileage;

    /**
     *   订单里程数
     * Column: orders_bike_0.order_mileage
     @mbggenerated 2018-05-26 10:47:13
     */
    private Double orderMileage;

    /**
     *   创建时间
     * Column: orders_bike_0.create_time
     @mbggenerated 2018-05-26 10:47:13
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_bike_0.modify_time
     @mbggenerated 2018-05-26 10:47:13
     */
    private Date modifyTime;

    /**
     * Table: orders_bike_0
     @mbggenerated 2018-05-26 10:47:13
     */
    private static final long serialVersionUID = 1L;

    public Long getOrdersBikeId() {
        return ordersBikeId;
    }

    public void setOrdersBikeId(Long ordersBikeId) {
        this.ordersBikeId = ordersBikeId;
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

    public Double getOrderMileage() {
        return orderMileage;
    }

    public void setOrderMileage(Double orderMileage) {
        this.orderMileage = orderMileage;
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
