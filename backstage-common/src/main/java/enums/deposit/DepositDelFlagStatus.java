package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositDelFlagStatus  
* @Description: 押金是否有效状态 
* @author renjing  
* @date 2018年5月24日 下午6:15:14
 */
public class DepositDelFlagStatus extends EnumType {

	protected DepositDelFlagStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositDelFlagStatus DELETE = new DepositDelFlagStatus(0, "已删除");
	public static final DepositDelFlagStatus EFFECTIVE = new DepositDelFlagStatus(1, "有效");

}
