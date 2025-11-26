package sec01.exam20;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		
		String str1 = "Java Programing";
		String str2 = "JAVA Programing";
		
		System.out.println(str1.equals(str2));
		System.out.println();
		
		// 대소문자 상관없이 비교하고 싶을 때
		// 방법 1
		String lower1 = str1.toLowerCase();
		String lower2 = str2.toLowerCase();
		System.out.println(lower1);
		System.out.println(lower2);
		System.out.println(lower1.equals(lower2));
		
		System.out.println();
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
