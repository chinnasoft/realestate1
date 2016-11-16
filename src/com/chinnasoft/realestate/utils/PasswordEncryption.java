/**
*    File       :   PasswordEncryption.java
*    Package    :   com.ariel.hmserp.utils
*    Created    :   Jan 27, 2014  12:31:34 PM
*    Project    :   Hospital Management System ERP
*    Author     :   babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.utils;

import javax.servlet.http.HttpServletRequest;

import org.jasypt.util.password.ConfigurablePasswordEncryptor;

public  class PasswordEncryption {

	public static String passwordEncrypt(String userPassword){
		String result = "";
		ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
		passwordEncryptor.setAlgorithm("MD5");
		passwordEncryptor.setPlainDigest(true);
		passwordEncryptor.setStringOutputType("UTF-8");
		result = passwordEncryptor.encryptPassword(userPassword);
		return result;
		
	}
	
	public static String getIpAddr(HttpServletRequest request) { 
		 
		   String ip = request.getHeader("X-FORWARDED-FOR");      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getHeader("Proxy-Client-IP");      
		   }      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getHeader("WL-Proxy-Client-IP");      
		   }      
		   if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
		       ip = request.getRemoteAddr();      
		   }
		   return ip;
	}
		  
	
	
	
}


