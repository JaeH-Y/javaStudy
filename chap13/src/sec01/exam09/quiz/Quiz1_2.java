package sec01.exam09.quiz;

import java.util.HashMap;
import java.util.Map;

public class Quiz1_2 {
//	Quiz1
//	직장인의 정보를 담고 있는 Information 클래스와 실행 클래스를 작성하세요.
//	실행 클래스에 HashMap 객체를 생성하세요.
//	아래 사용 데이터를 참고하여 HashMap에 직원들의 정보를 추가합니다.
//	직원들의 정보 중 이름은 Key값으로 사용되고, 
//	전화번호와 월급은 Information 클래스의 필드로써 Value에 사용됩니다.
//	초기 데이터를 추가하고 HashMap을 출력하세요.
//	John의 월급을 410만원으로 바꾸어 HashMap의 값을 바꾼다음 다시 출력하세요.
	
//	Information 클래스
//	1. 필드
//		- phone: String
//		- salary: int
//	2. 생성자
//		+ Information()
//		+ Information(phone: String, salary: int)
//	3. Getter/Setter
//	4. 메소드
//		출력 예시에 맞춰 toString() 재정의
	
//	[사용 데이터]
//	이름  |     전화번호      | 월급
//	-----------------------------------
//	John |  123-456-7890  | 3800000
//	Emma |  987-654-3210  | 2300000
//	 Tom |	555-123-4567  | 4600000
	
//	[출력]
//	변경전: {Tom=[전화번호=555-123-4567, 월급=4600000], John=[전화번호=123-456-7890, 월급=3800000], Emma=[전화번호=987-654-3210, 월급=2300000]}
//	변경후: {Tom=[전화번호=555-123-4567, 월급=4600000], John=[전화번호=123-456-7890, 월급=4100000], Emma=[전화번호=987-654-3210, 월급=2300000]}
	
	public static void main(String[] args) {
		
		Map<String, Information> map = new HashMap<String, Information>();

		map.put("John", new Information("123-456-7890", 3800000));
		map.put("Emma", new Information("987-654-3210", 2300000));
		map.put("Tom", new Information("555-123-4567", 4600000));
		
		System.out.println("변경전: " + map);
		Information info = map.get("John");
		info.setSalary(4100000);
		
		// 권장 방식: replace() 사용
//		map.replace("John", new Information("123-456-7890", 4100000));
		
		System.out.println("변경후: " + map);
		
		
		
		
		
		
		// Quiz2
//		Emma가 전화번호를 바꿨습니다.(111-111-1111)
//		Setter를 이용해서 수정 후 Key 값이 Emma인 요소를 조회하세요.
//		객체를 단순히 출력하지 마시고, Getter를 이용해서 전화번호와 나이를 각각 출력하세요.
		
//		[출력]
//		===== Emma의 정보 =====
//		전화번호: 111-111-111
//		월급: 2300000
		
		System.out.println();
		Information info2 = map.get("Emma");
		info2.setPhone("111-111-1111");
		
		System.out.println("===== Emma의 정보 =====");
		System.out.println("전화번호: " + map.get("Emma").getPhone());
		System.out.println("월급: " + map.get("Emma").getSalary());
		
		
		
	}

}
