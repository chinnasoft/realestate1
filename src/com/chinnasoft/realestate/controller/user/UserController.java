package com.chinnasoft.realestate.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class UserController {

	
	
	@RequestMapping(value="/userRegistrationList.html" ,method=RequestMethod.GET)
	public ModelAndView userRegistrationList(){
		ModelAndView view = new ModelAndView("userRegistrationList");
		
		
		return view;
		
		
	}
}
