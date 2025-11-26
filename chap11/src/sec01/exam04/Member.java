package sec01.exam04;

public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object를 상속 받음

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) { 
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// id 필드값이 같은 모든 Member 객체는 동일한 해시코드가 나오게 만들어줌
		// String 객체의 문자열이 같으면 해시코드도 같은 점을 활용
		return id.hashCode();
		
	}

}
