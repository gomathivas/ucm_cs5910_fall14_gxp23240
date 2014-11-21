package edu.ucmo.ase.ecomm.sc.dao;

import edu.ucmo.ase.ecomm.sc.domain.Order;
import edu.ucmo.ase.ecomm.sc.domain.OrderItem;
import edu.ucmo.ase.ecomm.sc.domain.Payment;

public interface PaymentDAO {
	
	public void addPayment(Payment payment);
	
	public void cancelPayment(Payment payment);
	
	public void cancelPaymentById(Integer paymentId);

	public void addOrder(Order order);

	public void addOrderItem(OrderItem orderItem);
	
	}
