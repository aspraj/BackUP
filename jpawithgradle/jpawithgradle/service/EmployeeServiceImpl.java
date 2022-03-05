package jpawithgradle.service;

import java.util.List;

import jpawithgradle.dao.EmployeeDAO;
import jpawithgradle.dao.EmployeeDAOImpl;
import jpawithgradle.data.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	@Override
	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.addEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(employee);
	
	}

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

	@Override
	public void deleteEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployeeById(empId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(employee);
	}

	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(id, name);
	}

	@Override
	public Employee getEmployeeUsingTypedQuery(Integer empId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeUsingTypedQuery(empId);
	}

	@Override
	public List<Employee> getEmployeesUsingTypedQuery() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeesUsingTypedQuery();
	}
}