package homework10;

public class Student {
	private static int student_Count;
	private int studentNo;
	private String name;
	private String className;
	
	
	
	public Student() {
		student_Count += 1;
		this.studentNo = student_Count;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	public int getStudentNo() {
		return studentNo;
	}
	
	
	
	
	
	
}
