package sec01.exam02;

public class NullExample {
	public static void main(String[] args) {
		String hobby = null;
		
//		System.out.println(hobby.length());	// NullPointerException발생(참조하는 객체가 없어서)
		
		
		hobby = "배드민턴";
		System.out.println(hobby.length());
		
		String name = "윤재훈";
		name = null;	// 참조를 끊음
		
		
		// 이때 "윤재훈"이라는 문자열 객체는 쓰레기 객체가 됨
		// Garbage Collector가 CPU가 한가할 때 또는 메모리가 부족할 때 처리함
		
		
		int num = 9;
		
		int result = (int)Math.pow(num,0.5);
		
		System.out.println(result);
		
		
		
		
	}
}
