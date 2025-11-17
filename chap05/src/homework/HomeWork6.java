package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isFirst = true;
		while(true) {
			System.out.print("배열의 크기를 입력하세요 : ");
			int len = sc.nextInt();
			sc.nextLine();
			String[] arr = new String[len];
			// 문자열 삽입
			for(int i=0; i<arr.length; i++) {
				System.out.print((i+1)+"번째 문자열 :");
				String text = sc.nextLine();
				arr[i] = text;
			}
			
			String[] resultArr = Arrays.copyOf(arr, arr.length);
			while(true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				String answer = sc.nextLine();
				
				if("n".equalsIgnoreCase(answer)) {
					for(String item : resultArr) {
						System.out.println(item);
					}
					return;
				}
				if(!"n".equalsIgnoreCase(answer) && !"y".equalsIgnoreCase(answer)) {
					System.out.println("입력할 수 없는 값입니다.");
					continue;
				}
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int addLen = sc.nextInt();
				sc.nextLine();
				String[] addArr = Arrays.copyOf(resultArr, resultArr.length + addLen);
				
				for(int i=resultArr.length; i<addArr.length; i++) {
					System.out.print((i+1)+"번째 문자열 :");
					String text = sc.nextLine();
					addArr[i] = text;
				}
				
				resultArr = Arrays.copyOf(addArr, addArr.length);
				
			}
			
		}
		
	}
}
