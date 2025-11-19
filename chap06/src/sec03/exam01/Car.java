package sec03.exam01;

public class Car {
	// 기본 생성자 : 클래스에 생성자가 하나도 없을 때 컴파일러가 자동으로 만들어주는 생성자
	// 명시적으로 생성자를 선언하면 컴파일러는 기본 생성자를 자동으로 추가하지 않음
	
	// 생성자 오버로딩
	Car(){
		
	}
	
	// 생성자 선언
	Car(String color, int cc){
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
	}

	
	
	
	
	
	
	
	
	
	
	
}
