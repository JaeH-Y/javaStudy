package sec05.exam02;

public class Person {
	public void ordering(Comparable comparable) {
		String a = "홍길동";
		String b = "김재현";
		
		int result = comparable.compare(a, b);
		
		if(result < 0) {
			System.out.println(a + "(은)는 " + b + "보다 앞에 있습니다.");
		}
		else if (result > 0) {
			System.out.println(a + "(은)는 " + b + "보다 뒤에 있습니다.");
		}
		else {
			System.out.println(a + "(와)과 " + b + "는 같습니다.");
		}
	}
}
