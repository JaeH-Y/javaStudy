package sec01.exam23;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// Wrapper(포장) 객체: 기본 타입의 값을 갖는 객체
		
		// 박싱(Boxing): 기본 타입의 값 -> 포장 객체
		
		// 1. 생성자 이용
		Integer obj1 = new Integer(100);	// 기본 타입 값 100을 포장하는 Integer 객체
		Integer obj2 = new Integer("100"); 	// 내부적으로 문자열이 int로 변환되어 Integer 객체가 만들어짐
		
		// 2. valueOf() 메소드 이용
		Integer obj3 = Integer.valueOf(300);
		Integer obj4 = Integer.valueOf("400");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println();
		
		// 언박싱(Unboxing): 포장 객체 -> 기본 타입 값
		int value = obj3;
		int value1 = obj1.intValue();
		System.out.println(value);
		System.out.println(value1);
		
		
		
		
		
		
		
		
		
	}
}
