package com.springmvcshoppingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	  @Id
	@Column(name = "USER_ID")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	private String customerName;
	private Integer customerTier;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String customerName, Integer customerTier) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerTier = customerTier;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerTier() {
		return customerTier;
	}

	public void setCustomerTier(Integer customerTier) {
		this.customerTier = customerTier;
	}

}