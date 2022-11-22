package com.OnlineMedicalShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.ToString;

@Entity
@Table(name="payments")
@ToString
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	@NotEmpty(message="name is mandatory")
	public String name;
	@NotEmpty(message="address is mandatory")
	public String address;
	
	//@NotEmpty(message = "Mobile number must not be empty")
   @Pattern(regexp = "^\\d{10}$", message = "Mobile no. should be 10 digit number..")
    private String mobileNo;
    
	
	public float amount;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	


   
}
