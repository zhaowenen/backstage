package com.baojia.backstage.ordersdk.models;

import java.io.Serializable;
import java.util.Date;

/**
 * [STRATO MyBatis Generator]
 * Table: users
 @mbggenerated do_not_delete_during_merge 2018-05-23 15:56:12
 */
public class UserEntity implements Serializable {
    /**
     *   用户ID
     * Column: users.user_id
     @mbggenerated 2018-05-23 15:56:12
     */
    private Long userId;

    /**
     *   用户昵称
     * Column: users.nick_name
     @mbggenerated 2018-05-23 15:56:12
     */
    private String nickName;

    /**
     *   手机号
     * Column: users.mobile
     @mbggenerated 2018-05-23 15:56:12
     */
    private String mobile;

    /**
     *   邮箱
     * Column: users.email
     @mbggenerated 2018-05-23 15:56:12
     */
    private String email;

    /**
     *   性别(1:男,2:女,3:未知)
     * Column: users.sex
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer sex;

    /**
     *   用户头像
     * Column: users.head_url
     @mbggenerated 2018-05-23 15:56:12
     */
    private String headUrl;

    /**
     *   注册IP
     * Column: users.register_ip
     @mbggenerated 2018-05-23 15:56:12
     */
    private String registerIp;

    /**
     *   注册时间
     * Column: users.register_time
     @mbggenerated 2018-05-23 15:56:12
     */
    private Date registerTime;

    /**
     *   注册城市
     * Column: users.register_city_code
     @mbggenerated 2018-05-23 15:56:12
     */
    private String registerCityCode;

    /**
     *   注册地区
     * Column: users.register_ad_code
     @mbggenerated 2018-05-23 15:56:12
     */
    private String registerAdCode;

    /**
     *   最后登录IP
     * Column: users.last_login_ip
     @mbggenerated 2018-05-23 15:56:12
     */
    private String lastLoginIp;

    /**
     *   最后登录时间
     * Column: users.last_login_time
     @mbggenerated 2018-05-23 15:56:12
     */
    private Date lastLoginTime;

    /**
     *   最后登录城市
     * Column: users.last_login_city_code
     @mbggenerated 2018-05-23 15:56:12
     */
    private String lastLoginCityCode;

    /**
     *   最后登录地区
     * Column: users.last_login_ad_code
     @mbggenerated 2018-05-23 15:56:12
     */
    private String lastLoginAdCode;

    /**
     *   用户来源(1:小蜜,2:蜜蜂)
     * Column: users.from_app
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer fromApp;

    /**
     *   登录的设备类型(1:IOS,2:Android)
     * Column: users.device_type
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer deviceType;

    /**
     *   登录的设备号(用于推送)
     * Column: users.device_code
     @mbggenerated 2018-05-23 15:56:12
     */
    private String deviceCode;

    /**
     *   登录的机型
     * Column: users.device_model
     @mbggenerated 2018-05-23 15:56:12
     */
    private String deviceModel;

    /**
     *   登录的app版本
     * Column: users.app_version
     @mbggenerated 2018-05-23 15:56:12
     */
    private String appVersion;

    /**
     *   认证状态(1:未认证,2:身份证通过认证,3:人脸对比通过认证)
     * Column: users.verifty_status
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer veriftyStatus;

    /**
     *   拉黑(限制租车提现)(1:未拉黑,2:拉黑)
     * Column: users.black_status
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer blackStatus;

    /**
     *   是否删除 0-已删除 1-未删除
     * Column: users.del_flag
     @mbggenerated 2018-05-23 15:56:12
     */
    private Integer delFlag;

    /**
     *   创建时间
     * Column: users.create_time
     @mbggenerated 2018-05-23 15:56:12
     */
    private Date createTime;

    /**
     *   修改时间
     * Column: users.modify_time
     @mbggenerated 2018-05-23 15:56:12
     */
    private Date modifyTime;

    /**
     * Table: users
     @mbggenerated 2018-05-23 15:56:12
     */
    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterCityCode() {
        return registerCityCode;
    }

    public void setRegisterCityCode(String registerCityCode) {
        this.registerCityCode = registerCityCode == null ? null : registerCityCode.trim();
    }

    public String getRegisterAdCode() {
        return registerAdCode;
    }

    public void setRegisterAdCode(String registerAdCode) {
        this.registerAdCode = registerAdCode == null ? null : registerAdCode.trim();
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginCityCode() {
        return lastLoginCityCode;
    }

    public void setLastLoginCityCode(String lastLoginCityCode) {
        this.lastLoginCityCode = lastLoginCityCode == null ? null : lastLoginCityCode.trim();
    }

    public String getLastLoginAdCode() {
        return lastLoginAdCode;
    }

    public void setLastLoginAdCode(String lastLoginAdCode) {
        this.lastLoginAdCode = lastLoginAdCode == null ? null : lastLoginAdCode.trim();
    }

    public Integer getFromApp() {
        return fromApp;
    }

    public void setFromApp(Integer fromApp) {
        this.fromApp = fromApp;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode == null ? null : deviceCode.trim();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel == null ? null : deviceModel.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public Integer getVeriftyStatus() {
        return veriftyStatus;
    }

    public void setVeriftyStatus(Integer veriftyStatus) {
        this.veriftyStatus = veriftyStatus;
    }

    public Integer getBlackStatus() {
        return blackStatus;
    }

    public void setBlackStatus(Integer blackStatus) {
        this.blackStatus = blackStatus;
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