package com.baojia.backstage.domain.order.dto;

import com.baojia.backstage.domain.common.BaseDto;

import java.io.Serializable;

/**
 * @author wxr
 * @Title: OrdersDto
 * @Description: 传输对象，前端调用时传输
 * @date 2018/5/22 17:10
 */
public class OrdersDto extends BaseDto implements Serializable{
    private Integer orderType;//下单方式(扫码、预约)1-预约 2-扫码
    private Integer orderStatus;//订单状态
    private String beginTime;//下单开始时间
    private String endTime;//下单结束时间

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
