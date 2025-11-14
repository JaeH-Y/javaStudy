package sec02.exam02;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		// 값 목록을 이용해서 배열 생성
		// 2. 배열 변수 선언 후 나중에 값 대입
		int[] scores;
//		scores = {83,90,87};  // 컴파일 에러
		// 배열을 선언과 동시에 초기화 할 때만 사용할 수 있음
		
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		// 메소드의 매개 변수에 배열 객체를 전달하는 경우
		// {90, 100, 85}
		System.out.println("총합: " + Add(new int[]{90, 100, 85}));
		
		
	}
	
	// 메소드 선언
	
	public static int Add(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
