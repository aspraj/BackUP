package jpawithgradle.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpawithgradle.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();
	
	@Override
	public Employee getEmployee(Integer empId) {
		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, empId);
		em.getTransaction().commit();
		return employee;
	}
	
	Employee emp = new Employee();
	

	@Override
	public void addEmployee(Employee employee) {
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class,employee.getEmpId());
		if (emp!=null) {
		em.remove(emp);}
		em.getTransaction().commit();
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		Query query = em.createQuery("SELECT emp from Employee emp");
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee getEmployeeByName(String empName) {
	Query query = em.createNamedQuery("Employee.findByName");
	query.setParameter("empName", empName);
		return null;
	}


	
	

}