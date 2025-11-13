package sec02.exam04;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// (참고) 잘못 작성된 for문의 예
		
		for(float i = 0.1f; i <= 1.0f; i += 0.1f) {
			System.out.println(i);	// 10번 반복을 기대하지만 실제로는 9번 반복
			// i에 0.1씩 더할 때 정확하게 0.1이 더해지는 것이 아님
			// 0.1보다 살짝 큰 값이 더해짐
		}
		// 정리 : 초기화 식에 사용되는 변수는 정수 타입을 쓰는 게 좋음.
	}

}
