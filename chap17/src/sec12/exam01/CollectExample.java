package sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("이수진", "여", 87));
		totalList.add(new Student("김재현", "남", 95));
		totalList.add(new Student("양지은", "여", 93));
		
		
		// 스트림을 컬렉션으로 변환: toList(), toSet(), toMap() 등
		// 남학생만 묶어서 리스트화
		List<Student> manList = totalList.stream()
				.filter(x -> x.getGender().equals("남"))
				.collect(Collectors.toList());
//				.toList();
		manList.forEach(s -> System.out.println(s.getName()));
		System.out.println(manList.getClass());

		// 자바 16부터는 좀 더 편리하게 요소 스트림에서 List 컬렉션을 얻을 수 있음 
		List<Student> maleList = totalList.stream()
				.filter(x -> x.getGender().equals("남"))
				.toList();
		maleList.forEach(s -> System.out.println(s.getName()));
		System.out.println(maleList.getClass());
		
		// 학생의 이름을 키로. 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> scoreMap = totalList.stream()
				.collect(
					Collectors.toMap(
						s -> s.getName(),
						s -> s.getScore()
					)
				);
		System.out.println(scoreMap);
		
		
		
		
		
	}
}
