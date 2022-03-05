
/*                                 6                              */

package corejavaexample.main;

public class DepartmentMain {

	public static void main(String[] args) {
		//Using new keyword default constructor has been invoked
		Department department = new Department();
		department.setDeptId(15);
		department.setDeptName("Marketing");
		
		//Using new keyword parameterized constructor has been invoked
		Department departmentUsingParam = new Department(16,"Finance");
		
		System.out.println(department.getDeptName());
		System.out.println(departmentUsingParam.getDeptName());
		System.out.println("****************After setting the dept name****************");
		departmentUsingParam.setDeptId(15);
		departmentUsingParam.setDeptName("IT");
		
		System.out.println(departmentUsingParam.getDeptName());
	}

}