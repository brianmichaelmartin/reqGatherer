package com.multivision.req.dao.impl;

import java.io.Serializable;

public class FilterCondition implements Serializable {

	private static final long serialVersionUID = 1L;
	private String filterField = null;
	private String filterValue = null;
	private String dataType = null;

	public FilterCondition() {
	}

	public FilterCondition(Object objType, String filterField,
			String filterValue, String dataType) {
		this.filterField = filterField;
		this.filterValue = filterValue;
		this.dataType = dataType;
	}

	/**
	 * @return the filterField
	 */
	public String getFilterField() {
		return filterField;
	}

	/**
	 * @param filterField
	 *            the filterField to set
	 */
	public void setFilterField(String filterField) {
		this.filterField = filterField;
	}

	/**
	 * @return the filterValue1
	 */
	public String getFilterValue() {
		return filterValue;
	}

	/**
	 * @param filterValue1
	 *            the filterValue1 to set
	 */
	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}

	/**
	 * @return the dataType
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * @param dataType
	 *            the dataType to set
	 */
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
}