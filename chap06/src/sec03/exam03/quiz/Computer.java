package sec03.exam03.quiz;

public class Computer {
	String model;
	
	public Computer() {
		System.out.println("객체생성완료(모델: "+ model+")");
	}
	
	public Computer(String _model) {
		model = _model;
		System.out.println("객체생성완료(모델: "+ model+")");
	}
}
