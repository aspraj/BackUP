package mydocsapp.util;

import static org.junit.Assert.*;
import mydocsapp.dto.User;
import mydocsapp.dao.UserDAOImpl;
import java.time.LocalDate;

import org.junit.Test;

public class UpdateToMYSQL {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	public void getUserByID() {
		LocalDate d = LocalDate.parse("1993-03-18");
		User c = new User (11,"Aman Singh");
		UserDAOImpl user = new UserDAOImpl();
	}		
	
}
