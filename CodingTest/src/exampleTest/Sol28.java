package exampleTest;

import java.util.HashSet;
import java.util.Set;

public class Sol28 {
	// 중복 제거 Set 생성
	public static Set<Integer> numSet = new HashSet<>();
	
	public static void main(String[] args) {
		
		String numbers = "17";
		int answer = 0;
		// 1가지 숫자부터 length 까지 숫자를 탐색해야함
		int len = numbers.length();
		// visited 배열 생성
		boolean[] visited = new boolean[len];
		
		// 숫자 1일 경우 하나만
		// 숫자 2일 경우 1,2 / 1,3 / 1,4 ... 2,3 / 2,4 / 2,5 ... 3,4 / 3,5
		// 숫자 3일 경우 1,2,3 / 1,2,4 / 1,2,5 ... 1,3,2 / 1,3,4 / 1,3,5 ... 1,4,2 / 1,4,3 / 1,4,5
		// 규직, 자리에 자기 자신은 하나만 가능
		
		findDown(numbers, "", visited);
		
		System.out.println(numSet);
		
		for(int item : numSet) {
			boolean sosoo = true;
			if(item < 2) continue;
			int maxDivide = (int)Math.pow(item, 0.5);
			for(int i = 2; i <= maxDivide; i++) {
				if(item % i == 0) {
					sosoo = false;
					break;
				}
			}
			if(sosoo) answer++;
		}
		System.out.println(answer);
//		int root = (int)Math.pow(x, 0.5);
//		System.out.println(root);
	}
	
	public static void findDown(String nums, String current, boolean[] visit) {
		
		if(!current.isEmpty()) {
			int num = Integer.parseInt(current);
			numSet.add(num);
		}
		
		for(int i = 0; i < nums.length(); i++) {
			
			if(visit[i]) continue;
			
			// 인덱스 예외 방지 && 이번 단어가 == 저번단어랑 같고 && 저번 단어가 false일 때
			// 예 => 21 + nums.charAt(i-1) == 3 => findDown(213)
			// 예 => 21 + nums.charAt(i) == 3 => findDown(213)
			// 중복 탐색 방지
			if(i > 0 && nums.charAt(i) == nums.charAt(i-1) && !visit[i-1]) continue;
			
			visit[i] = true;
			findDown(nums, current + nums.charAt(i), visit);
			visit[i] = false;
		}
	}
}
