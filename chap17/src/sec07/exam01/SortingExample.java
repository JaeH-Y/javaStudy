package sec07.exam01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("홍길동", 30));
		studentList.add(new Student("김재현", 10));
		studentList.add(new Student("유재석", 20));
		
		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted() // 최종 처리가 없으면 중간 처리는 동작하지 않음
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore())); 
		
		System.out.println();
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		studentList.stream()
			.sorted(Comparator.reverseOrder()) // 정렬 기준이 Comparable로 정의되어 있어야만 reverseOrder()가 뒤집어 적용
			.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
	}

}
