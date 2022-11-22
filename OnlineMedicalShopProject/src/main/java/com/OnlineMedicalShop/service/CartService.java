package com.OnlineMedicalShop.service;

import org.springframework.stereotype.Service;

import com.OnlineMedicalShop.model.Cart;

@Service
public interface CartService  {

	public Cart addtocart(Cart c);
}
