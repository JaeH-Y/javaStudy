package sec01.exam00;

public class LambdaExample {
		
	// 람다식 작성 연습
	// 람다식 작성 후 주석 처리
	
	// 메소드 1
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	// 람다식 1
//	(int a, int b) -> {
//		return a > b ? a : b; 
//	}
	
	// 람다식 2
//	(a, b) -> a > b ? a : b
	
	// 메소드2
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	// 람다식 2
//	(s, i) -> System.out.println(s + "=" + i)
	
	// 메소드3
	int square(int x) {
		return x * x;
	}
	
	// 람다식 3
//	x -> x * x
	
	// 메소드4
	int roll() {
		return (int) (Math.random() * 6);
	}					
	
	// 람다식 4
//	() -> (int)Math.random() * 6
}
