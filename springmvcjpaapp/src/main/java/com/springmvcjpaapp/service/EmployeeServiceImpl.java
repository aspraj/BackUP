package com.springmvcjpaapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvcjpaapp.dao.EmployeeRepository;
import com.springmvcjpaapp.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		Optional<Employee> employee = employeeRepository.findById(empId);
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}

	@Override
	public Boolean deleteEmployeeById(Integer empId) {
		employeeRepository.deleteById(empId);
		if(employeeRepository.existsById(empId)) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
		if(employeeRepository.existsById(employee.getEmpId())) {
			return false;
		}
		return true;
	}

	@Override
	public Integer updateEmployee(Employee employee) {
		
		if(employeeRepository.existsById(employee.getEmpId())) {
				Employee emp = employeeRepository.save(employee);
				if(emp!=null) {
					return 1;
				}
		}
		return null;
	}

	@Override
	public Employee getEmployeeByName(String empName) {
		return employeeRepository.findEmployeeByName(empName);
	}

}