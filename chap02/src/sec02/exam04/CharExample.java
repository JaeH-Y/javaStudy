package sec02.exam04;

public class CharExample {
	public static void main(String[] args) {
		// char(2byte)
		// unsigned 하나의 문자를 유니코드로 저장 
		// 유니코드 : 세계 각국의 문자들을 2byte(0~65535) 범위에 맵핑한 국제 표준 규약
		
		char c1 = 'A';	// 실제로는 유니코드 값인 65가 메모리에 저장됨
		char c2 = 65;	// 정수 타입이라 정수값도 저장 가능;
//		char cc = -65;	// unsigned 타입이라 음수 값 저장 안됨
		char c3 = '\u0041';	// 유니코드를 의미 값을 16진수로 부여 -> 잘안씀
		
		int a = c1;
		System.out.println(a);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		System.out.println(c4);
		System.out.println(c5);
		
		// (참고) 특정 문자의 유니코드 값 알아내기
		
		char var1 = '韓';
		int code = var1;	// 자동 타입 변환
		System.out.println(code);
		System.out.println((int)var1);	// 강제 타입 변환
		
		
		// (참고) 문자를 숫자로 변환
		// 문자 '0' -> 유니코드 48
		System.out.println('1' - 0);	// 49 - 0
		System.out.println('1' - '0');	// 49 - 48 = 1;
		char var2 = '1';
		int code2 = var2;	// 자동 타입 변환
		System.out.println(code2);
		System.out.println((int)var2);	// 강제 타입 변환
		
		// 이런 방식은 문자를 숫자로 변환할 때 쓰일 수 있음
		char digit = '8';
		int numValue = digit - '0';
		System.out.println(numValue);
		
		/*
		 * 중요
		 * 1) 문자와 문자열은 다르다.
		 * 2) 빈 문자 처리에 대해
		*/
//		char c = ''; 	// 빈문자 컴파일 에러(유니코드 없음)
		char c = ' '; 	// 공백 문자 유니코드 존재
		
		String str = "";	// 빈 문자열 저장 가능
		
		
		
	}
}
