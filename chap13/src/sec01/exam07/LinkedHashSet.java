package sec01.exam07;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet { // Linked = 연결된 = 순서유지와 관련
	
	public static void main(String[] args) {
		
		// HashSet
		// 요소를 추가한 순서를 보장하지 않음
		// 빠르게 요소를 추가, 삭제, 검색할 수 있다.
//		Set<String> set = new HashSet<String>();
		
		
		
		// LinkedHashSet
		// 요소를 추가한 순서대로 저장됨(but, Index는 없음)
		// HashSet에 비해 메모리 점유가 많고 소요 시간이 오래 걸림
		Set<String> set = new java.util.LinkedHashSet<String>();
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
