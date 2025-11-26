package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

//				A
//				|
//			ㅡㅡㅡㅡㅡㅡ
//			|		|
//			B		C
//			|		|
//			D		E
		
		// 상위 타입 참조 변수에 하위 객체 대입 가능
		// 자동 타입 변환 발생
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		b = d;
		
		c = e;
		
		
		
		
		
		
		
	}

}
