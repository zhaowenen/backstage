package com.baojia.backstage.domain.user.dto;

import com.baojia.backstage.domain.common.BaseDto;

import java.io.Serializable;

/**
 * @author wxr
 * @Title: OrdersDto
 * @Description: 传输对象，前端调用时传输
 * @date 2018/5/22 17:10
 */
public class UserDto extends BaseDto implements Serializable{
    private Integer veriftyStatus;//实名状态   1未认证 2 身份证认证认证通过 3人脸对比
    private Integer lockStatus;//押金状态 1未锁定 2锁定
    private  String registerCityCode;//城市码
    private Integer fromApp;//注册平台 1 小蜜 2蜜蜂
    private String userId;//用户id
    private String realNamae;//用户姓名
    private String mobile;//手机号
    private String beginTime;//下单开始时间
    private String endTime;//下单结束时间

    public Integer getVeriftyStatus() {
        return veriftyStatus;
    }

    public void setVeriftyStatus(Integer veriftyStatus) {
        this.veriftyStatus = veriftyStatus;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getRegisterCityCode() {
        return registerCityCode;
    }

    public void setRegisterCityCode(String registerCityCode) {
        this.registerCityCode = registerCityCode;
    }

    public Integer getFromApp() {
        return fromApp;
    }

    public void setFromApp(Integer fromApp) {
        this.fromApp = fromApp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealNamae() {
        return realNamae;
    }

    public void setRealNamae(String realNamae) {
        this.realNamae = realNamae;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
