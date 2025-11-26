package sec02.exam06;

public class UserService {
	public void registerUser(int age) throws InvalidAgeException {
		if(age < 0) {
			// throw : 예외 발생시키기
			throw new InvalidAgeException("나이는 0보다 작을 수 없습니다.");
			// (참고) 만약 InvalidInputException 처럼 예외를 범용적으로 만들면
			// 메세지를 통해 무슨 오류인지 명확하게 표현할 수 있음
			
		}
		System.out.println("사용자 등록 완료 (나이: " + age + ")");
	}
}
