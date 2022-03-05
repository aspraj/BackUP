package demo.readingconfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		//configuration metadata
		String springConfigurationFile = "springconfig.xml";
		try {
		//Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		//Here using context.getBean method we are trying to get instance of Customer class
		Customer cust=	context.getBean("customer", Customer.class);
		//Using cust object/bean instance we are accessing the object method 
		System.out.println(cust.getCustomerId());
		System.out.println(cust.getCustomerName());
		System.out.println(cust.getAddress().getCity());
		
		Address addrs = context.getBean("adds1",Address.class);
		System.out.println(addrs);
		//Person and its dependent beans
		Person person = context.getBean("personBean",Person.class);
		System.out.println(person.getResidentialAddress().getCity());
		System.out.println(person.getPermanentAddress().getCity());
		System.out.println(person.getAdharCardNumber());
		context.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

//public class Driver {
//
//	public static void main(String[] args) {
//		//configuration metadata
//		String springConfigurationFile = "springconfig.xml";
//		
//		//Instantiating a Spring IoC container
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
//		//Here using context.getBean method we are trying to get instance of Customer class
//		Customer cust=	context.getBean("customer", Customer.class);
//		//Using cust object/bean instance we are accessing the object method 
//		System.out.println(cust.getCustomerId());
//		System.out.println(cust.getCustomerName());
//		System.out.println("----------------------");
//		
////		Address adds=	context.getBean("address", Address.class);
////		System.out.println(adds.getCity());
////		System.out.println(adds.getCountry());
////		System.out.println(adds.getState());
////		System.out.println(adds.getAddressId());
////		System.out.println("----------------------");
////		
//		Address addre =	context.getBean("adds1", Address.class);
//		System.out.println(addre);	
//		System.out.println("----------------------");
//
//		Person person =	context.getBean("personBean", Person.class);
//		System.out.println(person.getAdharCardNumber());
//		System.out.println(person.getResidentialAddress().getCity());
//		System.out.println(person.getPermanentAddress().getCity());
//		
//		context.close();
//	}
//
//}
//
