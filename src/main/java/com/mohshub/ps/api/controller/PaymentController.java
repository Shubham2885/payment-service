package com.mohshub.ps.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohshub.ps.api.entity.PaymentEntity;
import com.mohshub.ps.api.interfaces.IPaymentService;

@RestController
@RequestMapping("payment")
public class PaymentController {

	@Autowired
	private IPaymentService paymentService;
	
	@PostMapping("/doPayment")
	public PaymentEntity doPayment(@RequestBody PaymentEntity paymentEntity) {
		return paymentService.savePayment(paymentEntity);
	}
}
