package sec02.exam02;

public class IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		
		x++;
		++x;
		System.out.println("x= " + x);

		System.out.println("---------------------------------------");

		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("---------------------------------------");
		
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);

		System.out.println("---------------------------------------");
		
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("------------------------------");
		// Quiz1
		// z, x, y의 값은?
		z = ++x + y++;
		System.out.println("정답 : z = 23, x = 15, y = 9");
		System.out.print("정답 : ");
		System.out.print("z = " + z);
		System.out.print(", x = " + x);
		System.out.println(", y = " + y);
		System.out.println("-----------------------");
		
		// Quiz2
		// 다음 코드 실행 후 x의 값은?
		x = 3;

		if (x++ == 3) {
		    x++;
		}
		
		System.out.println("정답 : x = 5");
		System.out.println("x = " + x);

		System.out.println("-----------------------");
		
		// Quiz3 - 개념 이해를 위한 퀴즈로 실무에서는 아래와 같이 쓰면 안됨 
		// 다음 코드 실행 후 a, b, result1, result2의 값은?
		int a = 10;
		int result1 = ++a + a++;
		
		int b = 10;
		int result2 = b++ + ++b; 
		
		System.out.println("정답 : a = 12, b = 12, result1 = 11 + 11 = 22, result2 = 10 + 12 = 22");
		System.out.print("정답 : ");
		System.out.print("a = " + a);
		System.out.print(", b = " + b);
		System.out.print(", result1 = " + result1);
		System.out.print(", result2 = " + result2);
		
	}

}
