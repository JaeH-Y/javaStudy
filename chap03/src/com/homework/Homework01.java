package com.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String inputT = sc.nextLine();
		
		// 삼항 연산자 이용
		// 변수 쪽에 equals()를 호출하면, input이 null일 경우 예외(NPE)가 발생할 수 있음
		String birdT = inputT.equals("간다") ? "온다" : "뭐라는겨";
		
		System.out.println("앵무새 :" + birdT);
		
		sc.close();
	}
}
