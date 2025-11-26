package sec01.exam16;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		String subject2 = "자바 프로그래밍 자바 웹개발";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		System.out.println(subject.indexOf("자바"));
		System.out.println(subject2.indexOf("자바", 2));
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		// 참고 : 문자열 포함 여부를 알려주는 메소드
		if(subject.contains("자바")) {
			System.out.println("자바와 관련된 책이군요");
		}
		else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		
		
		
	}
}
