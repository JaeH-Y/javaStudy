package sec04.exam03;

public class Car {
	// 필드
	int gas;	//연료

	
	
	
	// 생성자
	// 기본 생성자 사용
	
	
	
	
	
	
	// 메소드
	// 연료를 주입하는 메소드(Setter)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 연료를 확인하는 메소드(Getter)
	boolean isLeftGas() {
		if(gas > 0) {
			System.out.println("gas가 있습니다.");
			return true;
		}
		System.out.println("gas가 없습니다.");
		return false;
	}
	
	// 달리는 메소드
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
//				return;	// 그 즉시 메소드 종료
				break;	// 가장 가까운 반복문을 빠져나감
			}
		}
		
		
	}
	
	
	
	
	
	
	
	
}
