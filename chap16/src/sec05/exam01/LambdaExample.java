package sec05.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// 메소드 참조: 메소드를 참조해서 매개변수와 리턴 타입을 알아내 람다식을 축약해서 표현
		// 함수형 인터ㅠㅔ이스의 추상 메소드 구현을 해당 메소드로 연결(참조)한다는 의미
		
		// 1. 정적 메소드 참조
		person.action((x, y) -> {
			return Computer.staticMethod(x, y);
		});
		
		// 람다의 매개변수 -> 호출하는 메소드의 인자로 그대로 전달되는 구조
		person.action((x, y) -> Computer.staticMethod(x, y));
		
		// 메소드 참조를 이용한 축약 
		person.action(Computer::staticMethod);
		
		// 2. 인스턴스 메소드 참조
		Computer com = new Computer();
		
		person.action((x, y) -> {
			return com.instanceMethod(x, y);
		});
		
		person.action(com::instanceMethod);
		
		// 메소드 참조가 오히려 가독성이 떨어지면 일반 람다식을 적는 게 좋음
		
		// 메소드 참조가 가능한 패턴
		// - 인스턴스 메소드 1개 호출
		// - 정적 메소드 1개 호출
		// - 생성자 1개 호출
		// 즉, 람다식 본문이 "딱 하나의 메소드만 호출한 경우"여야 가능
		
		
		
		
		
		
	}
}
