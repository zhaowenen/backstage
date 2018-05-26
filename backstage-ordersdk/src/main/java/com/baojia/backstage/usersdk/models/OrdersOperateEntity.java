package com.baojia.backstage.usersdk.models;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: orders_operate_0
 @mbggenerated do_not_delete_during_merge 2018-05-26 10:47:14
 */
@TableName("orders_operate")
public class OrdersOperateEntity implements Serializable {
    /**
     * Column: orders_operate_0.id
     @mbggenerated 2018-05-26 10:47:14
     */
    private Long id;

    /**
     *   订单号
     * Column: orders_operate_0.order_no
     @mbggenerated 2018-05-26 10:47:14
     */
    private String orderNo;

    /**
     *   用户id
     * Column: orders_operate_0.user_id
     @mbggenerated 2018-05-26 10:47:14
     */
    private Long userId;

    /**
     *   车辆id
     * Column: orders_operate_0.bike_id
     @mbggenerated 2018-05-26 10:47:14
     */
    private Long bikeId;

    /**
     *   操作类型 预约、开锁、用户还车、后台还车、锁车
     * Column: orders_operate_0.operate_type
     @mbggenerated 2018-05-26 10:47:14
     */
    private Integer operateType;

    /**
     *   操作结果
     * Column: orders_operate_0.operate_result
     @mbggenerated 2018-05-26 10:47:14
     */
    private String operateResult;

    /**
     *   操作备注
     * Column: orders_operate_0.operate_note
     @mbggenerated 2018-05-26 10:47:14
     */
    private String operateNote;

    /**
     *   创建时间
     * Column: orders_operate_0.create_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: orders_operate_0.modify_time
     @mbggenerated 2018-05-26 10:47:14
     */
    private Date modifyTime;

    /**
     * Table: orders_operate_0
     @mbggenerated 2018-05-26 10:47:14
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

    public Long getBikeId() {
        return bikeId;
    }

    public void setBikeId(Long bikeId) {
        this.bikeId = bikeId;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult == null ? null : operateResult.trim();
    }

    public String getOperateNote() {
        return operateNote;
    }

    public void setOperateNote(String operateNote) {
        this.operateNote = operateNote == null ? null : operateNote.trim();
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
