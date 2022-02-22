package com.service;

import com.model.User;

public interface UserService {

	void signUpUser(User user);
	boolean loginUser(String un, String psw);
}
