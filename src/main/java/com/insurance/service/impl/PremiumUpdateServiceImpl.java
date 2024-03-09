package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Premium;
import com.insurance.repository.PremiumUpdateRepository;
import com.insurance.service.PremiumUpdateService;

@Service
public class PremiumUpdateServiceImpl implements PremiumUpdateService {
	/*
	 * PremiumUpdateRepository reference is injected into PremiumUpdateServiceImpl
	 * class with the help of @Autowired annotation
	 */

	@Autowired
	private PremiumUpdateRepository premiumUpdateRepository;

	@Override
	public Premium updatePremiumDetails(Premium premium) {
		Premium premium2 = premiumUpdateRepository.save(premium);
		return premium2;
	}

}
