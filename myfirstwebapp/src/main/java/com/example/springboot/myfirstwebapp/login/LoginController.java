package com.example.springboot.myfirstwebapp.login;

import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
@Controller
@SessionAttributes("name")
public class LoginController {
	
	private Logger logger =LoggerFactory.getLogger(getClass());
	
	private AuthenticationService authenticationService;
		
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	//http://localhost:8080/login?name=chittu 
	//1. identify controller
//	@RequestMapping ("login")
//	public String gotoLoginPage(@RequestParam String name,ModelMap model) {
//		///myfirstwebapp/src/main/resources/META-INF/resources/WEB-INF/jsp/login.jsp
//		logger.debug("Request parm {} is " +name);
//		logger.info("this is info level log");
//		System.out.println("Request param is" +name); //just for verification
//		model.put("name", name);
//		return "login"; // 2.execute controller and return view
//		
//	}
	@RequestMapping (value="login",method=RequestMethod.GET)
	public String gotoLoginPage()
	{
		//GET 
		return "login";
		
	}
	@RequestMapping (value="login",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		//POST
		if(authenticationService.Authenticate(name,password))
		{
			model.put("name", name);
			//model.put("password", password);
			//Authentication
			// name : chittu password = dummy
			return "welcome";
		}
			model.put("errorMessage", "invalid password .. try again!!");
			return "login";
				
	}
}
