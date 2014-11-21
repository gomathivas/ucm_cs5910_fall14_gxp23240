package edu.ucmo.ase.ecomm.sc.helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import edu.ucmo.ase.ecomm.sc.domain.AppUser;
import edu.ucmo.ase.ecomm.sc.domain.Product;
import edu.ucmo.ase.ecomm.sc.domain.ShoppingCart;
import edu.ucmo.ase.ecomm.sc.model.ShoppingCartListModel;
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

	public static ShoppingCartListModel mapAllShoppingCartToModel(Set<ShoppingCart> scs, ShoppingCartListModel sclm)	{
		
		List<ShoppingCartModel> scmList = new ArrayList<ShoppingCartModel>();
		ShoppingCartModel scm = null;
		
		for (ShoppingCart sc : scs) {
			scm = mapShoppingCartToScm(sc);	
			scmList.add(scm);
		}
		
		sclm.setScmList(scmList);
		return sclm;
	}

	public static ShoppingCartModel mapShoppingCartToScm(ShoppingCart sc) {
		ShoppingCartModel scm = new ShoppingCartModel();
		
		scm.setProduct(ProductHelper.mapProductToProductModel(sc.getProduct()));
		scm.setQuantity(sc.getQuantity());
		scm.setShoppingCartId(sc.getShoppingCartId());
		
		return scm;
	}
}
