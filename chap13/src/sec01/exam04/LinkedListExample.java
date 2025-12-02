package sec01.exam04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTIme;
		long endTime;
		
		// 0 인덱스에 10000개의 데이터를 삽입하여 시간 측정
		startTIme = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTIme);
		
		
		
		startTIme = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTIme);
		
		System.out.println(list1.indexOf("3000"));
		System.out.println(list1.indexOf("100"));
		System.out.println(list2.indexOf("3000"));
		System.out.println(list2.indexOf("100"));
		
	}
	
}
