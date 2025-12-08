package sec04.exam01;

public class Person {
//	public void action(Calculable calculable) {
//		double result = calculable.calc(10, 4);
//		System.out.println("결과: " + result);
//	}
	
	private double x;
	private double y;
	private Calculable calculable;
	
	public Person(double f, double s) {
		this.x = f;
		this.y = s;
		
	}
	
	public void calc() {
		setCalculable((x, y) -> {
			return x + y;
		});
		double result = calculable.calc(x, y);
		System.out.println("결과: " + result);
	}

	public void setCalculable(Calculable calculable) {
		this.calculable = calculable;
	}
	
	
}
