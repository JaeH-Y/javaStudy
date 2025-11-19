package sec03.exam02;

import java.util.Arrays;

public class Korean {

	// 필드
	
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
//	public Korean(String _name, String _ssn){
//		name = _name;
//		ssn = _ssn;
//	}
	
	public Korean(String name, String ssn){
//		name = name; // 양쪽 다 매개변수(파라미터 전달 값) name을 가리킴
//		ssn = ssn;
		this.name = name;
		this.ssn = ssn;
		// 여기서 this는 객체 자기 자신을 참조
		// 객체 내부에서 자기 자신을 가리킬 때 사용
		
	}
	
}
