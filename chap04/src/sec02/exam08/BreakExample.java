package sec02.exam08;

public class BreakExample {
	public static void main(String[] args) {
		while(true) {
			// 1부터 6 사이의 임의의 정수값
			int num = (int)(Math.random() * 6) + 1;
			
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		// Quiz
//		1부터 n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 
//		n과 n까지의 합을 출력하는 프로그램을 구현하시오.
//		
//		[출력]
//		45까지의 합: 1035
		
		int sum = 0;
		int i=0;
		while(sum < 1000) {
			sum += ++i;
			
		}
		System.out.println(i+"까지의 합: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
