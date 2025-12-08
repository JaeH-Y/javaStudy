package sec01.exam01;

// 함수형 인터페이스: 단 하나의 추상 메소드를 갖는 인터페이스 => 익명 구현 객체를 람다식으로 표현 가능
@FunctionalInterface // 인터페이스에 추상 메소드가 정말 하나인지 컴파일 타임에 검사해줌
public interface Calculable {
	// 추상 메소드
	void calculate(int x, int y);
	
	// 테스트
//	void clear();
}
