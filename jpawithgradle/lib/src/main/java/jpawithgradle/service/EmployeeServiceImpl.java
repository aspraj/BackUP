package jpawithgradle.service;

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
}