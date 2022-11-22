package com.OnlineMedicalShop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineMedicalShop.exception.IdDoesNotExistException;
import com.OnlineMedicalShop.model.Payment;
import com.OnlineMedicalShop.repository.PaymentRepository;



@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;


	@Override
	public Payment savePaymentDetails(Payment payment) {
		// TODO Auto-generated method stub
		
		return paymentRepository.save(payment);
	}


	@Override
	public String deletePayment(int Id) {
		// TODO Auto-generated method stub
	
			 paymentRepository.deleteById(Id);
			 return "Deleted Successfully";
			
		}
	


	@Override
	public Payment viewPaymentById(int Id) throws IdDoesNotExistException {
		// TODO Auto-generated method stub
		Optional<Payment>pay=paymentRepository.findById(Id);
		if(pay.isPresent())
		{
			return pay.get();
		}
		throw new IdDoesNotExistException();
	
	}
}