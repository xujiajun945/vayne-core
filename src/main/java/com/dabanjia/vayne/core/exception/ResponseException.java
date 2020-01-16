package com.dabanjia.vayne.core.exception;

import com.dabanjia.vayne.core.constant.ResultCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author xujiajun
 * @since 2019/12/26
 */
@Setter
@Getter
@ToString
public class ResponseException extends RuntimeException {

	private static final long serialVersionUID = 6607462217623613389L;

	private Integer code;

	private String message;

	public ResponseException() {
		super();
	}

	public ResponseException(Integer code, String message) {
		super(message);
		this.code = code;
	}

	public ResponseException(ResultCode resultCode) {
		this.code = resultCode.getCode();
		this.message = resultCode.getMessage();
	}
}
