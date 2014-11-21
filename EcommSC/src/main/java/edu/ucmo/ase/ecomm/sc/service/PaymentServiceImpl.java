package edu.ucmo.ase.ecomm.sc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.PaymentDAO;
import edu.ucmo.ase.ecomm.sc.model.PaymentModel;
@Service
public class PaymentServiceImpl implements PaymentService {
	
	private static final Logger logger = LoggerFactory
			.getLogger(PaymentServiceImpl.class);
	
	private PaymentDAO paymentDAO;
	

	public PaymentDAO getPaymentDAO() {
		return paymentDAO;
	}

	public void setPaymentDAO(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}

	@Override
	@Transactional
	public void addPayment(PaymentModel payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void cancelPayment(PaymentModel payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void cancelPaymentById(Integer paymentId) {
		// TODO Auto-generated method stub
		
	}

}
