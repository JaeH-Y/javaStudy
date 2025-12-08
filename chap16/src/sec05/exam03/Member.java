package sec05.exam03;

public class Member {
	private String id;
	private String name;
	
	
	
	
	public Member(String id) {
		this.id = id;
		System.out.println("Memeber(String id)");
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Memeber(String id, String name)");
	}

	
	// 오버라이딩
	@Override
	public String toString() {
		return "[아이디 = " + id + ", 이름 = " + name + "]";
	}
	
	
}
