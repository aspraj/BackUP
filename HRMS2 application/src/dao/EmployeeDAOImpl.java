package dao;

import java.util.ArrayList;
import java.util.List;

import dto.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO{

	public static void main(String[] args) {

		
		List<EmployeeDTO> emp = new ArrayList<EmployeeDTO>();
		emp.add(new EmployeeDTO (11,"Aman"));
		emp.add(new EmployeeDTO (12,"Ram"));
		emp.add(new EmployeeDTO (13,"Raman"));
		
		System.out.println(emp);
	}

	@Override
	public String addEmployeeDetails(EmployeeDAO employee) {
		
		return null;
	}

	@Override
	public Employee addEmployeeById(Integer employeeId) {
		for(Employee employee:emp)
		return employee;
	}

}
