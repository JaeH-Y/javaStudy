package homework.condition;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int firstN = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int secondN = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int thirdN = sc.nextInt();
		
		int smallestN = 0;
		if(firstN < secondN && firstN < thirdN) {
			smallestN = firstN;
		}
		else if(secondN < firstN && secondN < thirdN) {
			smallestN = secondN;
		}
		else if(thirdN < secondN && thirdN < firstN) {
			smallestN = thirdN;
		}
		
		System.out.printf("세 수 중에서 가장 작은 수는 %d 입니다.", smallestN);
		
		sc.close();
	}

}
