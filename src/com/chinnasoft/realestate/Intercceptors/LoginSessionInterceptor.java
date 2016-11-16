/**
*    File       :   LoginSessionInterceptor.java
*    Package    :   com.ariel.hmserp.Intercceptors
*    Created    :   Mar 13, 2014  4:56:45 PM
*    Project    :   Hospital Management System ERP
*    Author     :   Kavuri Suresh Babu
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.Intercceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginSessionInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, 
			Object handler) throws Exception
	{
		boolean result = true;
		
		HttpSession session = request.getSession(false);
		
		if (null == session || null == session.getAttribute("userId") ||session.getAttribute("userId").toString().isEmpty()) {
			response.sendRedirect("loginPage.htm");
			result = false;
		}
		return result;
	}

}
