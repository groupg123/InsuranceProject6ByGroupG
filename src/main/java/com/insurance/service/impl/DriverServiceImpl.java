package com.insurance.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Driver;
import com.insurance.repository.DriverRepository;
import com.insurance.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverRepository driverrepository;
	
	
	//Method to SAVE Driver details in DataBase
	@Override
	public Driver saveDriver(Driver driver) {
	
		Driver driver1=driverrepository.save(driver);
		return driver1;
	}


	//Method to GET Driver details in DataBase
	@Override
	public Driver getDriver(int id) {
		Driver driver1=driverrepository.findById(id);
		return driver1;
	}


	//Method to UPDATE Driver details in DataBase
	@Override
	public Driver updateDriver(Driver driver) {
		Driver driver1=driverrepository.save(driver);
		return driver1;
	}


	//Method to DELETE Driver details in DataBase
	@Override
	public String DeleteDriver(int id) {
		boolean isFound=driverrepository.existsById(id);
		if(isFound==true)
		{
			driverrepository.deleteById(id);
			return "Data deleted successfully";
			
		}
		else
		{
			return "Data not present for mention id.....";
		}
		

	}
	
	

}
