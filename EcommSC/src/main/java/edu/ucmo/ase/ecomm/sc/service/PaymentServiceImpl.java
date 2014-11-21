package edu.ucmo.ase.ecomm.sc.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.jpa.criteria.OrderImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.AppUserDAO;
import edu.ucmo.ase.ecomm.sc.dao.PaymentDAO;
import edu.ucmo.ase.ecomm.sc.dao.ProductDAO;
import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Order;
import edu.ucmo.ase.ecomm.sc.domain.OrderItem;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;
import edu.ucmo.ase.ecomm.sc.helper.ShoppingCartHelper;
import edu.ucmo.ase.ecomm.sc.model.HeaderModel;
import edu.ucmo.ase.ecomm.sc.model.PaymentModel;
import edu.ucmo.ase.ecomm.sc.model.SessionModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;
@Service
public class PaymentServiceImpl implements PaymentService {
	
	private static final Logger logger = LoggerFactory
			.getLogger(PaymentServiceImpl.class);
	
	private PaymentDAO paymentDAO;
	private AppUserDAO appUserDAO;
	private ProductDAO productDAO;
	

	public PaymentDAO getPaymentDAO() {
		return paymentDAO;
	}

	public void setPaymentDAO(PaymentDAO paymentDAO) {
		this.paymentDAO = paymentDAO;
	}

	@Override
	@Transactional
	public void addPayment(PaymentModel payment, SessionModel sm) {
		
		
		
		if(sm == null)	{
			throw new IllegalArgumentException("HeaderModel cannot be null");
		}
		HeaderModel hm = sm.getHeaderModel();
		if(hm == null)	{
			throw new IllegalArgumentException("HeaderModel cannot be null");
		}
		if(hm.getUser() == null)	{
			throw new IllegalArgumentException("User name cannot be null!!!");
		}
		
		AppUser appUser = this.appUserDAO.getAppUserByUserName(hm.getUser());
		
		ShoppingCartListModel scl = sm.getShoppingCartListModel();
		
		if(scl == null)	{
			throw new IllegalArgumentException("ShoppingCartListModel cannot be null!!!");
		}
		
		List<ShoppingCartModel> scmList = scl.getScmList();
		
		Order order = new Order();
		order.setAppUser(appUser);
		order.setOrderPlacedDate(new Date());
		
		Set<OrderItem> orderItems = new HashSet<OrderItem>();
		
		for (ShoppingCartModel scm : scmList) {
			Product product = this.productDAO.findProductByID(scm.getProduct().getProductId());
			OrderItem oi = new OrderItem();
			oi.setOrder(order);
			oi.setOrderItemPrice(scm.getProduct().getNewPrice());
			oi.setOrderItemQuantity(scm.getQuantity());
			oi.setProduct(product);
			orderItems.add(oi);
		}
		
		this.paymentDAO.addOrder(order);
		
		for (OrderItem orderItem : orderItems) {
			this.paymentDAO.addOrderItem(orderItem);
		}
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

	public AppUserDAO getAppUserDAO() {
		return appUserDAO;
	}

	public void setAppUserDAO(AppUserDAO appUserDAO) {
		this.appUserDAO = appUserDAO;
	}

	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}
