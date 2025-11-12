package homework;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korScore = sc.nextInt();

		System.out.print("영어 : ");
		int engScore = sc.nextInt();
		
		System.out.print("수학 : ");
		int mathScore = sc.nextInt();
		
		System.out.printf("총점 : %d\n", korScore+engScore+mathScore);
		System.out.printf("평균 : %d", (korScore+engScore+mathScore)/3);
		
		
		sc.close();
		
	}

}
