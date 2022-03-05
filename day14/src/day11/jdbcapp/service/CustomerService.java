package day11.jdbcapp.service;

import java.util.List;
import day11.jdbcapp.data.Customer;

public interface CustomerService {
	//CRUD operations 
		//Retrieve 
		public Customer getCustomerById(Integer customerId);
		public List<Customer> getAllCustomers();
		//Create 
		public Integer addCustomer(Customer customer);
		//Update
		public Integer updateCustomer(Customer customer);
		//Delete
		public Integer deleteCustomer(Integer customerId);
		
		public Integer restrictedDeleteCustomer(Integer customerId,boolean accessible);
		
		public String callProcedure(Integer custId);
}