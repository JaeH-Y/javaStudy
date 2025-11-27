package sec01.quiz;

import java.util.Scanner;

public class Quiz3 {
//	Quiz
//	원본 문자열과 찾는 문자열을 입력 받아 개수를 출력하는 프로그램을 구현하기 위해 
//	실행 클래스의 count 메서드를 작성하시오.
//	count(String 원본문자열, String 찾는문자열) 메서드는 원본 문자열에서 찾는 문자열의 개수를 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//
//	[입력]
//	1) 123AB123 AB
//	2) 123AB123 13
//	3) 123AB123AB12 AB
//
//	[출력]
//	1) 1
//	2) 0
//	3) 2
//
//  [힌트]
//	indexOf(String str, int fromIndex)를 이용해 반복해서 찾기
//	fromIndex: 검색 시작 위치 지정
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[입력]");
		String str1 = null;
		String str2 = null;
		String str3 = null;
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
		
		String[] strs1 = str1.split(" ");
		String[] strs2 = str2.split(" ");
		String[] strs3 = str3.split(" ");
		
		System.out.println("[출력]");
		System.out.println("1) " + count(strs1[0], strs1[1]));
		System.out.println("2) " + count(strs2[0], strs2[1]));
		System.out.println("3) " + count(strs3[0], strs3[1]));
		
	}
	public static int count(String origin, String find) {
		
		String[] arr = origin.split(find);
		int value = arr.length -1;
		return value;
	}

}
