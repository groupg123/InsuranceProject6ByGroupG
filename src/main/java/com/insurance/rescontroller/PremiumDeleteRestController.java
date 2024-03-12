package com.insurance.rescontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.PremiumDeleteService;

@RestController
public class PremiumDeleteRestController {
	
	@Autowired
	private PremiumDeleteService premiumdeleteservice;
	
	/*
	 * Design API to delete premium details into database-by Anjum
	 */
	
	@DeleteMapping("/DeletePremium/{id}")
	public String DeletePremium(@PathVariable int id)
	{
		String result=premiumdeleteservice.DeletePremium(id);
	
		return result;
	}

}
