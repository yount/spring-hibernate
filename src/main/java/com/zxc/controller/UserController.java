package com.zxc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.html.HTML;
import com.zxc.model.User;
import com.zxc.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	private Logger logger = Logger.getLogger(HTML.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("home")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response){
		logger.info(request.getHeader("Referer"));
		User user = userService.getUserByEmailAddress("");
		System.out.println(user);
		return new ModelAndView("user/home.html");
	}
}
