package test2passfail;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	
//	 Demo.java
//package test2passfail;

	public static void main(String[] args) {
//		Employee employee=new Employee();
		List<Employee> employeelist=new ArrayList<Employee>();
		employeelist.add(new Employee(1,"Jyotika Agarwal","Kolkata",30000));
		employeelist.add(new Employee(2,"Akshat Sinha","Bengaluru",54000));
		employeelist.add(new Employee(3,"Aiswarya Roy","Kota",67453));
		employeelist.add(new Employee(4,"Ankit Singh","Rajesthan",34000));
		employeelist.add(new Employee(5,"Nikhil Arora","Nagpur",70000));
		
		
		Comparator<Employee> salaryComparator = (Employee o1,Employee o2)->o1.getEmployeesalary()-o2.getEmployeesalary();
		
		
		Comparator<Employee> nameComparator = (Employee o1,Employee o2)->o1.getEmployeename().compareTo(o2.getEmployeename());
		
		Collections.sort(employeelist,salaryComparator.thenComparing(nameComparator));
		
		for(Employee emp:employeelist)
		{
			System.out.println(emp);
		}
	}

}

