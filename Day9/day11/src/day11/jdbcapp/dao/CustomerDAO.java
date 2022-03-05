package day11.jdbcapp.dao;

import java.util.List;

import day11.jdbcapp.data.Customer;

public interface CustomerDAO {

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
	List<Customer> getAllCustomer();
	String callProcedure(Integer custId);
}