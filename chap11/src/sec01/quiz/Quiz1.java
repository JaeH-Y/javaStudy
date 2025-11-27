package sec01.quiz;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = null;
		String str2 = null;
		String str3 = null;
		
		System.out.println("[입력]");
		try(sc){
			System.out.print("1) ");
			str1 = sc.nextLine();
			System.out.print("2) ");
			str2 = sc.nextLine();
			System.out.print("3) ");
			str3 = sc.nextLine();
		}
		catch (Exception e) {
		}
		String[] strs = {str1, str2, str3};
		int[] answers = new int[strs.length];
		
		for(int i = 0; i < strs.length; i++) {
			int sum = 0;
			for(char c : strs[i].toCharArray()) {
				if('0' <= c && '9' >= c) {
					sum += c-'0';
				}
			}
			answers[i] = sum;
		}
		System.out.println("[출력]");
		
		for(int i = 0; i < answers.length; i++) {
			System.out.println((i+1) + ") " + answers[i] );
		}
	}

}
