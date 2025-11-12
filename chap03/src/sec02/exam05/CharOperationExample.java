package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		
		// 참고만 할 것!
		// 리터럴끼리의 연산은 컴파일 타임에 계산하고 실제 바이트 코드에 결과값만 넣음
		char c1 = 'A' + 1;	// 리터럴을 더해서 char에 넣는 것은 가능
		// 컴파일러가 컴파일 단계에서 연산
		
		char c2 = 'A';
//		char c2 = c2 + 1;	// c2 변수가 int로 형변환 됨(JVM에서 실행 시 연산)
		int i1 = c2 + 1;
		
	}

}
