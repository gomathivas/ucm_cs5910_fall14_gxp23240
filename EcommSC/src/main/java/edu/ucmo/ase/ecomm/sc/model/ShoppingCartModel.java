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
	
//	public static void setTotal(BigDecimal total) {
//		ShoppingCartModel.total = total;
//	}
	
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

//	public void setSubTotal(BigDecimal subTotal) {
//		this.subTotal = subTotal;
//	}


	
}
