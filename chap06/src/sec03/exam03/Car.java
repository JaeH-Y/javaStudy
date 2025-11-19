package sec03.exam03;

public class Car {
	// 필드 : 객체의 데이터
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 클래스 내부에서의 필드 사용
	// => 필드 이름으로 사용
	
	// 총 4개의 생성자 오버로딩
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// 주의! 매개변수 이름만 바꾸는 것은 오버로딩이 아님(타입이 중요!)
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
	
	// 오버로딩 가능(매개변수의 타입, 순서가 다르기 때문)
	Car(String model, int maxspeed, String color){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
	
	
	
	
	
	
	
	
}
