package sec01.exam29;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// Random 클래스
		// Math.random() 보다 더 다양한 기능과 제어를 제공
		// 정수, 실수, 논리값 등 다양한 타입의 난수 생성 가능
		// 반복, 시드 필요, 테스트 용도 또는 멀티 쓰레드 환경에서 사용
		
		Random ran = new Random();
		
		// 시드(seed)란?
		// 난수 생성기의 "초기값"
		// 동일한 시드를 넣으면 항상 같은 난수 순서(시퀀스)가 생성됨
		ran.setSeed(1234);
		
		int randInt1 = ran.nextInt();
		int randInt2 = ran.nextInt();
		int randInt3 = ran.nextInt();
		// 범위 지정(이상, 미만)
		int randInt4 = ran.nextInt(0, 10);	// 0 ~ 9
		int randInt5 = ran.nextInt(0, 10);
		int randInt6 = ran.nextInt(0, 10);
		
		System.out.println(randInt1);
		System.out.println(randInt2);
		System.out.println(randInt3);
		System.out.println(randInt4);
		System.out.println(randInt5);
		System.out.println(randInt6);

		
		double randDouble1 = ran.nextDouble();
		double randDouble2 = ran.nextDouble();
		// 범위 지정(이상, 미만)
		double randDouble3 = ran.nextDouble(3.14, 5.67);
		double randDouble4 = ran.nextDouble(3.14, 5.67);
		
		System.out.println(randDouble1);
		System.out.println(randDouble2);
		System.out.println(randDouble3);
		System.out.println(randDouble4);

		
		boolean randBool1 = ran.nextBoolean();
		boolean randBool2 = ran.nextBoolean();
		
		System.out.println(randBool1);
		System.out.println(randBool2);
		
		
		
		
		
		
		
		
		
		
	}
}
