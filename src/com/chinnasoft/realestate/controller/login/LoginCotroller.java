/**
*    File       :   LoginCotroller.java
*    Package    :   com.chinnasoft.realestate.controller.login
*    Created    :   Jan 23, 2014  4:57:34 PM
*    Project    :   Hospital Management System ERP
*    Author     :   Sakthivel.B
*    Company    :   Ariel Technologies PVT LTD.
**/



package com.chinnasoft.realestate.controller.login;

import java.net.Inet4Address;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*import sun.invoke.empty.Empty;*/

/*import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;*/
/*import com.amazonaws.util.IOUtils;*/
import com.chinnasoft.realestate.entity.models.EmpInfo;
import com.chinnasoft.realestate.entity.models.EmpOfficeInfo;
import com.chinnasoft.realestate.entity.models.HeaderImagePath;
import com.chinnasoft.realestate.entity.models.LoginMaster;
import com.chinnasoft.realestate.entity.models.SessionMaster;
import com.chinnasoft.realestate.entity.models.UrlNavigationMaster;
import com.chinnasoft.realestate.entity.models.UserRights;
import com.chinnasoft.realestate.entity.models.UserTypeMaster;
import com.chinnasoft.realestate.service.login.LoginManagerServiceIntf;
/*import com.chinnasoft.realestate.services.home.HospitalSetupServiceIntf;
import com.chinnasoft.realestate.services.home.MenuServiceIntf;
import com.chinnasoft.realestate.services.home.UserServiceIntf;*/
import com.chinnasoft.realestate.utils.UtilityHelper;
/*import com.chinnasoft.realestate.services.home.HospitalSetupServiceIntf;
import com.chinnasoft.realestate.services.home.MenuServiceIntf;
import com.chinnasoft.realestate.services.home.UserServiceIntf;
import com.chinnasoft.realestate.utils.UtilityHelper;*/
import com.sun.org.apache.xml.internal.security.utils.Base64;


@Controller
/*@RequestMapping(value="Login")*/
public class LoginCotroller {
	private static final String UUID_STRING = "uuid";
    private static final String AMAZON_ACCESS_KEY = "AKIAJLC2AZ3N5AUJFEVQ";
    private static final String AMAZON_SECRET_KEY = "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";
    private static final String S3_BUCKET_NAME = "hmserp";
	
	
	
	@Autowired 
	LoginManagerServiceIntf loginService;
	
/*@Autowired
	private HospitalSetupServiceIntf hospitalSetupServiceIntf;
	
	@Autowired
	UserServiceIntf userService;
	@Autowired
	MenuServiceIntf menuService;*/
	
