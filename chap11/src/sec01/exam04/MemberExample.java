package sec01.exam04;

import java.util.HashMap;

public class MemberExample {
	public static void main(String[] args) {
		
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		
		hashMap.put(new Member("fall"), "value1");
		hashMap.put(new Member("winter"), "value2");
		hashMap.put(new Member("fall"), "value3");
		
		
		System.out.println(hashMap.size());
		// 첫번째 멤버 객체(new Member("fall"))와 동등 객체로 판단하고 키가 동일하므로 값을 덮어쓰기함
		System.out.println(hashMap.get(new Member("fall")));
		
		
	}
}
