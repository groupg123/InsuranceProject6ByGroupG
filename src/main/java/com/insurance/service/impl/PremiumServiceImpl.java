package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Premium;
import com.insurance.repository.PremiumRepository;
import com.insurance.service.PremiumService;

@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumrepository;
	
	@Override
	public Premium getPremiumDetails(int id) {
		
		Premium premium=premiumrepository.findById(id);
		return premium;
	}

}
