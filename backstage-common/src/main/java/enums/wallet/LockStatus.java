package enums.wallet;

import enums.EnumType;
/**
* @Title: LockStatus  
* @Description:  用户钱包操作记录中的押金锁定状态
* @author renjing  
* @date 2018年5月26日 下午4:04:29
 */
public class LockStatus extends EnumType {

	protected LockStatus(int type, String name) {
		super(type, name);
	}
	
	public static final LockStatus NOT_LOCK = new LockStatus(1, "未锁定");
	public static final LockStatus LOCKED = new LockStatus(2, "已锁定");

}
