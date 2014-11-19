package edu.ucmo.ase.ecomm.sc.model;

import java.math.BigDecimal;

/**
 * @author dgunasek
 *
 */
public class ProductModel {

	private Integer productId;
	private String productShortDes;
	private String productLongDes;

	private BigDecimal newPrice;
	private BigDecimal oldPrice;

	public ProductModel() {
		super();
	}
	
	public ProductModel(Integer productId, String productShortDes,
			BigDecimal newPrice, BigDecimal oldPrice) {
		super();
		this.productId = productId;
		this.productShortDes = productShortDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}



	public ProductModel(String productShortDes, BigDecimal newPrice, BigDecimal oldPrice) {
		super();
		this.productShortDes = productShortDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}


	public ProductModel(String productShortDes, String productLongDes,
			BigDecimal newPrice, BigDecimal oldPrice) {
		super();
		this.productShortDes = productShortDes;
		this.productLongDes = productLongDes;
		this.newPrice = newPrice;
		this.oldPrice = oldPrice;
	}

	
	public ProductModel(Integer id, String shDec, double newPrice, double oldPrice) {
		super();
		this.productId = id;
		this.productShortDes = shDec;
		this.newPrice = new BigDecimal(newPrice);
		this.oldPrice = new BigDecimal(oldPrice);
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

	public String getProductLongDes() {
		return productLongDes;
	}

	public void setProductLongDes(String productLongDes) {
		this.productLongDes = productLongDes;
	}

	public BigDecimal getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(BigDecimal newPrice) {
		this.newPrice = newPrice;
	}

	public BigDecimal getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(BigDecimal oldPrice) {
		this.oldPrice = oldPrice;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductModel [productId=").append(productId)
				.append(", productShortDes=").append(productShortDes)
				.append(", productLongDes=").append(productLongDes)
				.append(", newPrice=").append(newPrice).append(", oldPrice=")
				.append(oldPrice).append("]");
		return builder.toString();
	}

	
	
}
