package edu.ucmo.ase.ecomm.sc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.ucmo.ase.ecomm.sc.domain.Order;
import edu.ucmo.ase.ecomm.sc.domain.OrderItem;
import edu.ucmo.ase.ecomm.sc.domain.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AppUserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}



	@Override
	public void addOrder(Order order) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(order);
		logger.info("order saved successfully, Order Details="+ order);
		
	}


	@Override
	public void addOrderItem(OrderItem orderItem) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(orderItem);
		logger.info("orderItem saved successfully, orderItem Details="+ orderItem);
		
	}

	
	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelPayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelPaymentById(Integer paymentId) {
		// TODO Auto-generated method stub
		
	}




}
