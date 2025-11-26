package sec01.exam13;

public class StringCharAtExample {
	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하기
		String ssn = "012345- 1234123";
		
		char gender = ssn.charAt(7);
		
		switch(gender) {
			case '1','3':
				System.out.println("남자입니다.");
				break;
			case '2','4':
				System.out.println("여자입니다.");
				break;
		}
		
		switch (gender) {
			case '1','3' -> System.out.println("남자입니다.");
			case '2','4' -> System.out.println("여자입니다.");
			
		}
	}
}
