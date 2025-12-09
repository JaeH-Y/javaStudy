package sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("김재현", 85));
		studentList.add(new Student("박민수", 92));
		studentList.add(new Student("유재석", 87));
		
		// Student 스트림을 score 스트림으로 변환
		studentList.stream() // 오리지널 스트림
//			.mapToInt(s -> s.getScore()) // 중간 처리: Student -> int
			.mapToInt(s -> s.getScore() * 10) // 데이터 가공 처리도 가능
			.forEach(score -> System.out.println(score)); // 최종 처리: 출력
		
	}

}
