package homework;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];

		for(int i =0; i < arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 :");
			int num = sc.nextInt();
			arr[i] = num;
		}
		int sum = 0;
		for(int item : arr) {
			System.out.print(item + " ");
			sum += item;
		}
		System.out.println();
		System.out.println("총합 : " + sum);
	}
}
