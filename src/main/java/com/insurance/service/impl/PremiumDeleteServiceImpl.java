package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.PremiumDeleteRepository;
import com.insurance.service.PremiumDeleteService;

@Service
public class PremiumDeleteServiceImpl implements PremiumDeleteService {

	@Autowired
	private PremiumDeleteRepository premiumdeleterepository;
	
	
	@Override
	public String DeletePremium(int id) {

		
		boolean isFound=premiumdeleterepository.existsById(id);
		System.out.println("isFound"+isFound);
		
		if(isFound==true)
		{
			premiumdeleterepository.deleteById(id);
			return "Data deleted successfully";
			
		}
		else
		{
			return "Data not present for mention id.....";
		}
		
		
	}

}
