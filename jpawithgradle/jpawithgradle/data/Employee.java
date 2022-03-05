package jpawithgradle.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {

	@Id
@Column (name = "emp_id")
	private Integer empId;

@Column (name = "emp_name")
	private String  empName;

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		
		return empName;
	}
	public void setEmpName(String emplName) {
		this.empName = emplName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
	
}