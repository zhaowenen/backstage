package enums.order;

import enums.EnumType;
/**
* @Title: RefundStatus  
* @Description:  退款流水中的退款状态
* @author renjing  
* @date 2018年5月25日 下午8:26:34
 */
public class RefundStatus extends EnumType {

	protected RefundStatus(int type, String name) {
		super(type, name);
	}
	
	public static final RefundStatus UN_REFUND = new RefundStatus(0, "未退款");
	public static final RefundStatus REFUNDING = new RefundStatus(100, "退款中");
	public static final RefundStatus REFUND_SUCCESS = new RefundStatus(200, "退款成功");

}
