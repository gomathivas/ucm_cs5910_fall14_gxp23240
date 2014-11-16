package edu.ucmo.ase.sc.domain;

// default package
// Generated Oct 14, 2014 8:17:09 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private BigDecimal orderId;
	private OrderStatus orderStatus;
	private AppUser appUser;
	private String orderStatus_1;
	private Date orderPlacedDate;
	private String orderDetails;
	private Set invoices = new HashSet(0);
	private Set orderItemses = new HashSet(0);
	private Set shipmentses = new HashSet(0);

	public Orders() {
	}

	public Orders(BigDecimal orderId, OrderStatus orderStatus) {
		this.orderId = orderId;
		this.orderStatus = orderStatus;
	}

	public Orders(BigDecimal orderId, OrderStatus orderStatus, AppUser appUser,
			String orderStatus_1, Date orderPlacedDate, String orderDetails,
			Set invoices, Set orderItemses, Set shipmentses) {
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.appUser = appUser;
		this.orderStatus_1 = orderStatus_1;
		this.orderPlacedDate = orderPlacedDate;
		this.orderDetails = orderDetails;
		this.invoices = invoices;
		this.orderItemses = orderItemses;
		this.shipmentses = shipmentses;
	}

	public BigDecimal getOrderId() {
		return this.orderId;
	}

	public void setOrderId(BigDecimal orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public AppUser getAppUser() {
		return this.appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	public String getOrderStatus_1() {
		return this.orderStatus_1;
	}

	public void setOrderStatus_1(String orderStatus_1) {
		this.orderStatus_1 = orderStatus_1;
	}

	public Date getOrderPlacedDate() {
		return this.orderPlacedDate;
	}

	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}

	public String getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(String orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Set getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set invoices) {
		this.invoices = invoices;
	}

	public Set getOrderItemses() {
		return this.orderItemses;
	}

	public void setOrderItemses(Set orderItemses) {
		this.orderItemses = orderItemses;
	}

	public Set getShipmentses() {
		return this.shipmentses;
	}

	public void setShipmentses(Set shipmentses) {
		this.shipmentses = shipmentses;
	}

}
