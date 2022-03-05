package hrmsapp.service;

import layeredarchitecture.dto.Employee;

public interface EmployeeService {
	
	public String addEmployeeDetails(Employee employee);
	public Employee getEmployeeById(Integer employeeId);
}