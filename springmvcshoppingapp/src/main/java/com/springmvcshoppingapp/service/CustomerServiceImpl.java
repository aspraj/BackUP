package com.springmvcshoppingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcshoppingapp.dao.CustomerRepository;
import com.springmvcshoppingapp.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {

		return customerRepository.save(customer);

	}

	@Override
	public boolean deleteCustomerById(Long customerId) {
		customerRepository.deleteById(customerId);
		if(customerRepository.existsById(customerId)) {
			return false;
		}
		return true;
	}

//	@Override
//	public boolean deleteCustomer(Customer customer) {
//		customerRepository.delete(customer);
//		if(customerRepository.existsById(customer.getCustomerId())) {
//			return false;
//		}
//		return true;
//	}

}
