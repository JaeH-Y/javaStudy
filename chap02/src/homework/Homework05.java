package homework;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
//		System.out.printf("입력한 숫자의 제곱은 %d입니다.\n", (int)Math.pow(num,2));
		System.out.printf("입력한 숫자의 제곱은 %d입니다.\n", num*num);
		
		
		sc.close();
		
	}

}
