package com.baojia.backstage.common.constant;

public class SendSmsStatus {

    /** 短信发送成功代码 */
    public static int SUCCESS = 2;
    /** 短信发送成功信息 */
    public final static String SUCCESS_MESSAGE = "send message success";

    /** 第三方发送短信失败代码 */
    public final static int FAIL = -1;
    /** 第三方发送短信失败信息 */
    public final static String FAIL_MESSAGE = "send message fail";

    /** 等待发送*/
    public final static int WAIT = 0;
    /** 等待发送信息*/
    public final static String WAIT_MESSAGE = "sms is waiting to send";

    /** 服务异常异常代码*/
    public final static int ERROR = 4;
    /** 服务异常异常信息*/
    public final static String ERROR_MESSAGE = "server inner error";

   /*** 参数校验失败代码*/
    public final static int INVAIDARGU = 5;
    /** 参数校验失败信息*/
    public final static String INVAIDARGU_MESSAGE = "parameter error,please check it";

    /*** 短时间重复发送*/
    public final static int REPEATINSHORT = 6;
    /** 参数校验失败信息*/
    public final static String REPEATINSHORT_MESSAGE = "cancel send sms message,please send it after 30 seconds";

    /*** 超过最大发送量*/
    public final static int MAXSMSNUM = 7;
    /** 参数校验失败信息*/
    public final static String MAXSMSNUM_MESSAGE = "cancel send sms message,exceed the maximum number";

    /** 短信取消发送*/
    public final static int CANCEL_SEND = 3;
    /** 短信取消发送状态*/
    public final static String CANCEL_SEND_MESSAGE = "cancel send sms message";

    /** 取消发送短信失败*/
    public final static   int CANCEL_SEND_FAIL = 7;
    /** 取消发送短信失败信息*/
    public final static   String CANCEL_SEND_FAIL_MESSAGE = "cancel send sms message fail,message has already been sended";

    /** 批量发送短信超过上限*/
    public final static int TOO_MUCH_SMS = 6;
    /** 批量发送短信不能超过100条*/
    public final static String TOO_MUCH_SMS_MESSAGE = "no more than 100 sms messages can be send";

    /**国都返回成功代码*/
    public static final String GDPP_SUCCESS_CODE = "DELIVRD";

    public final static String UPDATE_DEFAULT_CODE_SUCCESS_MESSAGE = "update new channel code success";

    /** 黑名单*/
    public final static   int Blacklist_FAIL = 8;
    /** 取消发送短信失败信息*/
    public final static   String Blacklist_MESSAGE = "Blacklist";

}
