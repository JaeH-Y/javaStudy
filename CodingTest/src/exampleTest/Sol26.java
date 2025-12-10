package exampleTest;

public class Sol26 {
	public static void main(String[] args) {
		int n = 3;
		
		int answer = 0;
		int stopValue = 1;
		while(stopValue < n/2) {
			stopValue++;
			if(n % stopValue == 0) {
				int shared = n / stopValue;
				if(shared % 2 == 0) continue;
				int checkValue = stopValue;
				for(int i = 1; i <= shared/2; i++) {
					checkValue += stopValue+i;
					checkValue += stopValue-i;
				}
				answer = checkValue == n ? answer + 1 : answer;
			}
		}
		if(n > 1 && n%2 == 1) answer++;
		// 자기 자신
		answer++;
		System.out.println(answer);
	}
}
