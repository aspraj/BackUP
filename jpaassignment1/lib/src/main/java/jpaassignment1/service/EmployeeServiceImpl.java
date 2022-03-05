package jpaassignment1.service;

import jpaassignment1.dao.EmployeeDAO;
import jpaassignment1.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Override
	public void saveEmployeeDetails(int id, String name, String address, int salary) {

		employeeDAO.saveEmployeeDetails(id, name, address, salary);
	}

}
