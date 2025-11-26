package sec01.exam02;

public class Student extends People {
	
	int studentNo;
	
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// 부모 클래스가 책임지는 초기화는 부모 생성자에게 맡기는 게 원칙적이고 안전한 방법
		this.studentNo = studentNo;
	}
	
	
	
}
