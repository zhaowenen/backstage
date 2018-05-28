package enums;

/**
* @Title: DepositDelFlagStatus  
* @Description: 押金是否有效状态 
* @author renjing  
* @date 2018年5月24日 下午6:15:14
 */
public class DelFlagStatus extends EnumType {

	protected DelFlagStatus(int type, String name) {
		super(type, name);
	}
	
	public static final DelFlagStatus DELETE = new DelFlagStatus(0, "已删除");
	public static final DelFlagStatus EFFECTIVE = new DelFlagStatus(1, "有效");

}
