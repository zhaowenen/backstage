package order;

import enums.EnumType;
/**
* @Title: RefundMethod  
* @Description:  退款流水中的退款方式
* @author renjing  
* @date 2018年5月25日 下午8:26:46
 */
public class RefundMethod extends EnumType {

	protected RefundMethod(int type, String name) {
		super(type, name);
	}
	
	public static final RefundMethod WECHAT = new RefundMethod(1, "微信");
	public static final RefundMethod ALIPAY = new RefundMethod(2, "支付宝");

}
