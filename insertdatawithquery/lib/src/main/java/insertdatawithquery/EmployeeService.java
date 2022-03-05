package insertdatawithquery;

import java.util.List;

public interface EmployeeService {

	List<Employee> getAllEmployee();

	Employee getEmployeeByName(String empName);
}
