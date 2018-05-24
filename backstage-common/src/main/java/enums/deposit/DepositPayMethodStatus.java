package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositPayMethodStatus  
* @Description:  押金支付方式
* @author renjing  
* @date 2018年5月24日 下午6:13:41
 */
public class DepositPayMethodStatus extends EnumType {

	protected DepositPayMethodStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositPayMethodStatus WECHAT = new DepositPayMethodStatus(1, "微信");
	public static final DepositPayMethodStatus ALIPAY = new DepositPayMethodStatus(2, "支付宝");

}
