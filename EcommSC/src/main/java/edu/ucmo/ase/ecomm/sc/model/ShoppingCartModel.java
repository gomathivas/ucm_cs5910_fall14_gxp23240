package edu.ucmo.ase.ecomm.sc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {

	private ProductModel product;
	private BigDecimal subTotal = BigDecimal.ZERO;
	private int quantity;
	
	public ProductModel getProduct() {
		return product;
	}
	
	public void setProduct(ProductModel product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSubTotal() {
		subTotal = this.product.getNewPrice().multiply(new BigDecimal(this.quantity));
		return subTotal;
	}

	public void incrementQuantity() {
		quantity++;
	}


}
