package homework.loop;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		System.out.println("게임을 실행합니다!");
		Scanner sc = new Scanner(System.in);
		String answer;
		do {
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
			answer = sc.nextLine();
		}while(!answer.equals("no"));
		
	}

}
