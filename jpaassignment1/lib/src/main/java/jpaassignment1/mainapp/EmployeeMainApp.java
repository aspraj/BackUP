package jpaassignment1.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassignment1.data.Employee;

public class EmployeeMainApp {
	
	public static void main(String args[]) {

		Employee employee = new Employee(2,"Patel", "Shivaji Nagar", 50000);

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();
	
//		employee.setEmpId(1);
//		employee.setEmpName("Aman Singh");
//		employee.setEmpAddress("Shivaji Nagar");
//		employee.setEmpSalary(50000);
		
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		System.out.println(employee);
		
	}
}