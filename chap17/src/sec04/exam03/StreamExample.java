package sec04.exam03;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
	public static int sum;
	
	public static void main(String[] args) {
//		int sum = 0;
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		
		// 권장 방식								// reduce(0, (a, b) -> a + b) => a += b;
		int sum1 = IntStream.rangeClosed(1, 100).reduce(0, (a, b) -> a + b);
		
		System.out.println("총합: " + sum1);
		
		int sum2 = IntStream.rangeClosed(1, 100).sum();
		System.out.println("총합: " + sum2);
		
		
	}

}
