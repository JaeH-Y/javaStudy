package sec01.exam07;

public class ExitExample {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				// JVM을 강제 종료
				System.exit(0);	// 0 : 정상종료
//				break;	// 반복문 빠져나가기
//				return	// 메서드 종료하기
			}
		}
		
		System.out.println("마무리코드");
	}
}
