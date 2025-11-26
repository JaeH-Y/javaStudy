package sec02.exam05;

public class ThrowsExample {
	// main()을 호출하는 JVM 쪽으로 예외 떠넘기기 => 콘솔에 예외 내용 출력하고 프로그램 종료
//	public static void main(String[] args) throws ClassNotFoundException{
	public static void main(String[] args) {
		try {
			findClass();
		} 
		catch (ClassNotFoundException e) {	// e: 예외 객체
//			System.out.println("클래스가 존재하지 않습니다.");
			
			// 다양한 예외 출력 방법
			System.out.println(e.getMessage());	// 예외 메세지 출력(예외 객체를 만들 때 매개값으로 사용한 메세지)
//			System.out.println(e.toString());	// 예외 클래스 이름과 메세지를 함께 출력
			System.out.println(e);				// .toString() 자동 호출
//			e.printStackTrace();
			
			
		}
	}
	
	// 직접 처리하지 않고 "호출한 쪽에서 다양한 방식으로 처리할 수 있도록" 예외 떠넘기기
	// 이렇게 하면 호출하는 쪽에서 더 적절한 방식으로 대응할 수 있음
	// 주로 서비스 계층에서 예외를 처리하지 않고 컨트롤러나 UI 계층에서 처리하도록 넘길 때
	// 예: 로그 남기기, 재시도, 사용자에게 알림, 특정 페이지로 이동 등
	public static void findClass() throws ClassNotFoundException{
		
		Class clazz = Class.forName("java.lang.String2");
		
		
	}
	// 특정 기능 구현 시 항상 동일한 예외 처리를 원할 경우 메소드 안에서 직적 try-catch 처리하면 됨(항상 같은 처리 방식만 경험)
	
	
	
}
