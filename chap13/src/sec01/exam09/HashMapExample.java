package sec01.exam09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// Map 특징
		// Key, Value 쌍으로 데이터 저장
		// 기본적으로 순서를 보장하지 않음
		// 키는 중복 불가, 값은 중복 가능
		
		// HashMap
		// 가장 기본적인 Map의 구현체
		// 키를 기반으로 hashCode()를 계산하여 위치를 정함
		// 해시 기반이라 속도가 매우 빠르게 검색, 삽입, 삭제 가능
		
		// Map 컬렉션 생성
		// 키의 타입으로 일반적으로 1. String 2. Integer/Long 을 많이 씀
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		// put()은 내부적으로 키가 이미 존재하는지 확인하고,
		// 존재하지 않으면 새로 추가하고 null 반환
		// 존재하면 값을 덮어쓰고, 기존 값 반환
		// 유재석 첫 등록 시 null 반환, 2번 째 등록 시 90 반환
		map.put("김재현", 85);
		map.put("유재석", 90);
		map.put("이이경", 80);
		map.put("유재석", 95);
		
		System.out.println(map);
		
		// 객체 찾기
		// Key값으로 Value를 검색
		// 요소를 찾지 못하면 null을 반환
		System.out.println("\t 유재석: " + map.get("유재석"));
		
		// 객체를 하나씩 처리
		// Iterator(반복자): 컬렉션 내부의 요소를 하나씩 순회할 수 있도록 도와줌
		// Iterator를 쓰려면 해당 객체가 Iterable 인터페이스를 구현하고 있어야 한다.
		// Collection을 구현한 클래스들(예: ArrayList, HashSet 등)은 이미 Collection에서 Iterable을 구현하고 있음
		// Map은 Iterable을 구현하지 않음
		// => 해결: keySet() 또는 entrySet()으로 Map의 구성요소를 Set으로 변경한다.
		
		// 1. KeySet() 이용: Key만 추출해서 Set에 담아 넣는다.
		// Set<K> 반환
		// Key만 모아놓은 Set이 필요할 때
		Set<String> keySet = map.keySet();
		
		System.out.println();
		System.out.println("Iterator 사용");
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			int value = map.get(key);
			map.put(key, --value);
			System.out.println("\t" + key + " : " + value);
			
//			map.remove(key);	// Iterator에서 사용 시 안전(변경된 상태 동기화)
		}
		System.out.println();
		
		System.out.println("forEach 사용");
		for(String key : keySet) {
			int val = map.get(key);
			map.put(key, ++val);
			System.out.println("\t" + key + " : " + val);
			
//			map.remove(key);	// 런타임 에러 발생
			// 이유
			// map.keySet()은 map의 키를 ‘따로 담은 Set’이 아니라, map 엔트리와 구조를 공유하는 뷰(View)라서
			// 반복 중 삭제하면 ConcurrentModificationException이 난다.
		}
		
		System.out.println();
		System.out.println("forEach로 한번에 사용");
		for(String key : map.keySet()) {
			int val = map.get(key);
			map.put(key, ++val);
			System.out.println("\t" + key + " : " + val);
			
//			map.remove(key);	// 런타임 에러 발생
		}
		
		System.out.println();
		
		System.out.println("새로운 ArrayList에 담아서");
		for(String key : new ArrayList<>(map.keySet())) {
			int val = map.get(key);
			map.put(key, ++val);
			System.out.println("\t" + key + " : " + val);
			
//			map.remove(key);	// 에러 발생 안함
			// 이유
			// keySet의 view를 별개의 진짜 List에 담았기 때문에 Map의 index 구조가 바뀌어도
			// 아무 상관 없음(독립 객체)
		}
		
		// 객체 삭제
		// List는 index 또는 Element를 기준으로 삭제 요소 판단
		// Set은 Element를 기준으로 판단
		// Map은 Key를 기준으로 판단
//		map.remove("유재석");
//		System.out.println("총 Entry 수: "+ map.size());
		
		// 객체를 하나씩 처리
		// 2. entrySet() 이용: Entry를 Set으로 변환
		// Set<Map.Entry<K,V>> 반환
		// 키와 값을 함께 보존한 Set이 필요할 때 사용
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		System.out.println("Iterator 사용");
		Iterator<Entry<String, Integer>> entryIter = entrySet.iterator();
		
		while(entryIter.hasNext()) {
			Entry<String, Integer> ent = entryIter.next();
			System.out.println("\t" + ent.getKey() + " : " + ent.getValue());
		}
		
		System.out.println();
		System.out.println("forEach 사용");
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
			
//			map.remove(key);	// 런타임 에러 발생
		}
		System.out.println();
		
		
		// 정리: Iterator가 필요한 상황(for-each보다 유리한 경우)
		// 읽기 전용이면 for-each가 가장 깔끔하고 실용적
		// 수정, 삭제, 조건 제어 등 복잡한 순회가 필요하면 Iterator가 더 유리
		// Iterator는 반복 중 컬렉션의 구조 변경을 감지 가능
		// 예: 순회 중 요소를 안전하게 제거할 때
		// Iterator.remove()는 ConcurrentModificationException 없이 안전하게 삭제 가능
		// 반면 for-each에서 map.remove()를 쓰면 오류 발생	
		
		
		// 객체 검색
		// Key, Value 기준으로 특정 키나 특정 값의 포함 여부를 판단할 수 있음
		// containsKey, containsValue
		
		// 특정 키가 있는지 확인
		String keyToCheck = "김재현";
		if(map.containsKey(keyToCheck)) {
			System.out.println("키 " + keyToCheck +"이(가) 존재합니다.");
		}
		else {
			System.out.println("키 " + keyToCheck +"이(가) 존재하지 않습니다.");
		}

		// 특정 값이 있는지 확인
		int val = 82;
		if(map.containsValue(val)) {
			System.out.println("값 " + val +"이(가) 존재합니다.");
		}
		else {
			System.out.println("값 " + val +"이(가) 존재하지 않습니다.");
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();	// 모든 Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
		
		
		
		
		
		
		
		
		
		
		

		
		
//		Map<String, TestClass> testMap = new HashMap<String, TestClass>();
//		testMap.put("김재현", new TestClass("김재현", 85));
//		testMap.put("유재석", new TestClass("유재석", 90));
//		testMap.put("이이경", new TestClass("이이경", 80));
//		testMap.put("유재석", new TestClass("김재현", 85));
//		testMap.put("윤재훈", new TestClass("김재현", 85));
//		
//		System.out.println(testMap.get("김재현"));
//		System.out.println(testMap.get("유재석"));
//		TestClass clazz = testMap.get("김재현");
//		clazz.setName("윤재훈");
//		clazz.setAge(29);
//		System.out.println("clazz.hashCode(): " + clazz.hashCode());
//		System.out.println("\"김재현\".hashCode(): " + testMap.get("김재현").hashCode());
//		System.out.println("\"윤재훈\".hashCode(): " + testMap.get("윤재훈").hashCode());
//		System.out.println("\"유재석\".hashCode(): " + testMap.get("유재석").hashCode());
//		System.out.println(testMap.get("김재현").equals(testMap.get("유재석")));
//		System.out.println(testMap.get("유재석"));
//		testMap.put("김재현", clazz);
//		
//		TestClass cl1 = new TestClass("김재현", 85);
//		TestClass cl2 = new TestClass("김재현", 85);
//		
//		System.out.println(cl1.equals(cl2));
//		System.out.println(cl1.hashCode());
//		System.out.println(cl2.hashCode());
		
	}
}
