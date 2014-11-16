package edu.ucmo.ase.ecomm.sc.model;

public class ProductModel {

	private Integer productId;
	private String productShortDes;
	private String prodectLongDes;

	private double newPrice;
	private double oldPrice;

	public ProductModel() {
		super();
	}
	
	public ProductModel(Integer productId, String productShortDes,
			double newPrice, double oldPrice) {
		super();
		this.productId = productId;
		this.productShortDes = productShortDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}



	public ProductModel(String productShortDes, double newPrice, double oldPrice) {
		super();
		this.productShortDes = productShortDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}


	public ProductModel(String productShortDes, String prodectLongDes,
			double newPrice, double oldPrice) {
		super();
		this.productShortDes = productShortDes;
		this.prodectLongDes = prodectLongDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}

	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductShortDes() {
		return productShortDes;
	}

	public void setProductShortDes(String productShortDes) {
		this.productShortDes = productShortDes;
	}

	public String getProdectLongDes() {
		return prodectLongDes;
	}

	public void setProdectLongDes(String prodectLongDes) {
		this.prodectLongDes = prodectLongDes;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	public double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}

	
}
