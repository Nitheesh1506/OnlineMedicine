package com.OnlineMedicalShop.exception;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MedicineControllerException {
	
	@ExceptionHandler(value = MedicineIdDoesNotExistException.class)
	public ResponseEntity<?> medicineExists(MedicineIdDoesNotExistException medicineIdDoesNotExistException){
   HashMap<String, String> response = new HashMap<>();
	response.put("message", "Medicine does not exists..Out Of Stock");
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

}
