package com.chinnasoft.realestate.dao.login;

import java.util.List;

import com.chinnasoft.realestate.entity.models.EmpInfo;
import com.chinnasoft.realestate.entity.models.EmpOfficeInfo;
import com.chinnasoft.realestate.entity.models.HeaderImagePath;
import com.chinnasoft.realestate.entity.models.LoginMaster;
import com.chinnasoft.realestate.entity.models.SessionMaster;
import com.chinnasoft.realestate.entity.models.UserTypeMaster;

public interface LoginManagerDaoIntf {
	
	public LoginMaster isValidUser(LoginMaster loginMaster);
	
	public LoginMaster getUsersListByHospital(Integer hospitalId);
	
	public EmpInfo getEmployeeInfoDetails(Integer empId);
	
	public EmpOfficeInfo getEmpOfficeDetails(Integer empId);
	public UserTypeMaster getUserTypeList(Integer statusId);

	public void saveSessionDetails(SessionMaster session);
	public void updateSessionDetails(String session);
	public HeaderImagePath getheadeimgPath(Integer statusId);
	
	public HeaderImagePath getLogoImagePath(Integer userId);
	
	public Boolean isSubscriptionExpired(Integer hospitalId);
}
