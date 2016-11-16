/**
*    File       :   AggregateDescriptor.java
*    Package    :   com.ariel.hmserp.utils
*    Created    :   Mar 31, 2014  3:13:43 PM
*    Project    :   Hospital Management System ERP
*    Author     :   Kavuri Suresh Babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.utils;

import org.springframework.stereotype.Component;

@Component("aggregateDescriptor")
public class AggregateDescriptor {
	
	private String field;
	private String aggregate;
	
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getAggregate() {
		return aggregate;
	}
	public void setAggregate(String aggregate) {
		this.aggregate = aggregate;
	}

}
