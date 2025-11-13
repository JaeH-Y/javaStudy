package com.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수: ");
		int friends = sc.nextInt();
		System.out.print("사탕의 수: ");
		int candies = sc.nextInt();
		
		System.out.println("1인당 사탕 개수: " + candies/friends + "개");
		System.out.println("남은 사탕 개수: " + candies%friends + "개");
		
		sc.close();
	}
}
