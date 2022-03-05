package insertdatawithquery;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}

	@Override
	public Employee getEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeByName(empName);
	}

}
