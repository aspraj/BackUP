package com.springmvcshoppingapp.service;

import com.springmvcshoppingapp.model.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

//	public boolean deleteCustomer(Customer customer);


	boolean deleteCustomerById(Long customerId);

}
