package exampleTest;

public class Sol30 {
	public static int answer = -1;
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		boolean[] past = new boolean[dungeons.length];
		
		// 현재 피로도 k
		// 필요 필요도 [0]
		// 소모 필요도 [1]
		// answer = Math.max(answer, depth);
		// k < [0] => k - [1] => answer++ => findDown(k, depth, dungeons, past)
		// k >= [0] return;
		
		findDown(k, 0, dungeons, past);
		System.out.println(answer);
	}
	public static void findDown(int k, int depth, int[][] dungeons, boolean[] past) {
		
		answer = Math.max(depth, answer);
		for(int i = 0; i < dungeons.length; i++) {
			if(past[i]) continue;
			
			int need = dungeons[i][0];
	        int cost = dungeons[i][1];
	        
			if(k < need) continue;
			
			past[i] = true;
			findDown(k - cost, depth + 1, dungeons, past);
			past[i] = false;
		}
	}
}
