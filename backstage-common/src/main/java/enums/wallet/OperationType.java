package enums.wallet;

import enums.EnumType;
/**
* @Title: OperationType  
* @Description:  用户钱包操作记录中的操作类型
* @author renjing  
* @date 2018年5月26日 下午5:15:29
 */
public class OperationType extends EnumType {

	protected OperationType(int type, String name) {
		super(type, name);
	}
	
	public static final OperationType DEPOSIT_RECHARGE = new OperationType(1, "押金充值");
	public static final OperationType DEPOSIT_WITHDRAW = new OperationType(2, "押金退款");
	public static final OperationType MICOIN_RECHARGE = new OperationType(3, "蜜币充值");
	public static final OperationType MICOIN_CONSUME = new OperationType(4, "押金退款");
	public static final OperationType DEPOSIT_UNLOCK = new OperationType(5, "押金解锁");

}
