package sec01.exam02;

public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object를 상속 받음

	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {

		// 매개 변수의 타입이 Object 타입이기 때문에 모든 객체가 대입 가능하므로
		// 제일 먼저 매개값이 Member 타입인지 확인이 필요

		if (obj instanceof Member) {
			// id 필드에 접근하기 위해 Member 타입으로 강제 타입 변환하고
			Member member = (Member) obj;
			if (id.equals(member.id)) { // 여기서의 equals는 String에 재정의된 equals임
				return true;
			}
		}
		return false;
	}

}
