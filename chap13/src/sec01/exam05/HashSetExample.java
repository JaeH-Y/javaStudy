package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// HashSet은 가장 기본적인 Set의 구현체이다.
// 대용량 데이터의 저장/탐색에 유리하며, List 계열보다는 사용 빈도가 낮은 편
// 중복된 데이터 제거가 필요할 때 유용(예: ArrayList의 요소에서 중복을 제거할 때)
public class HashSetExample {

	public static void main(String[] args) {
		// Set 특징
		// 수학의 집합과 유사
		// (해시코드 값을 기반으로 저장한다) => 순서 없이 데이터 저장 (저장된 요소를 순서대로 꺼낼 수 없음)
		// 동일한 요소를 중복 저장할 수 없음
		// 하나의 null만 저장 가능
		// 중복 판단 기준: hashCode()로 위치 찾고, equals로 동등성 확인
		
		
		
		
		Set<String> set = new HashSet<String>();
		
		// 객체 추가
		// 추가할 때마다 중복 확인(hashCode()와 equals() 호출) 후 추가함
		// 기존에 같은 객체가 없을 때만 저장하고 true 반환
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("JAVA");
		set.add("iBATIS");
		
		System.out.println(set);
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterable과 Iterator - 컬랙션 조회 방법의 표준화(=인터페이스)
		// 여러 종류의 컬렉션(Iterable)을 같은 방법(Iterator)으로 읽을 수 있음
		
		// Iterator(반복자)로 모든 요소를 하나씩 가져오기
		// 컬렉션의 요소를 하나씩 순회할 수 있도록 도와주는 인터페이스
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iter = set.iterator(); // iterator를 구현한 구현 객체를 반환한다.
		// Iterator 인터페이스에 부여해야함
		
		while(iter.hasNext()) {
			// 저장된 객체 수만큼 반복
			String nextS = iter.next();		// 1개의 요소를 읽어온다.
			System.out.println("\t" + nextS);
			
			// remove() : next()로 반환한 요소를 제거
			if("JAVA".equals(nextS)) {
				iter.remove();
				// 참고: remove()는 next() 호출 이후에만 호출 가능하며, 한번만 가능
				// Object 요소를 파라미터로 받아서 삭제하는 게 아니고,
				// next()로 호출 된 자기 자신만 지우는거라 2번 이상 안됨
			}
			
		}
		System.out.println(set);
		System.out.println();
		// 객체 삭제
		// index를 가지고 있는 List와 다르게 index가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC");
		System.out.println("set.remove(\"JDBC\")");
		System.out.println(set);
		System.out.println("총 객체수: " + set.size());
		System.out.println();
		
		// 향상된 for문으로 모든 객체를 하나씩 가져오기
		// 순서 즉, 인덱스가 없으므로 일반 for문 사용 불가
		// 당연히 get()과 같은 메소드고 사용 불가
		System.out.println("향상된 for문으로 모든 객체를 하나씩 가져오기");
		for(String ele : set) {
			System.out.println("\t" + ele);
		}
		System.out.println();
		
		
		// 객체 검색
		if(!set.isEmpty()) {	// 컬렉션이 비어 있는지 조사
			// 주어진 객체가 저장되어 있는지 조사
			System.out.println("JAVA 있니? " + set.contains("JAVA"));
			System.out.println("Servlet/JSP 있니? " + set.contains("Servlet/JSP"));
		}
		System.out.println();
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if(set.isEmpty()) {
			System.out.println("Set 비어있음");
		}
		System.out.println();
		
		// HashSet과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합의 합집합, 교집합, 차집합, 부분집합 연산 가능
		Set<Integer> coll1 = new HashSet<Integer>();
		
		Set<Integer> coll2 = new HashSet<Integer>();
		
		for(int i = 1; i <= 3; i++) {
			coll1.add(i);
			coll2.add(i+1);
		}
		
		// 집합과 관련된 메소드들
		// Collection에 변화가 있으면 true, 아니면 false
		
		// 합집합 (addAll)
		// 두 개의 HashSet을 하나로 합쳐
		// 이 때, 두 개의 HashSet에 공통적으로 포함된 데이터는 제거
//		System.out.println("합집합 성공 여부: " + coll1.addAll(coll2));
//		System.out.println("합집합: " + coll1);
		
		
		// 교집합 (retainAll)
		// 두 개의 HashSet에서 공통된 요소만 남김
//		System.out.println("교집합 성공 여부: " + coll1.retainAll(coll2));
//		System.out.println("교집합: " + coll1);
		
		
		// 차집합 (removeAll)
		// 기준 HashSet에서 대상 HashSet과의 교집합을 제외
//		System.out.println("차집합 성공 여부: " + coll1.removeAll(coll2));
//		System.out.println("차집합: " + coll1);
		
		
		// 주의: 위 3개 메소드 모두 기준 HashSet의 데이터 구성을 바꿈(파괴적)
		// 새로운 HashSet 반환 아님
		
		// 부분집합
		// 기준 HashSet에 대상 HashSet의 요소들이 포함되어 있는지 확인(전부 포함이어야 true)
		System.out.println("부분집합 성공 여부: " + coll1.containsAll(coll2));
		System.out.println("부분집합: " + coll1);
		System.out.println();
		
		// 요소 정렬
		// HashSet 자체는 정렬 기능이 없는 컬렉션이기 때문에,
		// 정렬을 하려면 다른 컬렉션으로 변환한 뒤 정렬
		// List로 변환 후 Collections.sort() 또는 List.sort() 사용
		Set<String> fruits = new HashSet<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);

		// Set -> List 변환
		List<String> fruitsList = new ArrayList<String>(fruits);
		// 정렬
		Collections.sort(fruitsList);	// 오름차순 정렬
		System.out.println(fruitsList);
//		fruitsList.sort(null);	// Comparator로 정렬 기준을 제공하면 정렬 가능
		
		// 필요하면 정렬된 순서를 유지하는 Set으로 다시 반환
		Set<String> sortedSet = new LinkedHashSet<String>(fruitsList);
		System.out.println(sortedSet);
		
		// Set 활용 팁: ArrayList의 요소에서 중복 제거하기
		System.out.println();
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("JDBC");
		list.add("Java");
		System.out.println(list);
		
		// HashSet을 이용해 중복 제거
		Set<String> listSet = new HashSet<String>(list);	// 중복 제거 완료
		System.out.println(listSet);
		
		// 필요 시 다시 List로 변환
		List<String> dedupList = new ArrayList<String>(listSet);
		System.out.println(dedupList);
		
		list = new ArrayList<String>(new HashSet<String>(list));
		
		System.out.println();
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
