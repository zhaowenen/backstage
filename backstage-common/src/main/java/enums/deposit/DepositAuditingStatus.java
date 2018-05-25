package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositAuditingStatus  
* @Description:  押金审批状态
* @author renjing  
* @date 2018年5月24日 下午6:22:01
 */
public class DepositAuditingStatus extends EnumType {

	protected DepositAuditingStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DepositAuditingStatus WAIT_CHACK = new DepositAuditingStatus(100, "待审核");
	public static final DepositAuditingStatus PASS = new DepositAuditingStatus(200, "审核通过");
	public static final DepositAuditingStatus REFUSE = new DepositAuditingStatus(300, "审核拒绝");

}
