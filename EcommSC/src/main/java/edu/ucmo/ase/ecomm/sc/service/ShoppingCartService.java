package edu.ucmo.ase.ecomm.sc.service;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.model.CustomerModel;
import edu.ucmo.ase.ecomm.sc.model.HeaderModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;

public interface ShoppingCartService {
	
	public List<ShoppingCartListModel> getAllSCForCustomer(Integer customerID);
	
	public List<ShoppingCartListModel> getAllSCForCustomer(CustomerModel cusModel);
	
	public void addShoppingCart(ShoppingCartListModel scl);
	
	public void udpateShoppingCart(ShoppingCartListModel scl, ShoppingCartModel model);
	
	public void removeShoppingCart(ShoppingCartListModel scl,  ShoppingCartModel scm);
	
	public ShoppingCartModel getShoppingCartByProductId(Integer id, ShoppingCartListModel scListModel);
	
	public void saveShoppingCart(ShoppingCartListModel scl, HeaderModel hm);

	public void deActivateSC(ShoppingCartListModel shoppingCartListModel);

}
