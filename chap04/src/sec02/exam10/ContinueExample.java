package sec02.exam10;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		// 짝수만 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 홀수인 경우
				continue; // 다음 반복을 계속해라(건너뜀)
			}
			System.out.println(i);
		}
		
		// Quiz
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요. 
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		[입력]
//		영희야 생 일 축 하 해 !
//		
//		[출력]
//		영희야생일축하해!
//		
//		힌트: 
//		- 문자열의 길이를 얻을 때는 length()를 사용, 예: str.length()
		
		Scanner sc = new Scanner(System.in);
		System.out.print("[입력]: ");
		String inputT = sc.nextLine();
		String fixString = "";
		for(int i =0; i < inputT.length(); i++) {
			if(inputT.charAt(i) == ' ') continue;
			
			fixString += inputT.charAt(i);
		}
		System.out.println(fixString);
		
		int [] arr = {1,2,3,4,5};
		int [] arr2 = {1,2,3,4,5};
		System.out.println(arr[0] == arr2[0]);
		
		
		
		
		
		
		
	}
}
