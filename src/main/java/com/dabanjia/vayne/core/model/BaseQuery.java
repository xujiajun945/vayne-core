package com.dabanjia.vayne.core.model;

import lombok.ToString;

import java.io.Serializable;

/**
 * @author xujiajun
 * @since 2019/12/25
 */
@ToString
public class BaseQuery implements Serializable {

	private static final long serialVersionUID = -4257352070371090626L;

	private Integer page = 1;

	private Integer rows = 10;

	private Integer position = 0;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		if (page < 1) {
			page = 1;
		}
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		if (rows < 1) {
			rows = 10;
		}
		this.rows = rows > 200 ? 200 : rows;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
}
