package edu.ucmo.ase.sc.domain;

// default package
// Generated Oct 14, 2014 8:17:09 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderItemsStatusCode generated by hbm2java
 */
public class OrderItemsStatusCode implements java.io.Serializable {

	private BigDecimal orderItemsStatusCode;
	private String orderItemsStatusDescription;
	private Set orderItemses = new HashSet(0);

	public OrderItemsStatusCode() {
	}

	public OrderItemsStatusCode(BigDecimal orderItemsStatusCode) {
		this.orderItemsStatusCode = orderItemsStatusCode;
	}

	public OrderItemsStatusCode(BigDecimal orderItemsStatusCode,
			String orderItemsStatusDescription, Set orderItemses) {
		this.orderItemsStatusCode = orderItemsStatusCode;
		this.orderItemsStatusDescription = orderItemsStatusDescription;
		this.orderItemses = orderItemses;
	}

	public BigDecimal getOrderItemsStatusCode() {
		return this.orderItemsStatusCode;
	}

	public void setOrderItemsStatusCode(BigDecimal orderItemsStatusCode) {
		this.orderItemsStatusCode = orderItemsStatusCode;
	}

	public String getOrderItemsStatusDescription() {
		return this.orderItemsStatusDescription;
	}

	public void setOrderItemsStatusDescription(
			String orderItemsStatusDescription) {
		this.orderItemsStatusDescription = orderItemsStatusDescription;
	}

	public Set getOrderItemses() {
		return this.orderItemses;
	}

	public void setOrderItemses(Set orderItemses) {
		this.orderItemses = orderItemses;
	}

}
