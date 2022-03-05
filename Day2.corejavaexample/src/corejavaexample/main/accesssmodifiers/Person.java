
package corejavaexample.main.accesssmodifiers;

public class Person {
	/*
	 * Access Modifiers :- default , private, public, protected
	 * 
	 * private -  fields(or properties or attributes),methods or constructors declared private 
	 * 				cannot be accessed outside an enclosing class.
	 * 
	 * protected - can be accessed only child class in other packages.
	 * 
	 * default - within same package
	 * 
	 * Non-access modifiers - static, final,abstract,synchronized,volatile
	 */
	private String firstName;
	private String lastName;
	protected String address;
	public int age;
	long mobileNo;
	//to use the private content we are using getter setter method
	public static String salary;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static String getSalary() {
		return salary;
	}
	public static void setSalary(String salary) {
		Person.salary = salary;
	}
	public static void display() {
		System.out.println("I am a static method present in Person class");
	}
	public void salary(int i) {
		// TODO Auto-generated method stub
		
	}
	
		
	
	
}