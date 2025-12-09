package sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

	public static void main(String[] args) {
		// 문장 스트림을 단어 스트림으로 변환
		List<String> list = new ArrayList<String>();
		list.add("this is java");
		list.add("i am a best developer");
		list.stream() // 오리지널 스트림: Stream<String> => 문자열이 2개 흘러감
			.map(data -> Arrays.stream(data.split(" "))) // 3개 짜리 + 5개 짜리 = 문자열 8개가 흘러가는 새로운 스트림 생성
			.forEach(word -> System.out.println(word));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream() // 오리지널 스트림: Stream<String> => 문자열이 2개 흘러감
		.flatMap(data -> Arrays.stream(data.split(" "))) // 3개 짜리 + 5개 짜리 = 문자열 8개가 흘러가는 새로운 스트림 생성
		.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		// 문자열 숫자 목록 스트림을 숫자 스트림으로 변환
		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream() // 2개의 문자열이 흘러감
			.flatMapToInt(data -> { // int 값으로 펼치겠다. 예: "10, 20, 30" -> 10 20 30
				String[] strArr = data.split(",");
				int[] intArr = new int[strArr.length];
				for (int i = 0; i < strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr); // 3개의 IntStream 리턴 + 2개의 IntStream 리턴
			})
			.forEach(number -> System.out.println(number)); // 5개의 int가 흘러가는 IntStream 출력
		
		// (참고) Function<? super T, ? extends R>
		// 리턴 타입이나 매개변수 타입에 쓰일 수 있음
		// super: T이거나 T의 부모라면 올 수 있다.(즉, 최소한 T 타입 이상이 와야 함)
		// extends: R이거나 R의 자식이면 올 수 있다.(즉, 최대 R 타입 이하가 와야 함)
		
	}

}
