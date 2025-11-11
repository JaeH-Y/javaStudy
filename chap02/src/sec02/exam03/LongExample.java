package sec02.exam03;

public class LongExample {

	public static void main(String[] args) {
		// long : 8byte
		// 
		long var1 = 10;
		long var2 = 20L;	// 지금은 L을 안붙여도 문제 없음
//		long var3 = 20000000000;
		// int의 범위(약 21억)을 넘어서면 L을 붙여줘야함
		// 자바 컴파일러는 정수 리터럴을 기본적으로 int 타입으로 해석
		// 자바 컴파일러에게 int 타입이 아닌 long 타입임을 알려줘야함;
		long var4 = 20000000000L;	
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
