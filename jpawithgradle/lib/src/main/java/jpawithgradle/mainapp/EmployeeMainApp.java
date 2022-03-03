package jpawithgradle.mainapp;

import jpawithgradle.data.Employee;
import jpawithgradle.service.EmployeeService;
import jpawithgradle.service.EmployeeServiceImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.getEmployee(12);
		System.out.println(employee);
		
		Employee emp = new Employee();
		emp.setEmpId(15);
		emp.setEmpName("singh");
		employeeService.deleteEmployee(emp);
	}
}