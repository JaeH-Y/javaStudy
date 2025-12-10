package sec12.exam02;

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
		
		// 요소 그룹핑: 남, 여 성별로 그룹핑 하기
		Map<String, List<Student>> gMap = totalList.stream()
			.collect(
					Collectors.groupingBy(s -> s.getGender())	// 그룹핑 키(성별)를 리턴 -> Map 객체의 Key로 사용됨
			);	// 성별로 나뉜 맵<String, List<Student>>을 반환한다
		
		List<Student> maleList = gMap.get("남");
		maleList.forEach(x -> System.out.println(x.getName()));
		System.out.println();
			
		List<Student> femaleList = gMap.get("여");
		femaleList.forEach(x -> System.out.println(x.getName()));
		
		
		
	}
}
