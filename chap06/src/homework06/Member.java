package homework06;

public class Member {

	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		
	}
	
	public void ChangeName(String name) {
		memberName = name;
	}
	
	public void PrintName() {
		System.out.println(memberName);
	}
}
