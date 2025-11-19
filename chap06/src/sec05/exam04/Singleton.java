package sec05.exam04;

public class Singleton {
	
	// Step 2
	private static final Singleton SINGLETON = new Singleton();
	// private으로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용
	
	
	
	
	// Step 1
	private Singleton() { // 외부에서 호출 불가능하게 private으로 선언
		
	}
	
	// Step 3
	public static Singleton getInstance() {
		return SINGLETON;
	}
	
	
	
	
	
	
	
	
}
