package com.mohshub.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohshub.ps.api.entity.PaymentEntity;
import com.mohshub.ps.api.interfaces.IPaymentService;
import com.mohshub.ps.api.repository.PaymentRepository;

@Service
public class PaymentService implements IPaymentService{

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public PaymentEntity savePayment(PaymentEntity paymentEntity) {
		paymentEntity.setPaymentStatus(paymentProcessing());
		paymentEntity.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(paymentEntity);
	}

	@Override
	public String paymentProcessing() {
		return new Random().nextBoolean() ? "Success" : "Failure";
	}

}
