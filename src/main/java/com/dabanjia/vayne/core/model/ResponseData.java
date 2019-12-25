package com.dabanjia.vayne.core.model;

import com.dabanjia.vayne.core.constant.ResultCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author xujiajun
 * @since 2019/12/25
 */
@Setter
@Getter
@ToString
public class ResponseData implements Serializable {

	private static final long serialVersionUID = 2809761084325435674L;

	/**
	 * 响应code
	 */
	private Integer code;

	/**
	 * data
	 */
	private Object data;

	/**
	 * message
	 */
	private String message;

	public ResponseData() {
		this(ResultCode.SUCCESS);
	}

	public ResponseData(Object data) {
		this(ResultCode.SUCCESS);
		this.data = data;
	}

	public ResponseData(ResultCode resultCode) {
		this.code = resultCode.getCode();
		this.message = resultCode.getMessage();
	}

	public ResponseData(ResultCode resultCode, Object data) {
		this(resultCode);
		this.data = data;
	}

	public ResponseData(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResponseData(Integer code, String message, Object data) {
		this(code, message);
		this.data = data;
	}

}
