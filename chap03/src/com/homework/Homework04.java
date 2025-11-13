package com.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korScore = sc.nextInt();
		System.out.print("수학: ");
		int mathScore = sc.nextInt();
		System.out.print("영어: ");
		int enScore = sc.nextInt();
		
		int totalScore = korScore + mathScore + enScore;
		int avgScore = totalScore / 3;
		String phoneChangeExcute = avgScore > 90 ? "있습니다." : "없습니다.";
		phoneChangeExcute = korScore < 60 || mathScore < 60 || enScore < 60
							? "없습니다.\n몽둥이나 안맞게 조심하세요." : phoneChangeExcute;
		
		System.out.println("합계: " + totalScore + "점");
		System.out.println("평균: " + avgScore + "점");
		System.out.println("휴대폰을 바꿀 수 " + phoneChangeExcute);
		
		
		sc.close();
	}
}
