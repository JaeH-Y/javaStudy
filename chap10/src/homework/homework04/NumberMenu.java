package homework.homework04;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		NumberController numC = new NumberController();
		try {
			System.out.println(num1+"은(는) " + num2+"의 배수인가? " + numC.checkDouble(num1, num2));
		}
		catch (NumRangeException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
