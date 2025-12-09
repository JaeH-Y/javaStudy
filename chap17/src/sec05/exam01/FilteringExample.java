package sec05.exam01;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김재현");
		list.add("유재석");
		list.add("김재현");
		list.add("김앤장");
		
		// 중복 요소 제거
		list.stream()
			.distinct()
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		// "김"으로 시작하는 요소만 필터링
		list.stream()
			.filter(t -> t.startsWith("김"))
			.forEach(t -> System.out.println(t));
		System.out.println();
		
		// 중복 요소를 먼저 제거하고, "김"으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(t -> t.startsWith("김"))
			.forEach(t -> System.out.println(t));
		System.out.println();
		
	}

}
