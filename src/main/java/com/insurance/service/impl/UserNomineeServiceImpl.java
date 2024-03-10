package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserNominee;
import com.insurance.repository.UserNomineeRepository;
import com.insurance.service.UserNomineeService;

@Service
public class UserNomineeServiceImpl implements UserNomineeService {

	@Autowired
	private UserNomineeRepository userrepository;
	
	@Override
	public UserNominee saveUser(UserNominee user) {
		UserNominee users=userrepository.save(user);
		return users;
	}

}
