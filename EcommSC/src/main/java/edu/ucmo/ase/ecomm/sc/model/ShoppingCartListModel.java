package edu.ucmo.ase.ecomm.sc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartListModel {

	private static  BigDecimal total = BigDecimal.ZERO;
	private List<ShoppingCartModel> scmList;
	private int totalQuantity;
	
	public List<ShoppingCartModel> getScmList() {
		if(scmList == null)	{
			scmList = new ArrayList<ShoppingCartModel>();
		}
		return scmList;
	}
	
	public void setScmList(List<ShoppingCartModel> scmList) {
		this.scmList = scmList;
	}
	
	public static BigDecimal getTotal(List<ShoppingCartModel> scmList) {
		
		total = BigDecimal.ZERO;
		for (ShoppingCartModel scm : scmList) {
			total = total.add(scm.getSubTotal());
		}
		return total;
	}
	

	
	public void addProductToCart(ProductModel product)	{
		ShoppingCartModel scm = findSCMwithProduct(product);
		if(scm == null)	{
			ShoppingCartModel newSCM = new ShoppingCartModel();
			newSCM.setProduct(product);
			newSCM.setQuantity(1);;
			getScmList().add(newSCM);
		}
		else	{
			scm.incrementQuantity();
		}
	}
	
	public ShoppingCartModel findSCMwithProduct (ProductModel product)	{
		ShoppingCartModel scModel = null;
		for (ShoppingCartModel scm : getScmList()) {
			if(scm.getProduct().getProductId().compareTo(product.getProductId()) == 0)	{
				scModel = scm;
			}
		}
		
		return scModel;
	}
	
	public Integer getShoppingCartCount()	{
		return getScmList().size();
	}

	public int getTotalQuantity() {
		totalQuantity = 0;
		for (ShoppingCartModel shoppingCartModel : getScmList()) {
			totalQuantity = totalQuantity + shoppingCartModel.getQuantity();
		}
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	

}
