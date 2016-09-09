package com.zxc.service;

import com.zxc.model.User;

public interface UserService {
	public User getUserById(int userId);

	public User getUserByEmailAddress(String s);

	public int getCount();
}
