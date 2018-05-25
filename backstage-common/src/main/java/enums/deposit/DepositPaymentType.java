package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositPaymentType  
* @Description:  用户收款方式
* @author renjing  
* @date 2018年5月24日 下午6:20:35
 */
public class DepositPaymentType extends EnumType {

	protected DepositPaymentType(int type, String name) {
		super(type, name);
	}
	
	public static final DepositPaymentType WECHAT = new DepositPaymentType(100, "微信");
	public static final DepositPaymentType ALIPAY = new DepositPaymentType(200, "支付宝");
	public static final DepositPaymentType BANK = new DepositPaymentType(300, "银行");

}
