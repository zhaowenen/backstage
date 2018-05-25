package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositStatus  
* @Description:  押金状态
* @author renjing  
* @date 2018年5月24日 下午6:14:26
 */
public class DepositStatus extends EnumType {

	protected DepositStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositStatus PAID = new DepositStatus(1, "已支付");
	public static final DepositStatus WITHDRAW = new DepositStatus(2, "已提现");

}
