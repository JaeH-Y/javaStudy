package sec01.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		// 익명 구현 객체 사용
		action(new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				int result = x + y;
				System.out.println(result);
			}
		});
		
		
		// 람다식 사용 1
		// 주의: 추상 메소드가 여러 개인 인터페이스의 익명 구현 객체는 람다식으로 표현 못함
		action((a, b) ->{
			System.out.println(a + b);
		});
		
		// 참고: 람다식은 익명 구현 객체이기 때문에 참조 변수에 대입 가능
		Calculable calculable = (a, b) ->{
			System.out.println(a + b);
		};	// 함수형 프로그래밍: 함수를 하나의 값으로 취급
		action(calculable);

		
		// 람다식 사용 2
		action((a, b) -> {
			int result = a - b;
			System.out.println(result);
		});
		
		
	}
	
	// 함수형 인터페이스 타입의 매개변수는 람다식을 받을 수 있다.
	// 익명 구현 객체를 간단히 표현한 식이 람다식
	// 내부적으로 람다식은 익명 구현 객체로 변환됨
	public static void action(Calculable calculable) {
		// 데이터
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);	// 구현 객체가 무엇이 오냐에 따라 결과가 달라짐
	}
}
