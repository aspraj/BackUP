
/*        4           */

package List;

public class Student implements Comparable {

	private Integer studentId;
	private String studentName;
	private Double Marks;
	
	

	public Student(Integer studentId, String studentName, Double marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		Marks = marks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getMarks() {
		return Marks;
	}

	public void setMarks(Double marks) {
		Marks = marks;
	}

	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", Marks=" + Marks + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		if (this.Marks == ((Student)o).Marks)
		{
			return 0;
		}
		else if
		(	this.Marks<((Student)o).Marks)
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}
}
