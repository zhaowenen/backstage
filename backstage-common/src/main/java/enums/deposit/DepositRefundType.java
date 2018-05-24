package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositRefundType  
* @Description:  押金提现方式
* @author renjing  
* @date 2018年5月24日 下午6:06:58
 */
public class DepositRefundType extends EnumType {

	protected DepositRefundType(int type, String name) {
		super(type, name);
	}
	
	public static final DepositRefundType APP_BACK_TRACK_WITHDRAW = new DepositRefundType(1, "APP原路提现");
	public static final DepositRefundType APP_TRANSFER_ACCOUNTS_WITHDRAW = new DepositRefundType(2, "APP转账提现");
	public static final DepositRefundType CONSOLE_BACK_TRACK_WITHDRAW = new DepositRefundType(3, "后台提现");
	public static final DepositRefundType CONSOLE_TRANSFER_ACCOUNTS_WITHDRAW = new DepositRefundType(4, "后台转账提现");

}
