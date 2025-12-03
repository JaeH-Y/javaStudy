package sec01.exam10;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// 내부 데이터가 같을 때 동등 키로 판단하려면 hashCode()와 equals()를 재정의 해야함
		// HashSet과 동일하게 동작 = HashSet은 내부적으로 HashMap으로 구현되어 있음
		map.put(new Student(1, "김재현"), 95);
		map.put(new Student(1, "김재현"), 100);
		
		System.out.println(map);
	}
}
