package com.insurance.service;

import com.insurance.model.Driver;

public interface DriverService {
	public Driver saveDriver(Driver driver);
	public Driver getDriver(int id);
	public Driver updateDriver(Driver driver);
	public String DeleteDriver(int id);

}
