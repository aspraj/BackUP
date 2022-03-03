package jpawithgradle.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private Integer deptId;
	private String deptName;
	private String location;

	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}
	
	
}