package enums.deposit;

import enums.EnumType;
/**
* @Title: UserModeType  
* @Description:  用户收款方式
* @author renjing  
* @date 2018年5月24日 下午6:20:35
 */
public class UserModeType extends EnumType {

	protected UserModeType(int type, String name) {
		super(type, name);
	}
	
	public static final UserModeType WECHAT = new UserModeType(100, "微信");
	public static final UserModeType ALIPAY = new UserModeType(200, "支付宝");
	public static final UserModeType BANK = new UserModeType(300, "银行");

}
