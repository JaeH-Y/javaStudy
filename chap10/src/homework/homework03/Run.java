package homework.homework03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		CharacterMenu cm = new CharacterMenu();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String countS = sc.nextLine();
		cm.menu(countS);
	}
}
