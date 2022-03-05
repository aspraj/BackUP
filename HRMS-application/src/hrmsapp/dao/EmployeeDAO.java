package hrmsapp.dao;

import layeredarchitecture.dto.Employee;

public interface EmployeeDAO {
	public String addEmployeeDetails(Employee employee);

	public Employee getEmployeeById(Integer employeeId);
}