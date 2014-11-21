package edu.ucmo.ase.ecomm.sc.domain;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItem {

	@Id
	@Column(name = "ORDER_ITEM_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_ITEM_ID_SEQUENCE")
	@SequenceGenerator(name = "ORDER_ITEM_ID_SEQUENCE", sequenceName = "ORDER_ITEM_ID_SEQUENCE")
	private Integer orderItemId;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;
	
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ORDER_ID")
	private Order order;
	
	@Column(name = "ORDER_ITEMS_STATUS_CODE")
	private Integer orderItemStatusCode;
	
	@Column(name = "ORDER_ITEMS_QUANTITY")
	private Integer orderItemQuantity;
	
	@Column(name = "ORDER_ITEMS_PRICE")
	private BigDecimal orderItemPrice;
	
	@Column(name = "OTHER_ORDER_ITEM_DETAILS")
	private String otherOrderItemDetails;

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getOrderItemStatusCode() {
		return orderItemStatusCode;
	}

	public void setOrderItemStatusCode(Integer orderItemStatusCode) {
		this.orderItemStatusCode = orderItemStatusCode;
	}

	public Integer getOrderItemQuantity() {
		return orderItemQuantity;
	}

	public void setOrderItemQuantity(Integer orderItemQuantity) {
		this.orderItemQuantity = orderItemQuantity;
	}

	public BigDecimal getOrderItemPrice() {
		return orderItemPrice;
	}

	public void setOrderItemPrice(BigDecimal orderItemPrice) {
		this.orderItemPrice = orderItemPrice;
	}

	public String getOtherOrderItemDetails() {
		return otherOrderItemDetails;
	}

	public void setOtherOrderItemDetails(String otherOrderItemDetails) {
		this.otherOrderItemDetails = otherOrderItemDetails;
	}
	
	
	
	
}
