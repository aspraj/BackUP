package test2passfail;

	public class Employee {
		private Integer employeeid;
		private String employeename;
		private String employeeaddress;
		private Integer employeesalary;
		
		public Employee() {
			super();	
		}
		
		public Employee(Integer employeeid, String employeename, String employeeaddress, Integer employeesalary) {
			super();
			this.employeeid = employeeid;
			this.employeename = employeename;
			this.employeeaddress = employeeaddress;
			this.employeesalary = employeesalary;
		}
		public Integer getEmployeeid() {
			return employeeid;
		}
		public void setEmployeeid(Integer employeeid) {
			this.employeeid = employeeid;
		}
		public String getEmployeename() {
			return employeename;
		}
		public void setEmployeename(String employeename) {
			this.employeename = employeename;
		}
		public String getEmployeeaddress() {
			return employeeaddress;
		}
		public void setEmployeeaddress(String employeeaddress) {
			this.employeeaddress = employeeaddress;
		}
		public Integer getEmployeesalary() {
			return employeesalary;
		}
		public void setEmployeesalary(Integer employeesalary) {
			this.employeesalary = employeesalary;
		}
		@Override
		public String toString() {
			return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", employeeaddress="
					+ employeeaddress + ", employeesalary=" + employeesalary + "]";
		}
		
		

	}
