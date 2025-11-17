package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		// 열거 타입 변수 선언
		
		Week today = null;	// 참조타입이라 null로 초기화 가능
		
		Calendar cal = Calendar.getInstance();	// 캘린더 객체 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 오늘의 요일 얻기(일요일 : 1 ~ 토요일: 7)
		
		System.out.println(week);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		default:
			break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 배드민턴을 칩니다.");
		}
		else System.out.println("열심히 자바 공부를 합니다.");
		
		
		// 정리: 열거 타입의 이점
		// 1. 특정 범위의 값만 사용 가능하므로 타입 안정성 보장(잘못된 값이 들어가면 바로 컴파일 에러 발생)
		// today = Week.THURSDAY;
		// today = "목요일";
		// 2. 값들이 명시적으로 정의되어 있어 가독성이 올라감(코드를 읽을 때 쉽게 이해 가능)
		// Week.SUNDAY 대신에 1을 사용하면 가독성 떨어짐
		// 3. 값이 추가되거나 변경되는 경우 한 곳에서만 변경하면 되기 때문에 유지보수(관리)가 용이
		// 4. 자동 완성 지원
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
