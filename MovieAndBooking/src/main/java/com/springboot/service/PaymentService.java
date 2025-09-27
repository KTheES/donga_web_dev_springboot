package com.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
//	private final 
	
	public boolean processPayment(int price) {
		System.out.println(price + "원 결제 성공");
		return true;
	}
}
