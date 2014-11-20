package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;

@Repository
public class ShoppingCartDAOImpl implements ShoppingCartDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AppUserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	

	@Override
	public List<ShoppingCart> findAllShoppingCartForAppUser(Integer appUserId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ShoppingCart> findAllShoppinCartForAppUser(AppUser appUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addShoppingCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateShoppingCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeShoppingCart(ShoppingCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeShoppingCartByID(Integer cartId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isProductInShoppingCart(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isProductIdInShoppingCart(Integer productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addProductToSC(Product product, int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProductInSC(Product product, int count) {
		// TODO Auto-generated method stub
		
	}

}
