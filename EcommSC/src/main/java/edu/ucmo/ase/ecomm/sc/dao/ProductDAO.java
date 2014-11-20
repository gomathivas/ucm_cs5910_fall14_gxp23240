package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.Product;

public interface ProductDAO {
	
	public List<Product> findAllProducts();
	
	public List<Product> findAllProductsByCategory();
	
	public Product findProductByID(Integer productID);
	
	public void updateProductByID(Integer productID);
	
	public void addProduct(Product product);
	
}