package sec01.exam26;

public class ValueCompareExample {
	public static void main(String[] args) {
		// Wrapper 객체 내부의 값을 비교할 때는 ==을 사용하지 않는 것이 좋음
		// Unboxing해서 == 비교 하거나 , equals()로 비교한다.
		
		System.out.println("[-128 ~ 127 범위를 초과할 경우]");
		Integer obj1 = 200;
		Integer obj2 = 200;
		System.out.println("Integer obj1: " + obj1);
		System.out.println("Integer obj2: " + obj2);
		System.out.println("obj1 == obj2 : " + (obj1 == obj2));
		System.out.println();
		int i1 = obj1;
		int i2 = obj2;
		System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
		System.out.println("i1 == i2 : " + (i1 == i2));
		
		System.out.println();
		
		// 예외 : 범위값 안에 들어갈 경우 하나의 Integer 객체를 공유한다.
		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 20;
		Integer obj4 = 20;
		System.out.println("Integer obj3: " + obj3);
		System.out.println("Integer obj4: " + obj4);
		System.out.println("obj3 == obj4 : " + (obj3 == obj4));
		// 굳이 예외 범위를 알고 있을 필요 없이 Wrapper 객체 내부의 값을 비교할 때는 무조건 equals() 메소드를 사용하자.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
