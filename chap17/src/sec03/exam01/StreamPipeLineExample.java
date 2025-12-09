package sec03.exam01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {

		// 불변 리스트 만드는 2가지 방법
		// 1. Arrays.asList(크기 불변 리스트): 요소 변경 가능(Set), add-remove 불가능, null값 저장 허용
//		List<Student> list = Arrays.asList(
//				new Student("홍길동", 10),
//				new Student("이길동", 20),
//				new Student("박길동", 30),
//				new Student("김길동", 40),
//				new Student("고길동", 50)
//		);
		
		
		// 2. List.of(완전 불변 리스트): 요소 변경 불가/크기 변경 불가/null금지
		List<Student> list = List.of(
				new Student("홍길동", 10),
				new Student("이길동", 50),
				new Student("박길동", 20),
				new Student("김길동", 40),
				new Student("고길동", 30)
		);
		
		// 방법 1
		// Student 객체가 흘러가는 Stream 얻기
		Stream<Student> stdStream = list.stream();
		
		
		// 중간 처리 연결하기(filter, map, sorted 등)
		// 이때 Student 객체의 어떤 값을 매핑시킬지 람다식 제공
		IntStream scoreStream = stdStream.mapToInt(std -> std.getScore());
		
		// 최종 처리(평균 점수)
		// IntStream에 들어있는 int 값에 대한 평균 구하기
		double avgScore = scoreStream.average().getAsDouble();
		
		System.out.println(avgScore);
		
		
		// 방법 2: 메소드 체이닝 이용
		double avgScore2 = list.stream().mapToInt(std -> std.getScore()).average().getAsDouble();
		System.out.println(avgScore2);
		
		
		// Quiz: 학생 객체를 학생의 이름으로 변환해서 출력해보기
		list.stream().map(std -> std.getName()).sorted().forEach(x -> System.out.println("이름: " + x));
		
		
	}
}
