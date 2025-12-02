package exampleTest;

public class Sol9 {
	public static void main(String[] args) {
		int n = 15;
		
		int answer = 0;
		int i = 1;
		while(true) {
			if(i == n) break;
			double pointV = ((double)n / i) * 100.0;
			if(pointV % 100 == 0) {
				System.out.println(pointV / 100);
				int centerV = n / i;
//				System.out.println("centerV: " + centerV);
				int totalV = 0;
				if(centerV - (i/2) < 0) break;
//				System.out.println((i/2));
				for(int j = 1; j <= (i/2); j++) {
					totalV += centerV - j;
					totalV += centerV + j;
				}
				if(i % 2 == 1) totalV += centerV;
				System.out.println("totalV: " + (totalV == n));
				if(totalV == n) answer++;
			}
			
			i++;
		}
		
		System.out.println("answer = " + answer);
	}
}
