package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositApplyType  
* @Description:  押金申请类型
* @author renjing  
* @date 2018年5月24日 下午6:14:26
 */
public class DepositApplyType extends EnumType {

	protected DepositApplyType(int type, String name) {
		super(type, name);
	}
	
	public static final DepositApplyType WITHDRAW = new DepositApplyType(200, "提现");
	public static final DepositApplyType DEDUCT = new DepositApplyType(300, "扣款");

}
