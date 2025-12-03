package sec01.exam10;

public class Student {

	private int sno;
	private String name;
	
	
	// 생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	
	// 오버라이딩
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
