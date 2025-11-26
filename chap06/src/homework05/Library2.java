package homework05;

public class Library2 {
	
	// Method
	// 전달된 메세지를 출력하는 메소드 구현
	void PrintString(String message) {
		System.out.println(message);
	}
	// 1~100까지 합을 반환하는 메소드 구현
	int Sum1To100() {
		int sum = 0;
		for(int i = 0; i<100; i++) {
			sum +=(i+1);
		}
		return sum;
	}
	// 전달된 정수가 홀수인지 짝수인지 반환하는 메소드 구현
	int IsOneOrTwo(int num) {
		int a = num % 2;
		return a;
	}
	// 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
	boolean HasEnglishInString(String message) {
		for(int i = 0; i < message.length(); i++) {
			if((message.charAt(i) >= 'a' && message.charAt(i) <= 'z') ||(message.charAt(i) >= 'A' && message.charAt(i) <= 'Z')) {
				return true;
			}
		}
		return false;
	}
	// 문자열, 문자를 전달 받아 문자열에 문자가 몇 개 있는지 출력하는 메소드 구현
	void CountCharInString(char word, String leteral) {
		int count = 0;
		for(int i = 0; i<leteral.length(); i++) {
			if(word == leteral.charAt(i)) {
				count++;
			}
		}
		System.out.println(leteral + "안에 포함 된 "+word+"의 개수 : " + count);
	}
	// 전달된 정수의 구구단을 출력하는 메소드 구현
	void PrintInt99Dan(int num) {
		System.out.println("=== " + num + "단 ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}
	
	
	
	
	
}
