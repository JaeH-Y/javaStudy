package sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		// obj1과 obj2는 물리적으로는 다른 객체, 논리적으로는 동등 객체(갖고있는 값이 같음)
		
		// 기존 equals() : 같은 객체인지 비교(주소 비교)
		// equals() 재정의 후 : 논리적 동등 비교
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
		
		
		
		
	}
}
