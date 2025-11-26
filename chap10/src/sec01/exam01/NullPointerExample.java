package sec01.exam01;

public class NullPointerExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());	// 객체에 접근 -> 접근할 객체 없음
		// NPE 발생 시 .을 찾아서 참조 변수가 객체가 참조하고 있는지 확인
		// 실행 예외의 경우 컴파일은 가능(실행 중 예외 발생)
	}
}
