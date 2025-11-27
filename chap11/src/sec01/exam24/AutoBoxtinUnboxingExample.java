package sec01.exam24;

public class AutoBoxtinUnboxingExample {
	public static void main(String[] args) {
		
		// 자동 박싱
		Integer obj = 100;
		System.out.println("intValue: " + obj.intValue());
		
		
		// 자동 언박싱
		// 대입 시 
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 시 
		int result = obj + value;
		System.out.println("result: " + result);
	}
}
