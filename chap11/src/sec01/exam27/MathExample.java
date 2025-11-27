package sec01.exam27;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		// 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1); // v1=5
		System.out.println("v2=" + v2); // v2=3.14
		
		// 올림
		double v3 = Math.ceil(5.3); // 천장, (발음) 씰
		double v4 = Math.ceil(-5.3);
		System.out.println("v3=" + v3); // v3=6.0
		System.out.println("v4=" + v4); // v4=-5.0
		
		// 버림(내림)
		double v5 = Math.floor(5.3); // 바닥
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5); // v5=5.0
		System.out.println("v6=" + v6); // v6=-6.0
		
		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7); // v7=9
		System.out.println("v8=" + v8); // v8=5.3
		
		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9); // v9=5
		System.out.println("v10=" + v10); // v10=2.5
		
		// 랜덤값
		double v11 = Math.random(); // 0.0이상 1.0미만의 랜덤 실수값
		System.out.println("v11=" + v11); // v11=0.4612064419056173
		
		// 가까운 정수의 실수값
		double v12 = Math.rint(5.3); // (발음) 알-인트
		double v13 = Math.rint(5.7);
		System.out.println("v12=" + v12); // v12=5.0
		System.out.println("v13=" + v13); // v13=6.0
		
		// 반올림
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14=" + v14); // v14=5
		System.out.println("v15=" + v15); // v15=6
		
		// 거듭제곱(n제곱)
		System.out.println(Math.pow(10, 2));  // 100.0
		System.out.println(Math.pow(2, 3));   // 8.0
		System.out.println(Math.pow(5, 0));   // 1.0
		System.out.println(Math.pow(9, 0.5)); // 3.0(루트)
		
		// 소수점 이하 특정 자리에서 반올림하기
		double value = 12.3456;
		// Quiz
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소수점 몇째자리에서 반올림 할까요: ");
		try(sc){
			int point = sc.nextInt();
			value *= Math.pow(10, point);
			if(value % 10 >= 5) {
				value += (10 - value % 10);
			}
			else value -= value % 10;
			
			value /= Math.pow(10, point);
//			value = round(value, point);
		}
		catch (Exception e) {
		}
		System.out.println(value);
		
	}
	
	public static double round(double value, int point) {
		value *= Math.pow(10, point-1);
		value = Math.round(value);
		value /= Math.pow(10, point-1);
		
		return value;
	}

}
