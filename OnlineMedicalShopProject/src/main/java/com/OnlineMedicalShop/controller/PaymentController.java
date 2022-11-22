package com.OnlineMedicalShop.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineMedicalShop.model.Payment;
import com.OnlineMedicalShop.service.PaymentService;


@RestController
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/payment/{Id}")
	public ResponseEntity<Payment> viewPaymentById(@PathVariable(value="Id") int Id)
	{
		return new ResponseEntity<Payment>(paymentService.viewPaymentById(Id),HttpStatus.OK);
	}
	
	@PostMapping("/payment/savedetails")
	public ResponseEntity<Payment> savePaymentDetails(@RequestBody @Valid @NotBlank Payment payment)
	{
		return new ResponseEntity<Payment>(paymentService.savePaymentDetails(payment), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/payment/delete/{Id}")
	public ResponseEntity<String> deletePayment(@PathVariable int Id )
	{
	  return new ResponseEntity<String>(paymentService.deletePayment(Id), HttpStatus.OK);
	}
	

	
}
