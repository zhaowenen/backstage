package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositConditionType  
* @Description:  押金扣款记录查询记录
* @author renjing  
* @date 2018年5月24日 下午6:38:46
 */
public class DepositConditionType extends EnumType {

	protected DepositConditionType(int type, String name) {
		super(type, name);
	}
	
	public static final DepositConditionType OPSUSER = new DepositConditionType(1, "opsUser");
	public static final DepositConditionType USER = new DepositConditionType(2, "userName");
	public static final DepositConditionType MOBILE = new DepositConditionType(3, "mobile");

}
