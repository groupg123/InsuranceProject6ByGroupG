package com.insurance.rescontroller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Nominee;
import com.insurance.model.UserNominee;
import com.insurance.service.NomineeService;
import com.insurance.service.UserNomineeService;

@RestController
public class UserNomineeRestController {
	
	@Autowired
	private UserNomineeService userservice;
	
	@Autowired
	private NomineeService nomineeservice;
	
	
	/*
	 * Design Service to add user with multiple nominee details into system
	 */
	
	@PostMapping("/saveUserNominee")
	public UserNominee saveUser(@RequestBody UserNominee user)	
	{
		UserNominee user1=userservice.saveUser(user);
		
		//System.out.println("list>>>>"+user1.getNomineeList());
		
		List<Nominee> nomineelist=user.getNomineeList();
		for(Nominee nominee:nomineelist)
		{
			nominee.setUserid(user.getId());
			nomineeservice.saveNominee(nominee);
		}
		return user1;
		
	}
}
