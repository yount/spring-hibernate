package com.zxc.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.html.HTML;
import com.zxc.dao.UserDao;
import com.zxc.model.User;
import com.zxc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private Logger logger = Logger.getLogger(HTML.class);
	
	@Autowired
    private UserDao userDao; 
	
	public User getUserById(int userId) {
		return null;
	}
	
	
	public User getUserByEmailAddress(String emailaddress){
		logger.info("userDao : "+userDao);
		return userDao.getUserByEmailAddress(emailaddress);
	}

	public int getCount(){
		return userDao.getCount();
	}
}
