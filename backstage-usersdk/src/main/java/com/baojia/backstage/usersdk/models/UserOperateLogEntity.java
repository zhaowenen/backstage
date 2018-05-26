package com.baojia.backstage.usersdk.models;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: user_operate_log
 @mbggenerated do_not_delete_during_merge 2018-05-24 21:37:19
 */
public class UserOperateLogEntity implements Serializable {
    /**
     * Column: user_operate_log.lid
     @mbggenerated 2018-05-24 21:37:19
     */
    private Long lid;

    /**
     *   用户ID
     * Column: user_operate_log.user_id
     @mbggenerated 2018-05-24 21:37:19
     */
    private String userId;

    /**
     *   操作类型 1:拉黑操作 2:解除拉黑操作
     * Column: user_operate_log.operate_type
     @mbggenerated 2018-05-24 21:37:19
     */
    private Integer operateType;

    /**
     *   操作前操作的数据
     * Column: user_operate_log.operate_old_text
     @mbggenerated 2018-05-24 21:37:19
     */
    private String operateOldText;

    /**
     *   操作后操作的数据
     * Column: user_operate_log.operate_new_text
     @mbggenerated 2018-05-24 21:37:19
     */
    private String operateNewText;

    /**
     *   是否删除 0-已删除 1-未删除
     * Column: user_operate_log.del_flag
     @mbggenerated 2018-05-24 21:37:19
     */
    private Integer delFlag;

    /**
     *   创建时间
     * Column: user_operate_log.create_time
     @mbggenerated 2018-05-24 21:37:19
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: user_operate_log.modify_time
     @mbggenerated 2018-05-24 21:37:19
     */
    private Date modifyTime;

    /**
     *   备注
     * Column: user_operate_log.remarks
     @mbggenerated 2018-05-24 21:37:19
     */
    private String remarks;

    /**
     * Table: user_operate_log
     @mbggenerated 2018-05-24 21:37:19
     */
    private static final long serialVersionUID = 1L;

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getOperateOldText() {
        return operateOldText;
    }

    public void setOperateOldText(String operateOldText) {
        this.operateOldText = operateOldText == null ? null : operateOldText.trim();
    }

    public String getOperateNewText() {
        return operateNewText;
    }

    public void setOperateNewText(String operateNewText) {
        this.operateNewText = operateNewText == null ? null : operateNewText.trim();
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}