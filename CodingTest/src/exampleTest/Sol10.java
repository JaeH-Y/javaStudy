package exampleTest;

public class Sol10 {
	public static void main(String[] args) {
		int n = 78;
		int next = n;
		int answer = 0;
        int numtwo = 0;
        int powCount = 0;
        int preOneCount = 0;
        int nextOneCount = 0;
        while(n > 0){
            int plus = n % 2;
            if(plus == 1) preOneCount++;
            numtwo += plus * (int)Math.pow(10, powCount);
            n = n/2;
            powCount++;
        }
        while(true) {
        	powCount = 0;
        	next++;
        	int sample = next;
        	nextOneCount = 0;
        	while(sample > 0) {
        		int plus = sample % 2;
        		if(plus == 1) nextOneCount++;
        		numtwo += plus * (int)Math.pow(10, powCount);
        		sample = sample/2;
        		powCount++;
        	}
        	if(nextOneCount == preOneCount) break;
        }
        answer = next;
        System.out.println(answer);
	}
}
