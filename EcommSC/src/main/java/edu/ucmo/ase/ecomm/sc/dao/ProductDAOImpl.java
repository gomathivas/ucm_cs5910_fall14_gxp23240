package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import edu.ucmo.ase.ecomm.sc.domain.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProductsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductByID(Integer productID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProductByID(Integer productID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

}