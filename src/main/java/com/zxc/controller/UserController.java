package com.zxc.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	
	@Autowired
	private BasicDataSource dataSource;
	
	@RequestMapping("home")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response){
		logger.info(request.getHeader("Referer"));
		ModelMap map = new ModelMap();
		User user = userService.getUserByEmailAddress("user@123.com");
		map.put("user", user);
		return new ModelAndView("user/home.jsp", map);
	}
	
	@RequestMapping("count")
	public ModelAndView count(HttpServletRequest request, HttpServletResponse response){
		logger.info(request.getHeader("Referer"));
		
		ModelMap map = new ModelMap();
		
		int count = userService.getCount();
		map.put("user_count", count);
		logger.info("user count : "+count);
		
		return new ModelAndView("user/count.jsp", map);
	}
}
