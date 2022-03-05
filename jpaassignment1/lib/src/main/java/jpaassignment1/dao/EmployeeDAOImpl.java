package jpaassignment1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassignment1.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public void saveEmployeeDetails(int id, String name, String address, int salary) {

		Employee employee = new Employee(id, name, address, salary);
		em.getTransaction().begin();
		if (employee!=null) {
		em.persist(employee);
		}
		em.getTransaction().commit();
	}

}
