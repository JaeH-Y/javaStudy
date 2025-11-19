package sec05.exam05;

public class Person {
	
	// final 필드를 초기화하는 2가지 방법
	final String nation = "Korean"; // 1. 선언 시 초기화
	final String ssn; // 2. 생성자에서 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
}
