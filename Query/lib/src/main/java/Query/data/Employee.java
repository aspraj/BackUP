package Query.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column (name="emp_Id") 
	private Integer empId;
	@Column (name="emp_Name") 
	private String empName;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	

}
