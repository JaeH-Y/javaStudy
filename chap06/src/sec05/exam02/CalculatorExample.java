package sec05.exam02;

public class CalculatorExample {
	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기

		// 잘못된 접근 방식(메모리 낭비)
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi;
//		System.out.println("원의 넓이: "+result1);
		
		//static 접근 방식
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println("원의 넓이: "+result1);
		
		int result2 = Calculator.plus(10, 20);
		System.out.println("Calculator plus: "+result2);
		int result3 = Calculator.minus(10, 20);
		System.out.println("Calculator minus: "+result3);
		
		// 참고 : 주로 유틸리티성 기능에 쓰임
		
		
		
	}
}
