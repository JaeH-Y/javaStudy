package sec01.exam12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {	// Linked = 연결된 = 순서유지
		
		// HashMap
		// 순서를 보장하지 않음
		
		// LinkedHashMap
		// 데이터를 저장한 순서를 유지함
		// (HashMap 기반 + 이중 연결 리스트를 이용해 입력 순서 유지)
		// 순서가 중요한 경우에 사용
		
//		Map<String, Object> flower = new HashMap<String, Object>();
		Map<String, Object> flower = new LinkedHashMap<String, Object>();
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower);
		
		System.out.println();
		Map<String, Object> hashFlower = new HashMap<String, Object>(flower);
		System.out.println(hashFlower);
		
		
		
		
		
	}
}
