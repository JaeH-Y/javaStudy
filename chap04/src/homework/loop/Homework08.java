package homework.loop;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isSkip = false;
		String lastWords = "";
		WordCheck : while(true) {
			// 문자 제대로 입력했는지 검증
			String words = "";
			if(!isSkip) {
				System.out.print("문자열 : ");
				words = sc.nextLine();
				lastWords = words;
			}
			words = lastWords;
			System.out.print("문자 : ");
			String word = sc.nextLine();
			
			if(word.length() != 1) {
				System.out.println("찾는 문자는 1글자만 입력 가능합니다.");
//				sc.next();
				isSkip = true;
				continue;
			}
			int sameCount = 0;
			for (int i = 0; i < words.length(); i++) {
				if(word.charAt(0) == words.charAt(i)) {
					sameCount++;
				}
			}
			System.out.println("포함된 개수 : "+sameCount);
			isSkip = false;
			while(true) {
				System.out.print("다시 입력하시겠습니까? : ");
				String answer = sc.nextLine();
				System.out.println(answer.charAt(0));
				
				// "n".equalsIhnoreCase(변수) => 대소문자 구분 없이 비교(N,n)
				if(answer.length() != 1 || !(answer.charAt(0) == 'Y') && !(answer.charAt(0) == 'y') && !(answer.charAt(0) == 'N') && !(answer.charAt(0) == 'n')) {
					
					System.out.println("올바른 응답이 아닙니다. 다시 입력하세요.");
//					sc.next();
					continue;
				}
				else if((answer.charAt(0) == 'Y') || (answer.charAt(0) == 'y')) {
					break;
				}
				else if((answer.charAt(0) == 'N') || (answer.charAt(0) == 'n')) {
					break WordCheck;
				}
			}
		}
		
		System.out.println("끝");
		
	}

}
