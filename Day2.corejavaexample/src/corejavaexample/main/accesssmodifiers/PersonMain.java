package corejavaexample.main.accesssmodifiers;

/**
 * @author UD SYSTEMS
 *
 */
public class PersonMain {

	/**
	 * @param args
	 */
	//The static modifier for creating a class methods and variables
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Rakesh");
		person.setLastName("Singh");
		person.address="New Delhi";
		person.age = 15;
		person.mobileNo=9999106218L;
		person.salary (50500);
		
		System.out.println(person.age);
				
	}
		
	public static void displayMessage() {
		Person person = new Person();
		//Static method can be accessible through objects but its good practice to access through class name
		person.display();
	}

}