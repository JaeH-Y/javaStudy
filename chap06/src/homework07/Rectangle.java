package homework07;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public Rectangle(int _width, int _height) {
		width = _width;
		height = _height;
	}
	
	
	
	public int CalculateRound() {
		return (width*2) + (height*2);
	}
	
	public int CalculateArea() {
		return width * height;
	}
	
	public void PrintInfo() {
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사각형의 둘레");
		System.out.println(CalculateRound()+"cm");
		System.out.println("2. 사각형의 넓이");
		System.out.println(CalculateArea()+"cm");
	}
	
	
	
}
