package com.homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(\"-\" 포함)를 입력하세요: ");
		String citizenNum = sc.nextLine();
		
		String sexual = citizenNum.charAt(7) == '1' || citizenNum.charAt(7) == '3'
						? "남성입니다." : citizenNum.charAt(7) == 2 || citizenNum.charAt(7) == '4'
						? "여성입니다." : "잘못된 값입니다.";
		
		System.out.println(sexual);
		
		sc.close();
	}
}
