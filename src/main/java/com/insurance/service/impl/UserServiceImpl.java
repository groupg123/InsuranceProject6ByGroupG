package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.UserRepository;
import com.insurance.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
		
	

}
