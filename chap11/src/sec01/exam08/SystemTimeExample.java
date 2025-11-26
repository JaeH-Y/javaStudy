package sec01.exam08;

public class SystemTimeExample {
	public static void main(String[] args) {
		// 1부터 100만까지 합을 구하는데 걸리는 시간 측정
		long startTime = System.nanoTime();
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum+=i;
		}
		
		long endTime = System.nanoTime();
		
		System.out.println("1~1000000까지의 합: " + sum);
		System.out.println("계산에 " + (endTime - startTime) + "나노초가 소요되었습니다.");
		
		
		
	}
}
