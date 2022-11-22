package com.OnlineMedicalShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="signup")
public class Signup {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	@NotEmpty(message="email is mandatory")
	public String email;
	@NotEmpty(message="password is mandatory")
	public String password;
	@NotEmpty(message="name is mandatory")
	public String name;
	public String address;
	public long mobilenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
