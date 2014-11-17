package edu.ucmo.ase.ecomm.sc.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartModel {

	private List<ProductModel> scProduct = new ArrayList<ProductModel>();
	private double total;

	public List<ProductModel> getScProduct() {
		return scProduct;
	}

	public void setScProduct(List<ProductModel> scProduct) {
		this.scProduct = scProduct;
	}

	public double getTotal() {

		total = 0d;

		if (scProduct.isEmpty()) {
			return total;
		}

		for (ProductModel productModel : scProduct) {
			this.total = total + productModel.getNewPrice();
		}

		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void addProduct(ProductModel product)	{
		this.scProduct.add(product);
	}
	
	public void removeProduct(ProductModel product)	{
		
		if(scProduct.isEmpty())	{
			
		}
		else	{
			ProductModel tempProduct = null;
			for (ProductModel productModel : scProduct) {
				if(product.getProductId() == productModel.getProductId())	{
					tempProduct = productModel;
				}
			}
			scProduct.remove(tempProduct);
		}
	}
	
	public void clearProducts()	{
		this.scProduct.clear();
	}

	public Integer getSCProductCount()	{
		return scProduct.size();
	}
}
