package com.zxc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxc.dao.UserDao;
import com.zxc.model.User;
import com.zxc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao; 
	
	public User getUserById(int userId) {
		return null;
	}
	
	
	public User getUserByEmailAddress(String emailaddress){
		return userDao.getUserByEmailAddress(emailaddress);
	}

}
