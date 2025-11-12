package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = sc.nextLine(); // 스캐너에서 읽은 한 줄 전체(엔터 전까지)
			if(inputData.equals("q")) break;
			System.out.println(inputData);
		}
		
		System.out.println("종료");
		
	}

}
