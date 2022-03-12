package com.springmvcjpaapp.service;

import java.util.List;

import com.springmvcjpaapp.model.Employee;

public interface EmployeeService {
	//Retrieve
	public List<Employee> getAllEmployees();
	//Create
	public Employee addEmployee(Employee employee);
	//Retrieve
	public Employee getEmployeeById(Integer empId);
	
	//Delete
	public Boolean deleteEmployeeById(Integer empId);
	public Boolean deleteEmployee(Employee employee);
	
	//Update
	public Integer updateEmployee(Employee employee);
	public Employee getEmployeeByName(String empName);
}