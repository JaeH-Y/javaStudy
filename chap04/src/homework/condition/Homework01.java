package homework.condition;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {

		String priceT = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if(age > 64 || age < 3) {
			priceT = "무료";
		}
		else if(age >= 19) {
			priceT = "30000원";
		}
		else if(age >= 13) {
			priceT = "20000원";
		}
		else if(age >= 3) {
			priceT = "10000원";
		}
		
		System.out.printf("당신의 놀이동산 요금은 %s 입니다.",priceT);
		
		sc.close();
	}

}
