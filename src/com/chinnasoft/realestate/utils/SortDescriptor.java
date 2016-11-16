/**
*    File       :   SortDescriptor.java
*    Package    :   com.ariel.hmserp.utils
*    Created    :   Jan 31, 2014  9:18:48 AM
*    Project    :   Hospital Management System ERP
*    Author     :   babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.utils;

public class SortDescriptor {
	
	private String field;
	private String dir;
	private String compare;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getCompare() {
		return compare;
	}
	public void setCompare(String compare) {
		this.compare = compare;
	}

}


