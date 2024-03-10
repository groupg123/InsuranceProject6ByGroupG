package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="nominee")
public class Nominee {
	//id,Nomineename,NomineeEmail
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nomineeName;
	private String nomineeEmail;
	
	private int userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeEmail() {
		return nomineeEmail;
	}

	public void setNomineeEmail(String nomineeEmail) {
		this.nomineeEmail = nomineeEmail;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Nominee [id=" + id + ", nomineeName=" + nomineeName + ", nomineeEmail=" + nomineeEmail + ", userid="
				+ userid + "]";
	}

		
}
