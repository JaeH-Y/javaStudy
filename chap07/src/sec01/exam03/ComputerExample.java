package sec01.exam03;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator cal = new Calculator();
		System.out.println("원면적: " + cal.areaCircle(r));
		System.out.println();
		
		
		
		// 자식 클래스의 재정의 된 메서드 호출
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(r));
		System.out.println();
		
		
	}
}
