package edu.ucmo.ase.ecomm.sc.helper;

import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartModel;

public class ShoppingCartHelper {

	public static ShoppingCart mapShoppingCartModelToShoppingCart(
			ShoppingCartModel scm, AppUser appUser, Product product) {
		ShoppingCart sc = new ShoppingCart();
		
		sc.setActive(true);
		sc.setAppUser(appUser);
		sc.setProduct(product);
		sc.setProductPrice(product.getProductPrice());
		sc.setQuantity(scm.getQuantity());
				
		return sc;
	}

}
