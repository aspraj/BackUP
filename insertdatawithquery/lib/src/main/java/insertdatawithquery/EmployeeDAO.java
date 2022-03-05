package insertdatawithquery;

import java.util.List;

public interface EmployeeDAO {


	public List<Employee> getAllEmployee();

	public Employee getEmployeeByName(String empName);

}