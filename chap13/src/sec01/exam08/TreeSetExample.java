package sec01.exam08;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬해줌(정렬된 순서 보장)
		// 저장한 순서가 아닌, 정렬 순서대로 뽑힘
		
		// 순서 보장 X, 정렬 보장 X
//		Set<String> set = new HashSet<String>();
		// 순서 보장 O, 정렬 보장 X
//		Set<String> set = new LinkedHashSet<String>();
		// 순서 보장 X, 정렬 보장 O
//		Set<String> set = new TreeSet<String>();

//		set.add("동");
//		set.add("서");
//		set.add("남");
//		set.add("북");
//		System.out.println(set);

		// 기본 정렬 기준 외 - TreeSet 생성자에 Comparator를 매개값으로 전달
		Set<String> set = new TreeSet<String>(Collections.reverseOrder());
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
		
		
		// 사용자 정의 객체로 정렬 테스트
		// Member클래스에 compareTo()가 오버라이딩 되어 있어서
		// 해당 메소드를 기준으로 정렬하며 저장됨
		// 1. Comparable로 기본 정렬 기준 구현(클래스 객체 내부)
		// 2. TreeSet 생성 시 Comparator 구현으로 정렬 기준 제공
		Set<Member> memberSet = new TreeSet<Member>();	// 1.
//		Set<Member> memberSet = new TreeSet<Member>((a,b) -> a.getAge() - b.getAge());	// 2.
		memberSet.add(new Member("김재현", 30));
		memberSet.add(new Member("이수진", 25));
		memberSet.add(new Member("박민수", 40));
		System.out.println(memberSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
