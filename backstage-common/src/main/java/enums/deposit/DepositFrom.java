package enums.deposit;

import enums.EnumType;
/**
* @Title: DepositFrom  
* @Description:  押金来源
* @author renjing  
* @date 2018年5月26日 下午2:09:21
 */
public class DepositFrom extends EnumType {

	protected DepositFrom(int type, String name) {
		super(type, name);
	}
	
	public static final DepositFrom SMAIL_MIBIKE = new DepositFrom(1, "小蜜");
	public static final DepositFrom BEE_BIKE = new DepositFrom(2, "蜜蜂");

}
