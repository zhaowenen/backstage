package com.baojia.backstage.domain.user.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: YUANEL
 * @Date: 2018/5/24 11:53
 * @Description:业务对象，封装对象、复杂对象 ，里面可能包含多个类
 * 此类为查询类别返回的复杂对象
 */
public class UserInfoBo implements Serializable {

    private String userId;//用户id
    private String realName;//用户姓名
    private String mobile;//手机号
    private String registerCityCode;//城市码
    private Integer veriftyStatus;//实名状态   1未认证 2 身份证认证认证通过 3人脸对比
    private Date registerTime;//注册时间
    private Integer fromApp;//1 小蜜 2蜜蜂
    private Integer cashCoupon;//代金券
    private Integer blackStatus;//拉黑状态 1未拉黑 2拉黑
    private Integer lockStatus;//押金状态 1未锁定 2锁定
    private BigDecimal miCoinAmount;//米币金额  又指充值余额和账户余额


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealNamae() {
        return realName;
    }

    public void setRealNamae(String realNamae) {
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

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getFromApp() {
        return fromApp;
    }

    public void setFromApp(Integer fromApp) {
        this.fromApp = fromApp;
    }

    public BigDecimal getMiCoinAmount() {
        return miCoinAmount;
    }

    public void setMiCoinAmount(BigDecimal miCoinAmount) {
        this.miCoinAmount = miCoinAmount;
    }

    public Integer getCashCoupon() {
        return cashCoupon;
    }

    public void setCashCoupon(Integer cashCoupon) {
        this.cashCoupon = cashCoupon;
    }

    public Integer getBlackStatus() {
        return blackStatus;
    }

    public void setBlackStatus(Integer blackStatus) {
        this.blackStatus = blackStatus;
    }
}
