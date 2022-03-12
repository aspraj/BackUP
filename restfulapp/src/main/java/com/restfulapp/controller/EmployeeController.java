package com.restfulapp.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapp.entity.Employee;
import com.restfulapp.exception.EmployeeNotFoundException;
import com.restfulapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/employees")
  List<Employee> all() {
	  System.out.println("");
    return employeeService.all();
  }
  // end::get-aggregate-root[]

  // Single item
  
  @GetMapping("/employees/{id}")
  Employee one(@PathVariable Long id) {
	  /** 
    return repository.findById(id)
      .orElseThrow(() -> new EmployeeNotFoundException(id));
	   **/
	  try {
		  return employeeService.one(id);
	  } catch (EmployeeNotFoundException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
	  }
	  return null;
  }


  @PutMapping("/replaceemployees/{id}")
  Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
    /**
    return repository.findById(id)
      .map(employee -> {
        employee.setName(newEmployee.getName());
        employee.setRole(newEmployee.getRole());
        return repository.save(employee);
      })
      .orElseGet(() -> {
        newEmployee.setId(id);
        return repository.save(newEmployee);
      });**/
	  return employeeService.replaceEmployee(newEmployee,id);
  }

  
  @GetMapping("/employeeByName")
  Employee getEmployeeByName(@RequestParam(value="eName") String name) {
	  return employeeService.getEmployeeByName(name);
  }
  
  @GetMapping("/deleteemployees/{id}")
  Employee two(@PathVariable Long id) {
	  /** 
    return repository.findById(id)
      .orElseThrow(() -> new EmployeeNotFoundException(id));
	   **/
	  try {
		  return employeeService.one(id);
	  } catch (EmployeeNotFoundException e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
	  }
	  return null;
  }
  
  @PostMapping("/employees")
  Employee newEmployee(@RequestBody Employee newEmployee) {
	  return employeeService.newEmployee(newEmployee);
  }

  //http://localhost:8080/employeeByName?eName=Aman
  @DeleteMapping("/deleteemployees/{id}")
  void deleteEmployee(@PathVariable Long id) {
    //repository.deleteById(id);
	  employeeService.deleteEmployee(id);
  }
}