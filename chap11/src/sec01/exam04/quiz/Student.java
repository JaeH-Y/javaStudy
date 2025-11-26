package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "[학번=" + studentNo + ", 이름=" + name + ", 전공=" + major + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student std)) return false;
		if(studentNo != std.studentNo || !name.equals(std.name)) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
//		return name.hashCode() + studentNo;
		// 해시코드 재정의 방법
		// Objects.hash(...)
		// 자바에서 여러 필드를 조합하여 간편하게 해시코드를 만들 수 있도록 제공되는 유틸리티 메소드
		// 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
		return Objects.hash(studentNo,name);
	}
}
