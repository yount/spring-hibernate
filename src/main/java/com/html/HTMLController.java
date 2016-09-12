package com.html;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("html")
public class HTMLController {
	private Logger logger = Logger.getLogger(HTMLController.class);
	
	@RequestMapping("home")
	public ModelAndView home(){
		logger.info("html/home");
		return new ModelAndView("/html/home.html");
	}
	
	@RequestMapping("home_html")
	public String home_html(){
		logger.info("html/home_html");
		return "/html/home.html";
	}
	
	@RequestMapping("home_jsp")
	public String home_jsp(){
		logger.info("html/home_jsp");
		return "/html/home.jsp";
	}
}
