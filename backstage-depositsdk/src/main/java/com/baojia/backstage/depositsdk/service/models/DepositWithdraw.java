package com.baojia.backstage.depositsdk.service.models;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableName;

/**
* @Title: DepositApply  
* @Description: 押金扣款表
* @author renjing  
* @date 2018年5月23日 上午11:38:49
 */
@TableName("deposit_withdraw")
public class DepositWithdraw {
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 扣除金额
     */
    private BigDecimal amount;

    /**
     * 后台记录人员
     */
    private Long opsUserId;

    /**
     * 审核状态(待定)
     */
    private Integer status;

    /**
     * 是否删除 0-已删除 1-未删除
     */
    private Integer delFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getOpsUserId() {
        return opsUserId;
    }

    public void setOpsUserId(Long opsUserId) {
        this.opsUserId = opsUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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