package enums;

public class DepositStatus extends EnumType {

	protected DepositStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositStatus PAID = new DepositStatus(1, "已支付");
	public static final DepositStatus WITHDRAW = new DepositStatus(2, "已提现");

}