	@ModelAttribute("loginInfo")
	public LoginMaster getLoginInfo()       
	{
		return new LoginMaster();
	}
	@RequestMapping(value="/loginPage.htm", method = RequestMethod.GET)
	public ModelAndView showLoginPage(HttpServletRequest request,HttpSession httpSession){
		ModelAndView mv = new ModelAndView("loginPage");
		if(null != httpSession)
		{
			httpSession.invalidate();
		}
		return mv;
	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/loginPage.htm", method = RequestMethod.POST)
	public ModelAndView UserLoginChecking(@ModelAttribute("loginInfo")LoginMaster loginMaster,BindingResult bindingResult,HttpServletRequest request,HttpSession HttpS)throws Exception{
		ModelAndView modelAndView = new ModelAndView("loginPage");
		
		loginMaster.getHospitalId();
		loginMaster.getUserName();
	/*	System.out.println("start");
		System.out.println(loginMaster.getHospitalId());
		System.out.println(loginMaster.getUserName());
		System.out.println("end");*/
	
		//ipd Pattient Details Seesion Values Start
		HttpSession session=request.getSession(true); 
		session.setAttribute("operationId", "0");
		session.setAttribute("ipdId", "0");
		session.setAttribute("tabViewMode", "surgeryDetails");			
		//ipd Pattient Details Seesion Values end
		
		
		LoginMaster loginObject=loginService.isValidUser(loginMaster);
		
		if( loginObject!=null)
		{
			//if(!loginService.isSubscriptionExpired(loginObject.getHospitalId().getHospitalId())){
			   HttpSession httpSession=request.getSession(true);  
			  
			   //System.out.println("loginObject.getHospitalId()------->"+loginObject.getHospitalId());
			  		   
			   httpSession.getCreationTime();
			   httpSession.getLastAccessedTime() ;
			   httpSession.getId();
			   					  
			  
			   try{
				   
				   SessionMaster sessionMaster=new SessionMaster();
				   sessionMaster.setIpaddress(request.getRemoteHost());
				   sessionMaster.setSessionId(httpSession.getId());
				   sessionMaster.setUserName(loginObject.getUserName());
				   sessionMaster.setUserId(new LoginMaster(loginObject.getUserId()));
				   Date date = new Date(httpSession.getCreationTime());
				   Date date1 = new Date(httpSession.getLastAccessedTime());
				   DateFormat formatter = new SimpleDateFormat("HH:mm:ss:SSS");
				   String dateFormatted = formatter.format(date);
				   sessionMaster.setStartTime(date);
				   sessionMaster.setEndTime(date1);
				   HttpS.setAttribute("sessionId", httpSession.getId());
				   
				 loginService.saveSessionDetails(sessionMaster);
				   
			   }catch(Exception e){
				   
			   }
				httpSession.setAttribute("userId", loginObject.getUserId());
			    httpSession.setAttribute("userName", loginObject.getUserName());
			    if(!UtilityHelper.isEmpty(loginObject.getUserTypeId().getUserTypeId()))
			    {
			    	 httpSession.setAttribute("userTypeId", loginObject.getUserTypeId().getUserTypeId());
					 httpSession.setAttribute("userType", loginObject.getUserTypeId().getUserTypeName());	
			    }
			   
			    httpSession.setAttribute("userTypeAdmin", loginService.getUserTypeList(UtilityHelper.Active_Status_Id).getUserTypeName());
			    
			    // method to get the logo for particular hospital
			    HeaderImagePath getLogoImagePath=new HeaderImagePath();
			   
			    Integer userId=loginObject.getHospitalId().getHospitalId();
			    getLogoImagePath=loginService.getLogoImagePath(userId);
			   
			   // System.out.println(getLogoImagePath.getFilepath());
			    //System.out.println("User Name in login controller########   "+loginObject.getUserName());
			    
			    if( !UtilityHelper.isEmpty(loginObject.getEmpId()) )
			    {
				    httpSession.setAttribute("empId", loginObject.getEmpId().getEmpId());
				    EmpInfo empinfoObject=loginService.getEmployeeInfoDetails(((Integer)request.getSession().getAttribute("empId")));
					EmpOfficeInfo officeDetailsObject=loginService.getEmpOfficeDetails((Integer)request.getSession().getAttribute("empId"));
							    
					if (null != officeDetailsObject.getDesignationCategoryId()) 
					{
							httpSession.setAttribute("empdesignationCategory", officeDetailsObject.getDesignationCategoryId().getDesignationCategoryName().toLowerCase().trim());
					}
					else 
					{
							httpSession.setAttribute("empdesignationCategory", "cadmin");
					}	    
			    }
			    else
			    {
			    	httpSession.setAttribute("empdesignationCategory", "cadmin");
			    }
			 
			    httpSession.setAttribute("hospitalId", loginObject.getHospitalId().getHospitalId());
			    /*Map<String , UserRights> userMenus = menuService.getMenus((Integer)(request.getSession().getAttribute("userId")));
			    httpSession.setAttribute("menus", userMenus);
			    httpSession.setAttribute("mainmenus", userService.getMenuList());*/
			    
			    
			    // changes added by s.j
			    
			/*    httpSession.setAttribute("urlNavigationList",hospitalSetupServiceIntf.getUrlNavigationMasterList());
			List<UrlNavigationMaster> UrlNavigationList=  hospitalSetupServiceIntf.getUrlNavigationMasterList();
			    */
		 ModelAndView view1;
			if(loginObject.getUserTypeId().getUserTypeId()==4)
			{
				view1 = new ModelAndView("redirect:/hello.html");
			}
			else
			{
						
			  view1 = new ModelAndView("redirect:/hello.html");
			 
			}
			 
			   
	          return view1;
		}
			else{
				modelAndView.addObject("error", " Your Subsription period is expired, Please Contact Administrator.");
			}
		/*}
		else
			 modelAndView.addObject("error", " Invalid User name or Password");
		 */
		
		return  modelAndView;

		

	}
	
	
	@RequestMapping(value="/ImaggeDescription.htm" , method = RequestMethod.GET)
	public ModelAndView imageDescription(){
		
		
		ModelAndView model= new ModelAndView("ImaggeDescription");
		return model;
	}
	
	@RequestMapping(value="loadingPage.htm")
	public ModelAndView loadingPage()
	{
		ModelAndView mv = new ModelAndView("loadingPage");
		return mv;
	}
	
}


