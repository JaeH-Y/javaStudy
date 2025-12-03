package exampleTest;

public class Sol9 {
	public static void main(String[] args) {
		int n = 21;
		
		// 24
		// 7 + 8 + 9
		// 1 + 2 + 3 + 4 + 5 + 6 + 7
		int what = n % 9;
		System.out.println(what);
		int answer = 0;
		int i = 1;
		while(i * 2 < n) {
			if(n % i == 0 && i % 2 == 1) {
				int centerV = n / i;
				for(int j = -1; j >= -(i/2); j--){
                	if(centerV + j <= 0) {
                		break;
                	}
                }
				answer++;
				if(i == 9) {
					System.out.println("시발");
				}
				System.out.println("바로 통과: " + i);
			}
			else if(i % 2 == 0){
				int centerV = n / i;
                int result = 0;
                for(int j = 0; j <= (i/2); j++){
                    result += j;
                }
                for(int j = -1; j > -(i/2); j--){
                	if(centerV + j <= 0) {
                		i++;
                		continue;
                	}
                    result += j;
                }
                if((centerV*i) + result == n) { answer++;
                	System.out.println("i: " + i);
                }
            }
			i++;
		}
//		if(n % 2 == 1) answer++;
		
		System.out.println("answer = " + answer);
	}
}
