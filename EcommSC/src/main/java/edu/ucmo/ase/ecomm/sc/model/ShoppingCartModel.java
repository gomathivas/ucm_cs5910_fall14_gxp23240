package edu.ucmo.ase.ecomm.sc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {

	private static  BigDecimal total = BigDecimal.ZERO;
	
	private List<ShoppingCartModel> scmList;
	
	private ProductModel product;
	private BigDecimal subTotal = BigDecimal.ZERO;
	private int count;
	
	public static BigDecimal getTotal(List<ShoppingCartModel> scmList) {
		
		total = BigDecimal.ZERO;
		for (ShoppingCartModel scm : scmList) {
			total = total.add(scm.getSubTotal());
		}
		return total;
	}
	
	public List<ShoppingCartModel> getScmList() {
		if(scmList == null)	{
			scmList = new ArrayList<ShoppingCartModel>();
		}
		return scmList;
	}
	
	public void setScmList(List<ShoppingCartModel> scmList) {
		this.scmList = scmList;
	}
	
	public ProductModel getProduct() {
		return product;
	}
	
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public BigDecimal getSubTotal() {
		subTotal = this.product.getNewPrice().multiply(new BigDecimal(this.count));
		return subTotal;
	}

	public void addProductToCart(ProductModel product)	{
		ShoppingCartModel scm = findSCMwithProduct(product);
		if(scm == null)	{
			ShoppingCartModel newSCM = new ShoppingCartModel();
			newSCM.setProduct(product);
			newSCM.setCount(1);
			getScmList().add(newSCM);
		}
		else	{
			scm.incrementCount();
		}
	}
	
	
	private void incrementCount() {
		this.count++;		
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
		return scmList.size();
	}
}
