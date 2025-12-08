package sec03.exam01;

public class LambdaExample {
	public static void main(String[] args) {
		Person per = new Person();
		
		// Workable 인터페이스의 추상 메소드를 보고 만들기
		per.action1((name, job) -> {
			// 실제 실행할 내용
			System.out.println(name + "이");
			System.out.println(job + "을 합니다.");
		});
		
		per.action2(speak -> System.out.println(speak));
		
	}
}
