package com.chinnasoft.realestate.dao.login;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*import com.chinnasoft.realestate.entity.models.DepositeDetails;*/
import com.chinnasoft.realestate.entity.models.EmpInfo;
import com.chinnasoft.realestate.entity.models.EmpOfficeInfo;
import com.chinnasoft.realestate.entity.models.HeaderImagePath;
import com.chinnasoft.realestate.entity.models.LoginMaster;
/*import com.chinnasoft.realestate.entity.models.PatientTypeMaster;
import com.chinnasoft.realestate.entity.models.PayslipInfo;*/
import com.chinnasoft.realestate.entity.models.SessionMaster;
import com.chinnasoft.realestate.entity.models.SubscriptionDetails;
/*import com.chinnasoft.realestate.entity.models.SubscriptionDetails;*/
import com.chinnasoft.realestate.entity.models.UserTypeMaster;
import com.chinnasoft.realestate.utils.PasswordEncryption;
import com.chinnasoft.realestate.utils.UtilityDateHelper;
import com.chinnasoft.realestate.utils.UtilityHelper;
@Repository
public class LoginManagerDaoIntfImpl implements LoginManagerDaoIntf {
	@Autowired
	SessionFactory sessionFactory;
	

	@SuppressWarnings("unchecked")
	
	public LoginMaster isValidUser(LoginMaster loginMaster) {

	
		
		
		String finalpassword="";
try 
		{
			finalpassword = PasswordEncryption.passwordEncrypt(loginMaster.getUserPassword());
			System.out.println("Final Password:"+finalpassword);
			System.out.println("user name "+loginMaster.getUserName());
			System.out.println("this is dao impl");
			System.out.println("this is dao impl");
			System.out.println("this is dao impl");
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in Login DAO");
			e.printStackTrace();
		}

		
		
		Session session = sessionFactory.getCurrentSession();

		
	 List<LoginMaster> loginMasters = sessionFactory.getCurrentSession().createQuery("from LoginMaster l where l.userName=:userName and l.userPassword=:userPassword and  l.statusId.statusId = :statusId").
			  setParameter("userName",loginMaster.getUserName()).
			  setParameter("userPassword",finalpassword).
			  setParameter("statusId",UtilityHelper.Active_Status_Id).
			  list();
	
	 for (LoginMaster loginMaster2 : loginMasters) {
		 
		
	}
	 
	 
	 LoginMaster official = new LoginMaster();
		List<LoginMaster> officialList = loginMasters;
		if (!UtilityHelper.isEmpty(officialList)) {
			official = officialList.get(0);
			return official;
		}
		
		return null;
	}


	
	public LoginMaster getUsersListByHospital(Integer hospitalId){
		return (LoginMaster) sessionFactory.getCurrentSession().createQuery("from LoginMaster l where l.hospitalId=:hospitalId").setInteger("hospitalId", hospitalId).list().get(0);
	}
	
	
	
	
	public EmpInfo getEmployeeInfoDetails(Integer empId) {
		// TODO Auto-generated method stub
		return (EmpInfo) sessionFactory.getCurrentSession().createQuery("from EmpInfo e where e.empId=:empId").setInteger("empId", empId).list().get(0);
	}


	@SuppressWarnings("unchecked")
	
	public EmpOfficeInfo getEmpOfficeDetails(Integer empId) {
		// TODO Auto-generated method stub
		
		System.out.println("this is emp");
		System.out.println(empId);
		System.out.println("this is emp");
		
		Session session = sessionFactory.getCurrentSession();
		/*	
		List<EmpOfficeInfo> empOfficeInfoss = sessionFactory.getCurrentSession().createQuery("from EmpOfficeInfo l where l.statusId.statusId = :statusId").
				  setParameter("userName",loginMaster.getUserName()).
				  setParameter("userPassword",finalpassword).
				   setParameter("statusId",UtilityHelper.Active_Status_Id).
				  list();
		
		 for (EmpOfficeInfo empOfficeInfo : empOfficeInfoss) {
			 System.out.println("this is emp");
			 System.out.println(empOfficeInfo.getEmpId());
		}*/
		 
		
		
		Criteria officialCr = session.createCriteria(EmpOfficeInfo.class);
		
		officialCr.createAlias("empId", "empId");
		officialCr.add(Restrictions.eq("empId.empId", empId));
		EmpOfficeInfo official = new EmpOfficeInfo();
		List<EmpOfficeInfo> officialList = (List<EmpOfficeInfo>) officialCr.list();
		if (!UtilityHelper.isEmpty(officialList)) {
			
			System.out.println("enter into loop");
			official = officialList.get(0);
		}
		return official;
		 
	}


