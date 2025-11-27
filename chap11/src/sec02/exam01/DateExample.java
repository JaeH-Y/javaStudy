package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String strNow = sdf.format(now); // 원하는 날짜 포맷으로 문자열 반환
		System.out.println(strNow);
		
		// 참고
		// 주요 포맷 문자와 자주 쓰는 패턴
		// y: 연도(year) -> yyyy: 4자리 연도
		// M: 월(month) -> MM: 2자리 월(01~12)
		// d: 일(day) -> dd: 2자리 일
		// E: 요일(day name) -> E: 요일 약어, EEEE: 요일 전체 이름
		// a: 오전/오후(AM/PM)
		// H: 시(0~23시) -> HH: 24시간제 시(00~23)
		// h: 시(1~12시) -> hh: 12시간제 시(01~12)
		// m: 분(minute) -> mm: 2자리 분
		// s: 초(second) -> ss: 2자리 초
		// S: 밀리초
		
		// HH는 24시간제, hh는 12시간제(a와 함께 사용해야 오전/오후 구분 가능)
		// 대소문자를 구분합니다 (MM은 "월", mm은 "분")
		
		// Quiz
		// 아래와 같이 출력되도록 날짜 포맷을 지정하세요.
		// 25년 8월 4일 월요일 14시 5분 8초 137
		
		Date target = new Date(125, 7, 4, 14, 5, 8);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 EEEE hh시 mm분 ss초 S");
		String t = sdf2.format(target);
		
		System.out.println(t);
		
		
		// 참고: 자바8 이후 권장되는 방식(java.time API)
		// Date 대신 LocalDate, LocalDateTime 등을 사용 권장
		// SimpleDateFormat 대신 DateTimeFormatter 사용 권장
		// 훨씬 더 안전하고 직관적이며 사용성이 좋음
		// 날짜/시간 조작, 포맷팅, 시간대 처리 모두 쉽고 명확함
		
		// 1. LocalDate
		// 날짜(년, 월, 일) 정보만 가짐
		// 시간 정보 없음
		// 시간대 정보 없음
		// 생일, 기념일, 마감일 등 "날짜만 필요한 경우"에 사용
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// 2. LocalDateTime
		// 날짜(년, 월, 일) + 시간(시, 분, 초, 나노초) 정보를 가짐
		// 시간대 정보 없음
		// 주로 로그 생성 시간, 예약 시간 등 "날짜 + 시간"이 필요한 경우에 사용
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		// 3. ZonedDateTime
		// 날짜(년, 월, 일) + 시간(시, 분, 초, 나노초) + 시간대(서울, 뉴욕, 파리 등) 정보를 가짐
		// 표준 시간 변환이 필요할 때 주로 사용됨
		// 은행, 증권, 뉴스 등
		// 서버 간 시간 동기화, 국제화 시스템에 사용
		ZonedDateTime zoneTime = ZonedDateTime.now();
		System.out.println(zoneTime);
		
		// 참고: 시간 정보만 필요하면 LocalTime
		
		// 4. DateTimeFomatter
		DateTimeFormatter fomatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH시 mm분 ss초 SSS"); 
		System.out.println(dateTime.format(fomatter) + "ms");
		
		
		
		
		
		
		
		
		
		
		
	}

}
