package enums;

import com.baojia.backstage.common.auth.util.Result;

public class BaseResult extends Result {

	public BaseResult(int code, String msg, Object context) {
		super(code, msg, context);
	}
    
	public final static Result NOT_FOUNT = new Result(12001, "对象未找到");
	public final static Result NOT_AUTHOR = new Result(12002, "您没有该操作权限");

}
