package sec03.exam02;

// 열거 타입(한정된 값만 갖는 타입) 선언
public enum Week {
	// 열거 상수(=값을 변경할 수 없음) - 관례적으로 대문자로 작성
	// 여기에 정의되지 않은 값은 사용(대입) 불가
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY,
	SUNDAY
}

// (참고) 컴파일 시점에 자동으로 public static final 특성을 갖는 상수로 생성
