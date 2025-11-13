package sec02.exam05;

public class ForMultipleTableExample {

	public static void main(String[] args) {
		// 구구단 출력하기
		
		System.out.println("구구단 시작!");
		for(int i = 2; i <=9; i++) {
			System.out.println("*** "+i+"단 ***");
			
			for(int j = 2; j <=9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j );
			}
		}
		
		// 참고: for문은 중첩 시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
	}

}
