package insertdatawithquery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main (String args[]) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();
	
	em.getTransaction().begin();
//	em.
	em.getTransaction().commit();
	
	
	
	@Override
	public List<Employee> getAllEmployee() {
		//select * from employee -- SQL statement
		//SELECT emp from Employee emp -- Java Persistence Query
		//select alias from <enity_name> alias
		Query query = em.createQuery("SELECT emp from Employee emp");
		List<Employee> listOfEmployee = query.getResultList();
		return listOfEmployee;
	}

	@Override
	public Employee getEmployeeByName(String empName) {
		//select * from employee where empName="" --- sql statement
		Query query = em.createNamedQuery("Employee.findByName");
		query.setParameter("empName", empName);
		
		return (Employee) query.getSingleResult();
	}
	
	
}
	}
