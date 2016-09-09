package com.zxc.controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp.BasicDataSource;
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
	
	@Autowired
	private BasicDataSource dataSource;
	
	@RequestMapping("home")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response){
		logger.info(request.getHeader("Referer"));
		User user = userService.getUserByEmailAddress("");
		logger.info(user);
		return new ModelAndView("user/home.html");
	}
	
	@RequestMapping("count")
	public ModelAndView count(HttpServletRequest request, HttpServletResponse response){
		logger.info(request.getHeader("Referer"));
		
		Connection conn = null;
		try {
			
			conn = dataSource.getConnection();
			logger.info("conn ：" + conn);
		} catch (SQLException e) {
			e.printStackTrace();
			logger.info("conn 错误");
			logger.info("getDriverClassName : "+dataSource.getDriverClassName());
			logger.info("getUrl : "+dataSource.getUrl());
			logger.info("getUsername : "+dataSource.getUsername());
			logger.info("getPassword : "+dataSource.getPassword());
			logger.info(e.getMessage());
		} finally {
			if(conn !=null){
				try {
					conn.close();
				} catch (SQLException e) {
					logger.info(e.getMessage());
				}
			}
		}
		
		int count = userService.getCount();
		logger.info("count : "+count);
		
		return new ModelAndView("user/home.html");
	}
}
