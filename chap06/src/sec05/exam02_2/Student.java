package sec05.exam02_2;

public class Student {
	// totalStudents는 모든 학생 객체가 공유하는 값
	// 객체를 만들 때마다 하나의 totalStudents를 모두가 함께 사용하고 변경
	
	static int totalStudents = 0;	// 전체 학생 수(공유됨)
	String name;
	
	public Student(String name) {
		this.name = name;
		totalStudents++;	// 학생이 만들어질 때마다 증가
	}
	
	public void printInfo() {
		System.out.println("이름: " + name);
	}
	
	public void printTotalStudents() {
		System.out.println("전체 학생 수 : "+totalStudents);
	}
	
	
	
	
	
}
