package sec01.exam03;

public class Computer extends Calculator{

	public Computer() {
		super();
	}

	
	// 부모의 메소드 이름 자동완성으로 가져오면 오버라이드 양식으로 자동완성 됨
	// 임의의 3.14대신 Math.PI 곱한 값을 리턴하도록 변경
	@Override	// <- 역할 : 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircle 실행");
		return r*r*Math.PI;
	}
	
	
	
//	double areaCircle(double r) {
//		System.out.println("Computer의 areaCircle 실행");
//		return r*r*Math.PI;
//	}
}
