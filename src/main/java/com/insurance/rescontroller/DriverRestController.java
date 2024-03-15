package com.insurance.rescontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.Driver;
import com.insurance.service.DriverService;

/*
 * Design Restful web service for all curd opration for driverDetails
 */
@RestController
public class DriverRestController {
	
	@Autowired
	private DriverService driverservice;
	
	/*
	 *  Design Restful web service to save driverDetails
	 */
	@PostMapping("/savedriver")
	public Driver saveDriver(@RequestBody Driver driver)
	{
		
		Driver driver1=driverservice.saveDriver(driver);
		
		return driver1;
	}
	
	
	/*
	 * Design Restful web service to get driverDetails
	 */
	@GetMapping("/getDriver/{id}")
	public Driver getDriver(@PathVariable int id)
	{
		
		Driver driver1=driverservice.getDriver(id);
		return driver1;
	}
	
	
	/*
	 * Design Restful web service to update driverDetails
	 */

	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver)
	{
		Driver driver1=driverservice.updateDriver(driver);
		return driver1;
	}

	
	
	/*
	 * 
	 */
	@DeleteMapping("/DeleteDriver/{id}")
	public String DeleteDriver(@PathVariable int id)
	{
		String result=driverservice.DeleteDriver(id);	
		return result;
	}
}
