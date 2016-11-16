package com.chinnasoft.realestate.service.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chinnasoft.realestate.dao.login.LoginManagerDaoIntf;
import com.chinnasoft.realestate.entity.models.EmpInfo;
import com.chinnasoft.realestate.entity.models.EmpOfficeInfo;
import com.chinnasoft.realestate.entity.models.HeaderImagePath;
import com.chinnasoft.realestate.entity.models.LoginMaster;
import com.chinnasoft.realestate.entity.models.SessionMaster;
import com.chinnasoft.realestate.entity.models.UserTypeMaster;
@Service("loginService")
public class LoginManagerServiceIntfImpl implements LoginManagerServiceIntf {
	
	@Autowired
	LoginManagerDaoIntf loginServiceIntf;

	
	@Transactional
	public LoginMaster isValidUser(LoginMaster loginMaster) {
		// TODO Auto-generated method stub
		return loginServiceIntf.isValidUser(loginMaster);
	}

	
	@Transactional
	public LoginMaster getUsersListByHospital(Integer hospitalId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getUsersListByHospital(hospitalId);
	}
	
	
	
	@Transactional
	public EmpInfo getEmployeeInfoDetails(Integer empId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getEmployeeInfoDetails(empId);
	}

	
	@Transactional(readOnly=true)
	public EmpOfficeInfo getEmpOfficeDetails(Integer empId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getEmpOfficeDetails(empId);
	}

	
	@Transactional
	public UserTypeMaster getUserTypeList(Integer statusId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getUserTypeList(statusId);
	}

	
	@Transactional
	public void saveSessionDetails(SessionMaster session) {
		// TODO Auto-generated method stub
		loginServiceIntf.saveSessionDetails(session);
	}

	
	@Transactional
	public void updateSessionDetails(String session) {
		// TODO Auto-generated method stub
		loginServiceIntf.updateSessionDetails(session);
		
	}

	
	@Transactional
	public HeaderImagePath getheadeimgPath(Integer statusId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getheadeimgPath(statusId);
	}

	
	
	@Transactional
	public HeaderImagePath getLogoImagePath(Integer userId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.getLogoImagePath(userId);
	}
	
	
	
	@Transactional
	public Boolean isSubscriptionExpired(Integer hospitalId) {
		// TODO Auto-generated method stub
		return loginServiceIntf.isSubscriptionExpired(hospitalId);
	}

	

}
