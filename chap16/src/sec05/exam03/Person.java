package sec05.exam03;

public class Person {
	public Member getMember1(Creatable1 creatable1) {
		String id = "winter";
		return creatable1.create(id);
	}
	
	public Member getMember2(Creatable2 creatable2) {
		String id = "winter";
		String name = "한겨울";
		return creatable2.create(id, name);
	}
	
}
