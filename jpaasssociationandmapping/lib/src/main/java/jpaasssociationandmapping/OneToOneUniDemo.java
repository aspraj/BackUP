package jpaasssociationandmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaasssociationandmapping.onetooneunidemo.Address;
import jpaasssociationandmapping.onetooneunidemo.Student;

public class OneToOneUniDemo {

	public static void main (String args[])
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaasssociationandmapping");
		EntityManager em = emf.createEntityManager();
//		Student student = new Student();
//		Address homeAddress = new Address();
//		
//		student.setName("Aman singh");
//		student.setAddress(homeAddress);
//		homeAddress.setCity("Timarni");
//		homeAddress.setState("M.P.");
//		homeAddress.setStreet("Hoshangabad road");
//		homeAddress.setZipCode("543211");
//		
//		em.getTransaction().begin();
//		em.persist(student);
//		em.getTransaction().commit();
		
		Student student =em.find(Student.class, 6);
		System.out.println(student.getStudentId()+" , "+student.getName());
		System.out.println(student.getAddress().getCity());
		
	}
}