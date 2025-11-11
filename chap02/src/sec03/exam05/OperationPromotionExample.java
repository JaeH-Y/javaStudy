package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte bValue1 = 10;
		byte bValue2 = 20;
		
		int iValue1 = bValue1 + bValue2; // int + int
		System.out.println(iValue1);
		
		
		
		// char도 마찬가지(연산 시 int로 형변환)
		char cValue1 = 'A';
		char cValue2 = 1;
		int iValue2 = cValue1 + cValue2; // int + int
		System.out.println("유니코드= " + iValue2);
		// 문자로 출력하고 싶다면 char 타입으로 강제 형변환
		System.out.println("출력문자= " + (char)iValue2);
		
		// 정수 / 정수 = 정수
		
		int iValue3 = 10;
		int iValue4 = iValue3 / 4; // 정수 연산의 결과는 정수로 나온다.
		
		System.out.println(iValue4);
		
		// 실수 결과를 얻기 위해서는 피연산자 중 하나를 실수 타입으로 만들어야함
		
		double dValue = iValue3 / 4.0;
		System.out.println(dValue);
		
		// Quiz
//		아래의 변수들을 선언, 초기화하세요.
//		두 수를 더한 값을 출력하는 프로그램을 구성하세요.
//		1. 정수형 변수 num1에 10 할당
//		2. 실수형 변수 num2에 5.7 할당
//
//		[출력]
//		정수 결과: 15
//		실수 결과: 15.7
		
		int num1 = 10;
		double num2 = 5.7;
		
		int result1 = num1 + (int)num2;
		double result2 = num1 + num2;
		System.out.println(result1);
		System.out.println(result2);
		
		
	}

}
