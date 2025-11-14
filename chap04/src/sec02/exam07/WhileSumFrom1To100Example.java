package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i < 100) {
			sum+= ++i;
		}
		System.out.println("1~"+(i)+" 합: " + sum);
		
		// (참고) 무한 루프
		
		int count = 1;
		while(true) {
//			System.out.println("Hello" + count);
			
			// 실제 사용 예 : 특정 조건을 만족하면 멈추도록 해야함
			
			if(count == 6) {
				break;
			}
			
			// 이 때는 break 뒤에 코드 실행 안됨
			count++;
		}
		System.out.println("break : " + count);
		count = 1;
		boolean flag = true;
		while(flag) {
//			System.out.println("Hello" + count);
			
			// 실제 사용 예 : 특정 조건을 만족하면 멈추도록 해야함
			
			if(count == 6) {
				flag = false;
			}
			
			// 이 때는 뒤에 오는 코드 실행됨
			count++;
		}
		System.out.println("flag : " + count);
		
		sum = 0;
		i = 1;
		
		do {	// 처음 한번은 무조건 실행!!
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println("1~"+(i-1)+" 합: " + sum);
		// 최소 한 번은 실행해야 하는 로직에 유용하지만, 실무에서는 거의 사용되지 않음
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		
		i=0;
		sum=0;
		while(i<100) {
			i++;
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("1~"+(i)+" 홀수의 합: " + sum);
		
		// Quiz2:
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수를 입력하세요 : ");
		String value = sc.nextLine();
		
		int len =value.length();
		sum = 0;
		i = 0;
		while(i < len) {
			int num = Integer.parseInt(value.charAt(i) + "");
			sum += num;
			i++;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}
}
