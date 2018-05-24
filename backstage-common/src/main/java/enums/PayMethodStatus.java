package enums;

public class PayMethodStatus extends EnumType {

	protected PayMethodStatus(int type, String name) {
		super(type, name);
	}
	
	public static final PayMethodStatus WECHAT = new PayMethodStatus(1, "微信");
	public static final PayMethodStatus ALIPAY = new PayMethodStatus(2, "支付宝");

}
