/**
 *    File       :   FilterDescriptor.java
 *    Package    :   com.ariel.hmserp.utils
 *    Created    :   Jan 31, 2014  9:21:12 AM
 *    Project    :   Hospital Management System ERP
 *    Author     :   babu
 *    Company    :   Ariel Technologies PVT LTD.
 **/

package com.chinnasoft.realestate.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("filterDescriptor")
public class FilterDescriptor {

	private String logic;
	private List<FilterDescriptor> filters;
	private String field;
	private Object value;
	private String operator;
	private boolean ignoreCase = true;

	public FilterDescriptor() {
		filters = new ArrayList<FilterDescriptor>();
	}

	public String getLogic() {
		return logic;
	}

	public void setLogic(String logic) {
		this.logic = logic;
	}

	public List<FilterDescriptor> getFilters() {
		return filters;
	}

	public void setFilters(List<FilterDescriptor> filters) {
		this.filters = filters;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}

}
