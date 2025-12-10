package sec11.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReductionExample {
	public static void main(String[] args) {
		List<Student> stdList = Arrays.asList(
			new Student("홍길동", 92),
			new Student("김재현", 95),
			new Student("유재석", 88)
		);
		
		
		// 방법1
		int isSum = stdList.stream().mapToInt(x -> x.getScore()).sum();
		System.out.println("isSum: " + isSum);
		
		// reduce 활용
		// reduce(Integer identity, BinaryOperator<Integer> accumulator)
		// identity = 초기값 지정 => 0
		// accumulator = 수행할 누적 연산 => 람다식 => (a,b) -> a+b
		int reSum = stdList.stream().map(x -> x.getScore()).reduce(0, (a,b) -> a+b);
		System.out.println("reduceSum: " + reSum);
		
		// reduce()를 활용하면 다양한 커스텀 집계 구현 가능
		// max
		int max = stdList.stream().mapToInt(x -> x.getScore()).reduce(Integer.MIN_VALUE,(a,b) -> a >= b ? a : b);
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
