package com.baojia.backstage.common.exception;

import com.baojia.backstage.common.auth.util.Result;

public class MiBikeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3369236155374952392L;
	private int code;
	private Object context;

	public int getCode() {
		return code;
	}

	public Object getContext() {
		return context;
	}

	public MiBikeException() {
		super();
	}

	public MiBikeException(int code, String msg) {
		this(code, msg, null);
	}

	public MiBikeException(int code, String msg, Throwable t) {
		super(msg, t);
		this.code = code;
	}

	public MiBikeException(Result r) {
		this(r.getCode(), r.getMsg(), null);
	}

	public MiBikeException(Result r, Object context) {
		this(r.getCode(), r.getMsg());
		this.context = context;
	}
}
