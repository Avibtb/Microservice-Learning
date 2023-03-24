package com.lcw.user.service.services;

import java.util.List;

import com.lcw.user.service.entities.User;

public interface UserService {

	
	//create
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get single user of given userId
	
	User getUser(String userId);
	
}
