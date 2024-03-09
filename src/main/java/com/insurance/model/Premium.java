package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 *  Design API to get all the premium details from database-By Anjum_Shakih

 */
@Entity
@Table(name="premiumDetails")
public class Premium {
	
	//Premiumid,premiumamount,customername,premiumStartDate,premiumEndDate,premiumType.

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int premiumid;
	private String customername;
	private int premiumamount;
	private String premiumStartDate;
	private String premiumEndDate;
	private String premiumType;
	public int getPremiumid() {
		return premiumid;
	}
	public void setPremiumid(int premiumid) {
		this.premiumid = premiumid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getPremiumamount() {
		return premiumamount;
	}
	public void setPremiumamount(int premiumamount) {
		this.premiumamount = premiumamount;
	}
	public String getPremiumStartDate() {
		return premiumStartDate;
	}
	public void setPremiumStartDate(String premiumStartDate) {
		this.premiumStartDate = premiumStartDate;
	}
	public String getPremiumEndDate() {
		return premiumEndDate;
	}
	public void setPremiumEndDate(String premiumEndDate) {
		this.premiumEndDate = premiumEndDate;
	}
	public String getPremiumType() {
		return premiumType;
	}
	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}
	@Override
	public String toString() {
		return "Premium [premiumid=" + premiumid + ", customername=" + customername + ", premiumamount=" + premiumamount
				+ ", premiumStartDate=" + premiumStartDate + ", premiumEndDate=" + premiumEndDate + ", premiumType="
				+ premiumType + "]";
	}
	
	
	

}
