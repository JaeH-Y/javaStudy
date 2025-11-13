package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example02 {
	public static void main(String[] args) {
		
		int sum, i;
		
		for(i = sum = 0; i < 100; i ++) {
			sum += (i+1);
		}
		System.out.println(sum);
		System.out.println("1~" + i + "의 합: " + sum);
		
		// (참고) 무한 루프
		int count = 0;
		for(;;) {
			System.out.println("무한반복");
			count++;
			
			if(count==6) {
				break;
			}
		}
		
		// Quiz1: 1부터 100까지 짝수의 합
		sum = 0;
		for(int j = 1; j <= 100; j++) {
			if(j % 2 == 0) {
				sum += j;
			}
		}
		System.out.println("짝수의 합: " + sum);
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int inputI= sc.nextInt();
		
		int startP = inputI % 2 == 0 ? 2 : 1;
		int text = startP;
		sum = 0;
		for(; startP <= inputI; startP +=2) {
			sum += startP;
		}
		System.out.println(text + "부터 "+inputI+"까지의 합: "+ sum);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
