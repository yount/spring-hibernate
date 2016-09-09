package com.zxc.dao;

import com.zxc.model.User;

public interface UserDao {

	public User getUserByEmailAddress(String emailaddress);

	public int getCount();

}
