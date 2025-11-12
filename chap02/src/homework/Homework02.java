package homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		
		
		double rowlength;
		double collength;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이: ");
		rowlength = sc.nextDouble();
		sc.nextLine();
		System.out.print("세로 길이: ");
		collength = sc.nextDouble();
				
		System.out.printf("면적 : %.2f \n", rowlength * collength);
		System.out.printf("둘레 : %.1f",(rowlength + collength)*2);
		
		sc.close();
		
	}
}
