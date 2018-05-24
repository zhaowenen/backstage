package enums.deposit;

import enums.EnumType;

public class DepositDelFlagStatus extends EnumType {

	protected DepositDelFlagStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositDelFlagStatus DELETE = new DepositDelFlagStatus(0, "已删除");
	public static final DepositDelFlagStatus EFFECTIVE = new DepositDelFlagStatus(1, "有效");

}
