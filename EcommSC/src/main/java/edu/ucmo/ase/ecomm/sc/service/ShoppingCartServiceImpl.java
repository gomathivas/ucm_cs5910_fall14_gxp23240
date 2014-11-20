package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ucmo.ase.ecomm.sc.dao.ShoppingCartDAO;
import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	private static final Logger logger = LoggerFactory
			.getLogger(ShoppingCartServiceImpl.class);
	private ShoppingCartDAO shoppingCartDAO;
	
	
	
	public ShoppingCartDAO getShoppingCartDAO() {
		return shoppingCartDAO;
	}

	public void setShoppingCartDAO(ShoppingCartDAO shoppingCartDAO) {
		this.shoppingCartDAO = shoppingCartDAO;
	}

	@Override
	public List<ShoppingCartListModel> getAllSCForCustomer(Integer customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<ShoppingCartListModel> getAllSCForCustomer(
			CustomerModel cusModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addShoppingCart(ShoppingCartListModel scl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void udpateShoppingCart(ShoppingCartListModel scl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void removeShoppingCart(ShoppingCartListModel scl) {
		// TODO Auto-generated method stub
		
	}

}
