package sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member mem1 = person.getMember1(id -> new Member(id));
		Member mem2 = person.getMember1(Member::new);
		System.out.println(mem1);
		System.out.println(mem2);
		
		System.out.println("============================================");
		
		Member m2 = person.getMember2((id, name) -> {
			Member m = new Member(id, name);
			return m;
		});
		System.out.println(m2);
		
		m2 = person.getMember2(Member::new);
		System.out.println(m2);
		
		// 생성자 참조는 두 가지 방법 모두 동일하지만,
		// 함수형 인터페이스의 매개변수 개수에 따라 실행되는 Member 생성자가 달라짐
		
		
		
		
		
		
	}
}
