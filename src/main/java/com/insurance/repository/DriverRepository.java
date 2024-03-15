package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
	public Driver findById(int id);
	public void deleteByid(int id);

}
