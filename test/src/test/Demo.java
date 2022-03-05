package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo{
public static void main(String[] args){

	Employee e1 = new Employee(12, "Nidhi"  , "IT", 25500);
	Employee e2 = new Employee(13, "Suman"  , "Finance", 11500);
	Employee e3 = new Employee(14, "Payas"  , "IT", 12500);
	Employee e4 = new Employee(15, "Aparna"  , "Marketing", 5500);
	Employee e5 = new Employee(16, "Anjali" , "Operations", 7500 );

	List<Employee> employees = new ArrayList<Employee>();	
//add 5 Employee object to the above List
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	
//using Collections.sort() method to sort the Employee
	Collections.sort(employees , new salaryComparator());;
	

	
//print all the 5 sorted Employee object.
	
	employees.forEach(System.out::println);
	
}
}


