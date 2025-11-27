package sec02.exam02;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {
	public static void main(String[] args) {
//		Calendar now = new Calendar();
		Calendar now = Calendar.getInstance();	// Calendar 하위(자식) 객체를 리턴(현재 시스템에 맞는)
		
		int year = now.get(Calendar.YEAR);	// 연도
		int month = now.get(Calendar.MONTH)+1;	// 월
		int day = now.get(Calendar.DAY_OF_MONTH);	// 일
		int date = now.get(Calendar.DAY_OF_WEEK);	// 요일
		String strDate = null;
		switch (date) {
			case Calendar.MONDAY:
				strDate = "월";
				break;
			case Calendar.TUESDAY:
				strDate = "화";
				break;
			case Calendar.WEDNESDAY:
				strDate = "수";
				break;
			case Calendar.THURSDAY:
				strDate = "목";
				break;
			case Calendar.FRIDAY:
				strDate = "금";
				break;
			case Calendar.SATURDAY:
				strDate = "토";
				break;
			case Calendar.SUNDAY:
				strDate = "일";
				break;
		}
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.println(strDate + "요일");
		
		int amPm = now.get(Calendar.AM_PM);	// 오전: 0, 오후: 1
		String strAmPm = null;
		
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}
		else strAmPm = "오후";
		
		System.out.print(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);
		
		System.out.print(hour + "시 ");
		System.out.print(min + "분 ");
		System.out.println(sec + "초 ");
		
		System.out.println("==================================");
		
		// 자바 8 이후 권장 방식
		// Calendar 대신 java.time API로 대체
		// 현재 날짜/시간 얻기
		LocalDateTime now2 = LocalDateTime.now();
		
		// 날짜 구성 요소 얻기
		int year2 = now2.getYear();
		int month2 = now2.getMonthValue();
		int day2 = now2.getDayOfMonth();
		
		System.out.print(year2 + "년 ");
		System.out.print(month2 + "월 ");
		System.out.print(day2 + "일 ");
		
		DayOfWeek date2 = now2.getDayOfWeek();
//		System.out.println(date2);
		String strDate2 = date2.getDisplayName(TextStyle.FULL, Locale.KOREAN);
		System.out.println(strDate2);
		
		// 오전, 오후 구분
		int hour24 = now2.getHour();
		String strAmPm2 = hour24 < 12 ? "오전 " : "오후 ";
		System.out.print(strAmPm2);
		
		int hour12 = hour24 % 12;
		if(hour12 == 0) hour12 = 12;
		
		int min2 = now2.getMinute();
		int sec2 = now2.getSecond();
		
		System.out.print(hour12 + "시 ");
		System.out.print(min2 + "분 ");
		System.out.println(sec2 + "초 ");
		
		// 시간 비교하기
		LocalDateTime todayTime = LocalDateTime.now();
		LocalDateTime deadline = LocalDateTime.of(2025, 11, 27, 18, 0);
		
		if(todayTime.isBefore(deadline)) {
			System.out.println("마감 시간 전입니다. 작업을 계속하세요.");
		}
		else if(todayTime.isAfter(deadline)) {
			System.out.println("마감 시간이 지났습니다. 제출을 마감합니다.");
		}
		else {
			System.out.println("지금이 마감 시간입니다!");
		}
		
		// 날짜/시간 차이 구하기
		// 날짜 차이
		LocalDate startDate = LocalDate.of(2025, 4, 7);
		LocalDate endDate = LocalDate.of(2025, 10, 24);
		
		
		// 날짜 차이 계산
		// Period 클래스: 두 날짜 사이의 간격을 다루는 클래스
		Period period = Period.between(startDate, endDate);
		
		System.out.println("년 차이: "+ period.getYears());
		System.out.println("월 차이: "+ period.getMonths());
		System.out.println("일 차이: "+ period.getDays());
		
		System.out.println("=================================");
		
		// 시간 차이 계산
		// Duration: 두 시간 사이의 간격을 다루는 클래스
		LocalTime start = LocalTime.of(10,0,0);
		LocalTime end= LocalTime.of(10,5,30);
		
		Duration duration = Duration.between(start, end);
		
		System.out.println("총 초: " + duration.getSeconds());
		System.out.println("총 분: " + duration.toMinutes());
		
		// 차이 계산: ChronoUnit
		// 두 날짜/시간 사이의 차이를 원하는 단위로 바로 계산
		long dayBetween = ChronoUnit.DAYS.between(startDate, endDate);
		// 사용 가능한 단위: DAYS, WEEKS, MONTHS, YEARS 등등
		System.out.println(dayBetween);
		
		
	}
}
