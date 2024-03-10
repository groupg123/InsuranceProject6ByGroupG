package com.insurance.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * Design Service to add user with multiple nominee details into system
 */

@Entity
@Table(name="users")
public class UserNominee {

	//id,name,email
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@OneToMany(mappedBy = "userid")
	private List<Nominee> nomineeList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Nominee> getNomineeList() {
		return nomineeList;
	}

	public void setNomineeList(List<Nominee> nomineeList) {
		this.nomineeList = nomineeList;
	}

	@Override
	public String toString() {
		return "UserNominee [id=" + id + ", name=" + name + ", email=" + email + ", nomineeList=" + nomineeList + "]";
	}


	
	
		
	
	
}
