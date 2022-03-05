package Query.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Query.data.Employee;
import Query.service.EmployeeService;
import Query.service.EmployeeServiceImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
		EntityManager em = emf.createEntityManager();
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee emp = new Employee();
		
		em.getTransaction().begin();
		emp.setEmpId(3 );
		emp.setEmpName("sohum");
		em.persist(emp);
		System.out.println(emp);
		em.getTransaction().commit();
		
//		em.getTransaction().begin();
//		emp = em.find(Employee.class, 3);
//		em.remove(emp);
//		System.out.println(emp);
//		em.getTransaction().commit();
//		
//		
//		em.getTransaction().begin();
//		emp.setEmpId(2);
//		emp.setEmpName("Raman");
//		employeeService.addEmployee(emp);
//		System.out.println(emp);
//		em.getTransaction().commit();
//		
//		em.getTransaction().begin();
//		emp = em.find(Employee.class, 4);
//		employeeService.deleteEmployee(emp);
//		System.out.println(emp);
//		em.getTransaction().commit();
//		
//		Employee employee = employeeService.getEmployee(5);
//		System.out.println(employee);
//		/**
//		Employee emp = new Employee();
//		emp.setEmpId(7);
//		emp.setEmpName("Borris Johnson");
//		//At this point of execution emp entity is in new state or transient state
//		//employeeService.addEmployee(emp);
//		//Delete an entity instance
//		employeeService.deleteEmployee(emp);
//		**/
//		System.out.println(employeeService.getAllEmployee());
//		System.out.println(employeeService.getEmployeeByName("Anjali Kumari"));
//		//employeeService.deleteEmployeeById(6);
//		//employee.setEmpName("Rajnath Singh");
//		//Update employee using method which takes employee object as an argument or parameter
//		//employeeService.updateEmployee(employee);
//		
//		//Update employee using method which takes id and name as an arguments
//		//employeeService.updateEmployee(5,"Jyotiradtiya Scindhia");
//		System.out.println(employeeService.getEmployeeUsingTypedQuery(5));
//		System.out.println(employeeService.getEmployeesUsingTypedQuery());		
	}
}
