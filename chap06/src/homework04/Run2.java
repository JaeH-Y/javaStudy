package homework04;

import homework03.Library;

public class Run2 {
	public static void main(String[] args) {
		Library2 lb = new Library2();
		
		// 전달된 메세지를 출력하는 메소드 구현
		lb.PrintString("전달된 메세지");
		// 1~100까지 합을 반환하는 메소드 구현
		int result = lb.Sum1To100();
		System.out.println("1 ~ 100의 합: " + result);
		// 전달된 정수가 홀수인지 짝수인지 반환하는 메소드 구현
		int result2 = lb.IsOneOrTwo(result);
		String message = result2 == 1 ? "홀수입니다." : "짝수입니다.";
		System.out.println(result+"는 홀수인가요 짝수인가요 : " + message);
		// 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
		String testString = "안녕Hello하세요";
		boolean isContain = lb.HasEnglishInString(testString);
		String message2 = isContain ? "있습니다." : "없습니다.";
		System.out.println(testString+"는 영문자가 있나요 : " + message2);
		// 문자열, 문자를 전달 받아 문자열에 문자가 몇 개 있는지 출력하는 메소드 구현
		lb.CountCharInString('p', "apple pie");
		// 전달된 정수의 구구단을 출력하는 메소드 구현
		lb.PrintInt99Dan(3);
		
		System.out.println(testString.split("H")[0]);
		int ind = testString.indexOf(testString);
	}
}
