package sec02.exam01;

public class SignOperatorExample {

	public static void main(String[] args) {

		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		
		byte b = 100;
//		byte result3 = -b; // int 이하 정수의 산술(부호) 연산은 int로 변환 후 진행되기 때문에 byte에 담을 수 없음
		int result3 = -b;
		System.out.println("result3= " + result3);
		
		char c =21504;
		char result4 = (char)-c;
		System.out.println("result4= " + result4);
	}

}
