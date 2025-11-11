package sec03.exam07;

public class StringConcatExample {

	public static void main(String[] args) {
		int value = 10 + 2 + 8;
		System.out.println("value: " + value);
		
		String str1 = 10 + 2 + "8"; // 12 + "8" -> "128"
		System.out.println("str1: " + str1);
		
		String str2 = 10 + "2" + 8; // "102" + 8 -> "1028"
		System.out.println("str2: " + str2);

		String str3 = "10" + 2 + 8; // "102" + 8 -> "1028"
		System.out.println("str3: " + str3);
		
		String str4 = "10" + (2 + 8); // ()는 최우선 연산
		System.out.println("str4: " + str4);
		
		String testStr1 = "3.14";
		int testInt1 = (int)Double.parseDouble(testStr1);
		System.out.println(testInt1);
	}

}

