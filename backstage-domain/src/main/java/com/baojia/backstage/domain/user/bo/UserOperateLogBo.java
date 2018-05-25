package com.baojia.backstage.domain.user.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: YUANEL
 * @Date: 2018/5/25 16:16
 * @Description:
 */
public class UserOperateLogBo implements Serializable {

    private String id;
    private Date operateTime;//操作时间
    private String operateUser;//操作人
    private String remarks;//备注信息
    private Integer operateType;//操作类型

    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
