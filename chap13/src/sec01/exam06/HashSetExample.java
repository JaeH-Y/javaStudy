package sec01.exam06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> mems = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 동등성 판단
		mems.add(new Member("김재현", 30));
		mems.add(new Member("윤재훈", 29));
		mems.add(new Member("윤길동", 27));
		
		System.out.println(mems);
		
		// 이 외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		
		// 요소 정렬
		// Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야함
		// => Comparable(Member클래스에 상속), Comparator(외부 클래스에 상속 및 구현) 등
		List<Member> memL = new ArrayList<Member>(mems);
		
		Collections.sort(memL);
		System.out.println(memL);
		
		memL.sort((o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		
		System.out.println(memL);
		
		// 다시 Set으로 변환(순서를 유지하기 위해 LinkedHashSet으로)
		Set<Member> sortedSet = new LinkedHashSet<Member>(memL);
		
		System.out.println(sortedSet);
		
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> sampleList = new ArrayList<Member>();
		sampleList.add(new Member("김재현", 30));
		sampleList.add(new Member("윤재훈", 29));
		sampleList.add(new Member("이수진", 25));
		sampleList.add(new Member("박민수", 40));
		sampleList.add(new Member("김재현", 30));
		sampleList.add(new Member("윤재훈", 29));
		
		sampleList = new ArrayList<Member>(new HashSet<Member>(sampleList));
		System.out.println();
		System.out.println("중복제거 리스트 출력");
		System.out.println(sampleList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
