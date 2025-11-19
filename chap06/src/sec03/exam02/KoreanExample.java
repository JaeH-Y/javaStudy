package sec03.exam02;

public class KoreanExample {
	public static void main(String[] args) {
		// 생성자를 통해 객체의ㅣ 필드값 초기화
		
		Korean k1 = new Korean("윤재훈", "123123-1234123");
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		System.out.println();
		
		Korean k2 = new Korean("김자바", "930722-0654734");
		System.out.println("k1.nation: " + k2.nation);
		System.out.println("k1.name: " + k2.name);
		System.out.println("k1.ssn: " + k2.ssn);
		
		
		
		
		
		
	}
}
