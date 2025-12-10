package sec12.exam03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("이수진", "여", 87));
		totalList.add(new Student("김재현", "남", 95));
		totalList.add(new Student("양지은", "여", 93));
		
		// 남학생의 수, 여학생의 수 얻기
		Map<String, Long> stuNumByGender = totalList.stream()
			.collect(
				Collectors.groupingBy(	// 나 그루핑하고 싶어
					s -> s.getGender(),	// 성별 기준으로 할래
					Collectors.counting()	// 그루핑 된거 가공해줘(그룹별 요소 수 구하기)
				)
			);
		
		System.out.println(stuNumByGender);
		
		
		// 남학생의 평균 점수, 여학생의 평균 점수 얻기
		Map<String, Double> avgScoreMap = totalList.stream().collect(Collectors.groupingBy(
					s -> s.getGender(),
					Collectors.averagingDouble(s -> s.getScore())
				));
		System.out.println(avgScoreMap);
		
		// 남학생의 최고점수, 여학생의 최고점수 얻기
		Map<String, Optional<Student>> highScoreMap = 
				totalList.stream().collect(Collectors.groupingBy(
					s -> s.getGender(),
					Collectors.maxBy((a,b) -> Integer.compare(a.getScore(), b.getScore()))
				));
		System.out.println(highScoreMap);
		System.out.println(highScoreMap.get("남").get().getScore());
		System.out.println(highScoreMap.get("여").get().getScore());
		
	}
}
