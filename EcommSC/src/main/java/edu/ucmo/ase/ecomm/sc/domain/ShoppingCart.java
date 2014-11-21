package edu.ucmo.ase.ecomm.sc.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHOPPING_CART")
public class ShoppingCart {
	
	@Id
	@Column(name = "SHOPPING_CART_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SHOPPING_CART_ID_SEQUENCE")
	@SequenceGenerator(name = "SHOPPING_CART_ID_SEQUENCE", sequenceName = "SHOPPING_CART_ID_SEQUENCE")
	private Integer shoppingCartId;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "APP_USER_ID")
	private AppUser appUser;
	
	@OneToOne(cascade = { CascadeType.ALL})
	@JoinColumn(name="PRODUCT_ID" )
	private Product product;
	
	@Column(name = "QUANTITY")
	private Integer quantity;
	
	@Column(name = "PRODUCT_PRICE")
	private BigDecimal productPrice;
	
	@Column(name = "ACTIVE")
	private boolean active;

	public Integer getShoppingCartId() {
		return shoppingCartId;
	}

	public void setShoppingCartId(Integer shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
