package com.mohshub.ps.api.interfaces;

import com.mohshub.ps.api.entity.PaymentEntity;

public interface IPaymentService {

	public PaymentEntity savePayment(PaymentEntity paymentEntity);
	public String paymentProcessing();
}
