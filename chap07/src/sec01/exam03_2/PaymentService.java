package sec01.exam03_2;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스: 결제 서비스의 미완성 된 공통 설계도
public class PaymentService {
	// 결제 메소드
	public void pay(int amount) {
		System.out.println("결제 금액: "+amount+"원");
		System.out.println("결제를 처리합니다.");
		
		
	}
}
