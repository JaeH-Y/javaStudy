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
		
		
	}

}
