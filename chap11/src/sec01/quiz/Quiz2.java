package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	원본 문자열과 삭제할 문자들을 입력 받아 실행 클래스의 deleteChar 메소드를 구현하시오.
//	deleteChar(String 원본문자열, String 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[입력]");
		String str1 = null;
		String str2 = null;
		try(sc){
			System.out.print("1) ");
			str1 = sc.nextLine();
			System.out.print("2) ");
			str2 = sc.nextLine();
		}
		catch (Exception e) {
		}
		
		String[] strs1 = str1.split("[!,-]");
		String[] strs2 = str2.split("[0-9]");
		StringBuffer buffer = new StringBuffer();
		
		for(String st : strs1) {
			buffer.append(st);
		}
		str1 = buffer.toString();
		buffer.setLength(0);
		for(String st : strs2) {
			buffer.append(st);
		}
		str2 = buffer.toString();
		buffer.setLength(0);
		
		System.out.println("[출력]");
		System.out.println("1) " + str1);
		System.out.println("2) " + str2);
		
		
		
		
	}

}
