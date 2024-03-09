package com.insurance.rescontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Premium;
import com.insurance.service.PremiumService;

@RestController
public class PremiumRestController {
	
	@Autowired
	private PremiumService premiumservice;
	
	/*
	 * Design API to get all the premium details from database
	 */

	@GetMapping("/getPremiumDetails/{id}")
	public Premium getPremiumDetails(@PathVariable("id") int id)
	{
		Premium premiums=premiumservice.getPremiumDetails(id);
		return premiums;
	}
}