	@SuppressWarnings("unchecked")
	
	public UserTypeMaster getUserTypeList(Integer statusId) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		
		Criteria officialCr = session.createCriteria(UserTypeMaster.class);
	
		UserTypeMaster userTypeMaster = new UserTypeMaster();
		
		List<UserTypeMaster> userTypeMasterList = (List<UserTypeMaster>) officialCr.list();
		if (!UtilityHelper.isEmpty(userTypeMasterList)) {
			userTypeMaster = userTypeMasterList.get(0);
		}
		return userTypeMaster;
	}


	
	public void saveSessionDetails(SessionMaster sessionmaster) {
		// TODO Auto-generated method stub
		Session session1 = sessionFactory.getCurrentSession();
		SessionMaster sessionMaster=new SessionMaster();
		session1.saveOrUpdate(sessionmaster);
		
	}


	
	public void updateSessionDetails(String session) {
		// TODO Auto-generated method stub
		Session session1 = sessionFactory.getCurrentSession();
		String hql = "UPDATE session_master set end_time = :endtime "  + 
	             "WHERE session_id = :session";
	Query query = session1.createSQLQuery(hql);
	query.setParameter("session", session);
	query.setParameter("endtime", UtilityDateHelper.getCurrentDBDateWithTime());
	int result = query.executeUpdate();
		session1.saveOrUpdate(session1);
		
	}


	@SuppressWarnings("unchecked")
	
	public HeaderImagePath getheadeimgPath(Integer statusId) {
		// TODO Auto-generated method stub
Session session = sessionFactory.getCurrentSession();
		
		Criteria officialCr = session.createCriteria(HeaderImagePath.class);
	
		HeaderImagePath headerImagePath = new HeaderImagePath();
		
		List<HeaderImagePath> headerImagePathList = (List<HeaderImagePath>) officialCr.list();
		if (!UtilityHelper.isEmpty(headerImagePathList)) {
			headerImagePath = headerImagePathList.get(0);
		}
		return headerImagePath;
	}
	
	
	@SuppressWarnings("unchecked")
	
	public HeaderImagePath getLogoImagePath(Integer userId) {
		// TODO Auto-generated method stub

		
		
	
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(HeaderImagePath.class);
		criteria.createAlias("statusId","statusId");
		criteria.add(Restrictions.eq("statusId.statusId", UtilityHelper.Active_Status_Id));
		criteria.add(Restrictions.eq("hospitalId.hospitalId", userId));
		HeaderImagePath headerImagePath=new HeaderImagePath();
		
		List<HeaderImagePath> headerImagePathList = (List<HeaderImagePath>) criteria.list();
		if (!UtilityHelper.isEmpty(headerImagePathList)) {
			headerImagePath = headerImagePathList.get(0);
		}
		return headerImagePath;
	}


	
	public Boolean isSubscriptionExpired(Integer hospitalId) {
		// TODO Auto-generated method stub
		Boolean result = true;
		Session session = sessionFactory.getCurrentSession();
		String hql = "from SubscriptionDetails  where hospitalId.hospitalId = :hospitalId and  statusId.statusId = :statusId and  :currDate BETWEEN fromSubsdate and toSubsdate";
		
		Query query = session.createQuery(hql);
		

		
		query.setInteger("hospitalId", hospitalId);
		//query.setInteger("statusId", UtilityHelper.Active_Status_Id);
		//query.setDate("currDate", UtilityDateHelper.currentLocalDate());
		
		
		//query.setDate("attendanceDate", UtilityDateHelper.dispalytoLocalDate(date));
	@SuppressWarnings("unchecked")
		List<SubscriptionDetails> list = (List<SubscriptionDetails>) query.list();
		if (!UtilityHelper.isEmpty(list)) {
			result = false;
			
		}
		
		return result;
	}


	
	}






















