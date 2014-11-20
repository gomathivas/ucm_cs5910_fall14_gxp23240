package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;

public interface ShoppingCartService {
	
	public List<ShoppingCartListModel> getAllSCForCustomer(Integer customerID);
	
	public List<ShoppingCartListModel> getAllSCForCustomer(CustomerModel cusModel);
	
	public void addShoppingCart(ShoppingCartListModel scl);
	
	public void udpateShoppingCart(ShoppingCartListModel scl);
	
	public void removeShoppingCart(ShoppingCartListModel scl);
	

}
