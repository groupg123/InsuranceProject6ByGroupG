package com.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Nominee;
import com.insurance.repository.NomineeRepository;
import com.insurance.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService{

	@Autowired
	private NomineeRepository nomineerepository;
	
	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nominees=nomineerepository.save(nominee);
		return nominees;
	}

}
