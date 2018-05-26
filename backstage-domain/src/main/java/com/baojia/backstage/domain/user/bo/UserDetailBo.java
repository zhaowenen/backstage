package com.baojia.backstage.domain.user.bo;

import org.apache.el.lang.ELArithmetic;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: YUANEL
 * @Date: 2018/5/24 11:53
 * @Description:业务对象，封装对象、复杂对象 ，里面可能包含多个类
 * 此类为查询类别返回的复杂对象
 */
public class UserDetailBo implements Serializable {

    private String userId;//用户id
    private String realName;//用户姓名
    private String mobile;//手机号
    private String registerCityCode;//城市码
    private String registerAdCode;//城市码
    private Integer fromApp;//1 小蜜 2蜜蜂
    private Date registerTime;//注册时间
    private Integer veriftyStatus;//实名状态   1未认证 2 身份证认证认证通过 3人脸对比
    private Integer rechargeStatus;//押金缴纳状态   1已交 2未交
    private Integer lockStatus;//押金锁定状态 1未锁定 2锁定
    private String  nearestOrderId;//最近一次订单id
   // private String neartestDepositLogId;//最近一次押金
    private Integer blackStatus;//拉黑状态 1未拉黑 2拉黑
    private BigDecimal rechargeAmount;//充值金额
    private BigDecimal giveAmount;//赠送金额
    private BigDecimal miCoinAmount;//米币金额  又指充值余额和账户余额
    private String appVersion;//当前版本 及登录app的版本

    private String idCardPhoto;//用户身份证头像base64照片，必须身份证认证通过

    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    public void setIdCardPhoto(String idCardPhoto) {
        this.idCardPhoto = idCardPhoto;
    }

    public String getRegisterAdCode() {
        return registerAdCode;
    }

    public void setRegisterAdCode(String registerAdCode) {
        this.registerAdCode = registerAdCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getVeriftyStatus() {
        return veriftyStatus;
    }

    public void setVeriftyStatus(Integer veriftyStatus) {
        this.veriftyStatus = veriftyStatus;
    }

    public Integer getRechargeStatus() {
        return rechargeStatus;
    }

    public void setRechargeStatus(Integer rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getNearestOrderId() {
        return nearestOrderId;
    }

    public void setNearestOrderId(String nearestOrderId) {
        this.nearestOrderId = nearestOrderId;
    }

    public Integer getBlackStatus() {
        return blackStatus;
    }

    public void setBlackStatus(Integer blackStatus) {
        this.blackStatus = blackStatus;
    }

    public BigDecimal getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(BigDecimal rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public BigDecimal getGiveAmount() {
        return giveAmount;
    }

    public void setGiveAmount(BigDecimal giveAmount) {
        this.giveAmount = giveAmount;
    }

    public BigDecimal getMiCoinAmount() {
        return miCoinAmount;
    }

    public void setMiCoinAmount(BigDecimal miCoinAmount) {
        this.miCoinAmount = miCoinAmount;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}
