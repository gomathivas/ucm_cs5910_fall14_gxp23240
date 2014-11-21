package edu.ucmo.ase.ecomm.sc.service;

import edu.ucmo.ase.ecomm.sc.model.PaymentModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;

public interface PaymentService {
	
	public void addPayment(PaymentModel payment, SessionModel sessionModel);
	
	public void cancelPayment(PaymentModel payment);
	
	public void cancelPaymentById(Integer paymentId);

}
