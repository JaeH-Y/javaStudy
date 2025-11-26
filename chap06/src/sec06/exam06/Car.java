package sec06.exam06;

public class Car {
	// 필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private으로 선언
	private int speed;
	private boolean stop;
	
	
	// 생성자
	public Car() {
		
	}
	
	
	// 메소드
	public int GetSpeed() {	// 만약 getter만 존재하면 읽기 전용 필드
		return speed;
	}
	
	public void SetSpeed(int nextSpeed) {
		if(nextSpeed < 0) return;
		speed = nextSpeed;
	}

	// Stop Getter/Setter 만들기
	public boolean GetStop() {
		return stop;
	}
	
	public void SetStop(boolean isStop) {
		stop = isStop;
		if(isStop) speed = 0;
	}
	
	
	
}
