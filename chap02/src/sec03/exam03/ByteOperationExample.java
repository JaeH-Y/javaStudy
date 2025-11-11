package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 기본 전제: 두 개의 값 중 크기가 큰 타입으로 자동 형변환
		// 크기가 작은 타입으로 자동 형변환이 안될뿐더러 값의 손실도 일어날 수 있음
		
		// 산술 연산에서 int 타입 이하일 경우에는 int 타입으로 자동 변환됨
		byte x = 10;
		byte y = 20;
//		byte result = x + y;	// 연산 시 우선적으로 byte가 int로 변환됨, => int + int
		
		int result = x + y;
		
		int max = 2100000000;
		int ele = 100000000;
	}

}
