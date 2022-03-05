	
	package test;

	public class Employee
	{
		// :- this should be the java bean class with following fields:-

	private int id;
	private String name;
	private String address;
	private int salary;

	//create parameterized constructor with all fields
	public Employee(int id, String name, String address, int salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	//create zero argument constructor
	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	//override toString() method with all fields
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
   }
}
