package com.baojia.backstage.common.constant;

public enum ResultEnum {
    SUCCESS(200,"操作成功"),
   /* DATA_LOSE(201,"数据丢失，不能做判断"),
    RETROGRADE(202,"车辆可能在逆行"),
    WALK_THROUGH(203,"车辆可能在穿行"),
    DIRECT_MOTION(204,"顺行"),
    DATA_INCOMPLETE(205,"请检查数据是否完整"),
    NETWORK_UNUSE(206,"网络异常"),
    DATA_FORMAT_ERROR(207,"数据格式错误"),
    DATA_OBTAIN_ERROR(208,"数据获取异常"),*/
    UNABLE_JUDGE(500,"无法判断");

    public int code;

    public String message;

    private ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
