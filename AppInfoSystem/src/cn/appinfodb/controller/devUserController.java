package cn.appinfodb.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*@RequestMapping("/dev")*/
@Controller
public class devUserController {

	private Logger log = Logger.getLogger("devUserController.class");

	
	
	@RequestMapping(value="/devlogin.html",method=RequestMethod.GET)
	public String info(){
		
		return "devlogin";
		
	}
	
	
}
