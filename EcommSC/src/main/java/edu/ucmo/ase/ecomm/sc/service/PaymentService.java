package edu.ucmo.ase.ecomm.sc.service;

import edu.ucmo.ase.ecomm.sc.model.PaymentModel;

public interface PaymentService {
	
	public void addPayment(PaymentModel payment);
	
	public void cancelPayment(PaymentModel payment);
	
	public void cancelPaymentById(Integer paymentId);

}
