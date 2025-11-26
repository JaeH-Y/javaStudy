package sec02.exam06;

public class UserServiceExample {
	public static void main(String[] args) {
		UserService userS = new UserService();
		
		try {
			userS.registerUser(10);
			userS.registerUser(-5);
		}
		catch (InvalidAgeException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}
	
	// 참고: 사용자 정의 예외
	// 왜 사용자 정의 예외가 필요한가? (필요성과 이유)
	// 1) 표준 예외는 추상적
	// 예외 클래스 이름만 봐도 무슨 일이 왜 잘못됐는지 명확하게 알 수 있음
	// 예: throw new CouponExpiredException(couponId);
	// throw new InsufficientBalanceException(userId, requiredAmount);
	
	// 2) 표준 예외는 재사용성이 있지만, 의미 전달력은 낮음
	// 사용자 정의 예외는 의도를 명확하게 드러내고, 흐름을 자연스럽게 이해할 수 있음
	// 표준 예외: throw new IllegalStateException("사용자 인증 안됨");
	// 사용자 정의 예외:  throw new UserNotVerifiedException(user.getId());
	
	// 사용자 정의 예외를 만들지 않고도 대부분의 예외 상황은 처리할 수 있음
	// 하지만 사용자 정의 예외를 만드는 것이 훨씬 더 명확하고 유지보수에 유리하기 때문에 사용
}
