package sec01.exam05;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1);
		
		// java.util.Date
		Date obj2 = new Date();
		System.out.println(obj2.toString());	// Date 클래스 안에서 날짜, 시간 정보가 나오도록 재정의 한 것
		
		
		
	}
}
