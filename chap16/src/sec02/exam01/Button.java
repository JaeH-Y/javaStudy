package sec02.exam01;

public class Button {
	
	// 정적 멤버 인터페이스
	// 중첩 인터페이스로 작성한 이유?
	// 이 인터페이스는 해당 클래스(버튼)을 떠나서는 의미가 없다.(강하게 결합시켜주고 싶을 때)
	// 해당 클래스하고만 상호작용 하는 인터페이스
	// 대표적인 예: 안드로이드 프레임워크
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}
	
	// 필드
	private ClickListener clickListener;

	
	
	//메소드
	// 버튼이 클릭되었을 때 실행할 메소드
	public void click() {
		clickListener.onClick();
	}
	
	
	// Setter
	// 외부에서 인터페이스 구현 객체를 받아서 필드에 저장하는 setter 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 정리: 현재 버튼 클래스 안에는 버튼을 클릭 했을 때 '무엇을 한다.' 라는 내용이 작성 안됨
	// 버튼을 클릭했을 때 어떻게 처리해야 된다라는 것을 클릭리스너 구현 객체로 만들어서 여기에 주입
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
