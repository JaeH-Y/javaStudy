package sec02.exam05;

public class MainStringArrayArgumentExample {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		// 이클립스에서 실행할 때 argument 주는 방법:
		// Run Configurations > Arguments
		
		
		if(args.length != 2) {
			System.out.println("값의 수가 올바르지 않습니다.");
//			return;	// 메소드 종료 & 값의 반환(값이 있을 경우)
			
			System.exit(0);  // JVM 강제 종료 코드
			// 여기서 0을 정상 종료를 의미
		}
		
		// args[] 값 더한 결과 출력
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("args[]의 총 합: " + sum);
		
		
		
		
	}

}
