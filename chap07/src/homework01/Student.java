package homework01;

public class Student extends Person {
	
	private int grade;
	private String major;
	
	
	public Student() {
		
	}


	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String toString() {
		String info = "";
		info += "학년 : " + grade;
		info += "\n";
		info += "전공 : " + major;
		info += "\n";
		return super.toString() + info;
	}
}
