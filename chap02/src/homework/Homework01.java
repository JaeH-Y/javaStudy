package homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		double weight;
		double tall;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) 입력: ");
		weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("키(m) 입력: ");
		tall = sc.nextDouble();
		
		bmi = weight/(tall * tall);
		System.out.printf("BMI 지수 : %.1f", bmi);
		
		
		sc.close();
	}
}
