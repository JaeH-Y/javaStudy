package sec01.exam06;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	
	
	// final 메소드
	// 공통으로 제공되는 기능인데, 변하면 안되는 것을 주로 final로 선언
	final public void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
	
	
	
}
