package sec10.exam01;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 수
		long count = Arrays.stream(arr).filter(value -> value % 2 == 0).count();
		System.out.println("2의 배수의 갯수: " + count);
		
		// 합계
		long sum = Arrays.stream(arr).filter(value -> value % 2 == 0).sum();
		System.out.println("2의 배수의 합: "+ sum);
		
		// 평균
		double avg = Arrays.stream(arr).filter(value -> value % 2 == 0).average().getAsDouble();
		System.out.println("2의 배수의 평균: "+ avg);
		
		// 최대값
		int max = Arrays.stream(arr).filter(value -> value % 2 == 0).max().getAsInt();
		System.out.println("2의 배수의 최대값: "+ max);
		
		// 최솟값
		int min = Arrays.stream(arr).filter(value -> value % 2 == 0).min().getAsInt();
		System.out.println("2의 배수의 최솟값: "+ min);
		
		// 첫번 째 요소
		int atFirst = Arrays.stream(arr).filter(value -> value % 3 == 0).findFirst().getAsInt();
		System.out.println("3의 배수 중 첫번 째 값: "+ atFirst);

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
