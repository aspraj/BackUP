package mainjava;

import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GetCustomer {

	@Test
	void  test() {
		fail("Not yet implemented");
	}
	@Test
	public void getCustomerByID() {
		LocalDate d = LocalDate.parse("1993-03-18");
		Customer c = new Customer (11,"Aman Singh",d,8827744656L,"amansinghpatel429@gmail.comn");
		CustomerDAOImpl customer = new CustomerDAOImpl();
		try {
				Cutomer result = customer.getCustomerByID(11);
				
				assertEqulas(result,c);
		}catch (CustomerNotFoundException e) {
			e.printStackTrace();
			

		}catch (CustomerAlreadyExistsException e) {
			e.printStackTrace();
		}
}
}