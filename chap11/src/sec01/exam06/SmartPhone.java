package sec01.exam06;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	// 유익한 정보를 리턴하도록 재정의
	// 보통 필드의 값을 리턴하도록 만듦
	@Override
	public String toString() {
		return "SmartPhone [company = " + company + ", os = " + os + "]";
	}

	
	
	
	
}
