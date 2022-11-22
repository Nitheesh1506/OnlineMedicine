package com.OnlineMedicalShop.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PaymentControllerException {

	
	@ExceptionHandler(value = IdDoesNotExistException.class)
	public ResponseEntity<?> IdExists(IdDoesNotExistException idDoesNotExistException){
   HashMap<String, String> response = new HashMap<>();
	response.put("message", "Payment Id does not exists..");
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}
}
