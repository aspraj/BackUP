package mainjava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GetCustomertest<Customer> implements CustomerDAO {
	List<Customer> customerList = new ArrayList<Customer>();
	@Override
	public Customer getCustomerById(Integer customerId) {
		customerList.add(new Customer(1,"Rajesh"));
		customerList.add(new Customer(12,"Rakesh"));
		
	}
		for(Customer customer : customerList) {
			if(customer.getCustomerId() == customerId){
				return customer;
			}
		}
		return null;
}

