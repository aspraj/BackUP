package jpawithgradle.service;

import jpawithgradle.data.Employee;

public interface EmployeeService {
	

	public Employee getEmployee(Integer empId);

	public void addEmployee(Employee employee);
	
	public void deleteEmployee(Employee employee);
}