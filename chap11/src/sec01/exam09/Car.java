package sec01.exam09;

public class Car {
	
	private String model;
	private int speed;

	
	public Car() {
		super();
	}
	
	public Car(String model) {
		super();
		this.model = model;
	}

	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}
	
	
	public void run() {
		System.out.println("차가 달립니다.");
	}
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
	
	
}
