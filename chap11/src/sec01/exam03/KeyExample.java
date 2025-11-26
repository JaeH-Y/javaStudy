package sec01.exam03;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {
	public static void main(String[] args) {
		
		// Map: key/value 쌍으로 저장하는 컬렉션 (like Dictionary??)
		// key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> map = new HashMap<>();
		
		// 식별키 "new Key(1)"로, 값은 "홍길동"을 저장함
		map.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)"로, 값은 "홍길동"을 읽어옴
		String value = map.get(new Key(1));
		System.out.println(value);
		
		// equals() 메소드를 재정의 했음에도 동등 객체(같은 식별키)로 판단하지 않는다.
		// get()을 할 떄, hashCode()를 먼저 비교하고 그 다음 equals()로 비교하기 때문임
		// 즉, hashCode()도 재정의 필요
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put(new String("1"), "김재현");
		hashMap.put(new String("2"), "홍재현");
		hashMap.put(new String("3"), new String("박재현"));
		hashMap.put(new String("4"), "이재현");
		hashMap.put(new String("5"), "최재현");
		
		String value2 = new String(hashMap.get(new String("2")));
		String value3 = hashMap.get(new String("2"));
		String value4 = hashMap.get(new String("3"));
		String value5 = hashMap.get(new String("3"));
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value2 == value3);
		System.out.println(value2.equals(value3));
		System.out.println();
		
		System.out.println(value4 == value5);
		System.out.println(value4.equals(value5));
		System.out.println();
		
		// 참고
		// String은 다른 객체여도 값이 같으면 같은 해시코드를 가짐(String 객체 자체적으로 hashCode() 재정의함)
		// => HashMap에서 키값으로 자주 사용됨
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("김");
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println();
		
		// 시스템이 구성한 값 그대로 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}
}
