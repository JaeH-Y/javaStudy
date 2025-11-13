package sec02.exam09;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		System.out.println(charCode);
		
		if(charCode >= 65 & charCode <= 90) { // t & t => T
			System.out.println("대문자 입력됨");
			
		}
		
		if(charCode >= 97 && charCode <= 122) { // f && => F (Short-Circuit 동작)
			System.out.println("소문자 입력됨");
			
		}
		
		if(!(charCode < 48) && !(charCode > 57)) { // t && f => F 
			System.out.println("숫자 입력됨");
			
		}

		int value = 6;
		
		if(value % 2 == 0 | value % 3 == 0) { // t | t => T 
			System.out.println("2 또는 3의 배수 입력됨");
			
		}
		
		if(value % 2 == 0 || value % 3 == 0) { // t || => T (Short-Circuit 동작)
			System.out.println("2 또는 3의 배수 입력됨");
			
		}
		
		// 정리: 연산의 결과는 같은데 효율성(속도)이 더 높으므로 &&, ||를 사용
		
		
		
		
	}
}
