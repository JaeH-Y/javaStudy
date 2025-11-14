package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		scores = new int[] { 83, 90, 87, 90 }; // length 속성을 쓰면 배열이 변경됐을 때도 코드 변경이 없음
		
		int sum = 0;
		
//		for (int i = 0; i < 3; i++) { // 여기서 3은 배열 요소의 개수이므로 배열.length 속성을 활용하면 좋음
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
//		double avg = sum / 3.0;
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
		
		// Quiz
//		총 10명의 학생들의 출석 여부를 표현한 배열 attendance가 있습니다. 
//		학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다. 
//		출석한 학생의 수를 계산하여 출력해주세요.
		
		int[] attendance = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		int checked = 0;
		int stayhome = 0;
		double checkavg = 0;
		
		for (int i = 0; i < attendance.length; i++) {
			if(attendance[i] == 1) {
				checked += 1;
			}
			else stayhome += 1;
		}
		System.out.println("출석한 학생 수: "+checked);
		System.out.println("결석한 학생 수: "+stayhome);
		
		
		
		
		
	}

}
