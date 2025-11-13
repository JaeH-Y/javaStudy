package com.homework;

import java.util.Scanner;

public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수: ");
		int inputN = sc.nextInt();
		
		String printT = inputN % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println("구슬의 개수는 " + printT + "입니다.");
		
		sc.close();
	}
}
