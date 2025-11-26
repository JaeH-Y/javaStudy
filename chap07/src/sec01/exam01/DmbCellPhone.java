package sec01.exam01;


// 자식 클래스: 일반적인 특성은 물려받고 추가로 자식만이 갖는 멤버(필드, 메소드) 작성
// 여기서는 CellPhone을 확장하여 DMB 기능만 추가된 클래스
public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
//		super();	// 부모의 생성자 호출(생략 시 자동으로 추가됨)
		
		this.model = model;	// 부모(CellPhone)로부터 물려받음
		this.color = color; // 부모(CellPhone)로부터 물려받음
		// (참고) 위 코드는 부모로부터 물려받았음을 보여주기 위함이며, 일반적으로는 이렇게 초기화 하지않음
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자 호출됨");
	}



	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
	
	
	
}
