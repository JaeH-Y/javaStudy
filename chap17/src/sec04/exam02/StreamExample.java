package sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		String[] strArray = {"홍길동", "김재현", "김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		// 다른 방법 참고
//		Stream<String> strStream2 = Stream.of(strArray);
		Stream<String> strStream2 = Stream.of("홍길동", "김재현", "김미나");
		strStream2.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		int[] intArray = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
		// 다른 방법 주의!!
//		Stream<int[]> intStream2 = Stream.of(intArray); // 실수하면 배열 자체가 하나의 요소로 흘러가는 스트림이 되어버림
//		Stream<Integer> intStream2 = Stream.of(1, 2, 3, 4, 5);
		IntStream intStream2 = IntStream.of(intArray);
		intStream2.forEach(item -> System.out.print(item + ", "));
		System.out.println();
		
//		Arrays.stream(intArray)
	}

}
