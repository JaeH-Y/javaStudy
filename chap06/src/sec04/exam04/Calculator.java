package sec04.exam04;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum /2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		System.out.println("실행 결과: " +result);
	}
	
	
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
	
	
}
