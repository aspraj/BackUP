package jpawithgradle.dao;

import java.util.List;

import jpawithgradle.data.Employee;

public interface EmployeeDAO {
	
	public Employee getEmployee(Integer empId);

	public void addEmployee(Employee employee);
	
	public void deleteEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeByName(String empName);
}