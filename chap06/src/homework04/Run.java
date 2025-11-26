package homework04;

public class Run {
	public static void main(String[] args) {
		Library lb = new Library();
		
		// 메소드(1) 테스트
		String result1 = lb.MergeStringAandB("안녕하세요", "아니요");
		System.out.println(result1);

		// 메소드(2) 테스트
		int result2 = lb.MultipleBigAandB(20, 19);
		System.out.println(result2);
		
		// 메소드(3) 테스트
		boolean result3 = lb.CheckEqualsString("안녕하세요", "아니요");
		System.out.println(result3);
	}
}
