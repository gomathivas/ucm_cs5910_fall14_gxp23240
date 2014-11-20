package edu.ucmo.ase.ecomm.sc.dao;

import java.util.List;

import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;

public interface ShoppingCartDAO {
	
	public List<ShoppingCart> findAllShoppingCartForAppUser(Integer appUserId);
	
	public List<ShoppingCart> findAllShoppinCartForAppUser(AppUser appUser);
	
	public void addShoppingCart(ShoppingCart cart);
	
	public void updateShoppingCart(ShoppingCart cart);
	
	public void removeShoppingCart(ShoppingCart cart);
	
	public void removeShoppingCartByID(Integer cartId);
	
	public boolean isProductInShoppingCart(Product product);
	
	public boolean isProductIdInShoppingCart(Integer productId);
	
	public void addProductToSC(Product product, int count);
	
	public void removeProductInSC(Product product, int count);

}
