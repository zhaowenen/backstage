package com.baojia.backstage.common.exception;

import com.baojia.backstage.common.auth.util.Result;

public class MeBikeException extends Exception {

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

	public MeBikeException() {
		super();
	}

	public MeBikeException(int code, String msg) {
		this(code, msg, null);
	}

	public MeBikeException(int code, String msg, Throwable t) {
		super(msg, t);
		this.code = code;
	}

	public MeBikeException(Result r) {
		this(r.getCode(), r.getMsg(), null);
	}

	public MeBikeException(Result r, Object context) {
		this(r.getCode(), r.getMsg());
		this.context = context;
	}
}
