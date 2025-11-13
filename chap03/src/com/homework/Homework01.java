package com.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String inputT = sc.nextLine();
		
		String birdT = inputT.equals("간다") ? "온다" : "뭐라는겨";
		
		System.out.println("앵무새 :" + birdT);
		
		sc.close();
	}
}
