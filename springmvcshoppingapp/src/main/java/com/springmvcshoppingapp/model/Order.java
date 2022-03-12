package com.springmvcshoppingapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private String orderName;
//	private String orderStatus;
//	private LocalDate orderDate;
//	private LocalDate orderDeliveryDate;
	// One order will have more than one product in it. That we are writing using
	// List collection

	public Order() {
		// TODO Auto-generated constructor stub
	}
public Order(Long orderId, String orderName) {
	super();
	this.orderId = orderId;
	this.orderName = orderName;
}
public Long getOrderId() {
	return orderId;
}
public void setOrderId(Long orderId) {
	this.orderId = orderId;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
}

}