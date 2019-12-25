package com.dabanjia.vayne.core.constant;

import lombok.Getter;

/**
 * @author xujiajun
 * @since 2019/12/25
 */
@Getter
public enum ResultCode {

	/**
	 * ok
	 */
	SUCCESS(1, "成功"),

	BAD_REQUEST(500, "服务器异常"),
	;

	private Integer code;

	private String message;

	ResultCode(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
}
