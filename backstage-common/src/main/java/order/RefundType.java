package order;

import enums.EnumType;
/**
* @Title: RefundType  
* @Description:  退款流水中的退款类型
* @author renjing  
* @date 2018年5月25日 下午8:20:06
 */
public class RefundType extends EnumType {

	protected RefundType(int type, String name) {
		super(type, name);
	}
	
	public static final RefundType USE_BIKE = new RefundType(1, "用车");
	public static final RefundType DEPOSIT = new RefundType(2, "押金");
	public static final RefundType ME_COIN = new RefundType(3, "蜜币");

}
