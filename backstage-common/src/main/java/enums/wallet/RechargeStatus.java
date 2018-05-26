package enums.wallet;

import enums.EnumType;
/**
* @Title: RechargeStatus  
* @Description:  用户钱包操作记录中的充值押金状态
* @author renjing  
* @date 2018年5月26日 下午4:04:29
 */
public class RechargeStatus extends EnumType {

	protected RechargeStatus(int type, String name) {
		super(type, name);
	}
	
	public static final RechargeStatus PAID = new RechargeStatus(1, "已支付");
	public static final RechargeStatus NOT_PAY = new RechargeStatus(2, "未支付");

}
