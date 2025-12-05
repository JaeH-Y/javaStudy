package exampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol20 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
//		String[] phone_book = {"12","123","1235","567","88"};
		
		// 길이 오름차순 -> String compareTo
		
		Arrays.sort(phone_book, (a,b) -> a.compareTo(b));
		System.out.println(phone_book);
		for(String str:phone_book) {
			System.out.println(str);
		}
		
		// 배열 길이
		int len = phone_book.length;
		
		// 배열 길이만큼 for문
		for(int i = 0; i < len; i++) {
			String str = phone_book[i];	// "119"
			
			for(int j = i+1; j <len; j++ ) {
				if(!phone_book[j].startsWith(str)) break;
//				return false;
			}
		}
		
		
	}
}
