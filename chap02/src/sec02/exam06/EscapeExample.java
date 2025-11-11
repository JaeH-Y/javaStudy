package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// 이스케이프(escape) 문자: 역슬래쉬가 붙은 문자로 특수한 용도로 사용된다.
		// 보통 문자열 작성할 때 이용
		
		System.out.println("번호\t이름\t직업");
		System.out.println("번호\n이름\n직업");
		System.out.println("번호\r이름\r직업");	// \n이랑 같은 효과가 나는데?
		System.out.print("행 단위 출력1\n");
		System.out.print("행 단위 출력2\r");
		System.out.print("행 단위 출력3\n");
		System.out.println("------------");
		System.out.println("우리는 \"개발자\" 입니다.");
		System.out.println("봄\\여름\\가을\\겨울");
	}

}
