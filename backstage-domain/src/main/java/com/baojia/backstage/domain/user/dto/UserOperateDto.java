package com.baojia.backstage.domain.user.dto;

import com.baojia.backstage.domain.common.BaseDto;

import java.io.Serializable;

/**
 * @Auther: YUANEL
 * @Date: 2018/5/25 14:18
 * @Description:
 */
public class UserOperateDto extends BaseDto {

    private String userId;//被操作用户id

    private String remarks;//操作原因

    private String operateName;//操作人姓名

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }
}
