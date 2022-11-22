package com.OnlineMedicalShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.OnlineMedicalShop.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

	
	
	//@Query("SELECT f FROM payment")
	//public List<Payment> allpayment();

}