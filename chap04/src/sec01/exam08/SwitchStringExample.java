package sec01.exam08;

public class SwitchStringExample {

	public static void main(String[] args) {
//		String position = "부장";
		String position = new String("부장");
		
		switch (position) {
			case "부장":
				System.out.println("700만원");
				break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
				break;
		}
		
		if(position.equals("부장")) {
			System.out.println("700만원");
		}
		else if(position.equals("과장")) {
			System.out.println("500만원");
		}
		else {
			System.out.println("300만원");
		}
	}

}
