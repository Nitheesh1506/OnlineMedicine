package com.OnlineMedicalShop.service;

import com.OnlineMedicalShop.exception.IdDoesNotExistException;
import com.OnlineMedicalShop.model.Payment;

public interface PaymentService {
	
	public Payment savePaymentDetails(Payment payment);
	public Payment viewPaymentById(int Id) throws IdDoesNotExistException;
	public String deletePayment(int Id);
	
}
