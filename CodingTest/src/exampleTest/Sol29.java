package exampleTest;

import java.util.ArrayList;
import java.util.List;

public class Sol29 {
	public static void main(String[] args) {
		int k = 80;
		int[][] dungeons = {{80,20},{50,40},{30,10}};
		
		
		int answer = 0;
		List<List<Integer>> dungeonList = new ArrayList<>();
		
		for(int[] arr1 : dungeons) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(arr1[0]);
			list.add(arr1[1]);
			dungeonList.add(list);
		}
		
		int need = 0;
		while(k > need) {
			int maxNeed = 0;
			int minSpend = k;
			int maxNeedIndex = -1;
			int minSpendIndex = -1;
			if(dungeonList.isEmpty()) {
				System.out.println(answer);
				return;
			}
			for(int i = 0; i < dungeonList.size(); i++) {
				List<Integer> eList = dungeonList.get(i);
				int needV = eList.get(0);
				int spendV = eList.get(1);
				maxNeed = Math.max(maxNeed, needV);
				minSpend = Math.max(0, Math.min(spendV, minSpend));
				if(maxNeed == needV) maxNeedIndex = i;
				if(minSpend == spendV) minSpendIndex = i;
				
			}
			if(minSpendIndex == -1) {
				System.out.println("size: " + dungeonList.size());
				System.out.println(dungeonList);
			}
			// 에너지 적게 드는 거 돌았을 때 다음에 많이 필요한 거 돌 수 있?
			// 없으면 if로
			if(k - minSpend < maxNeed) {
				List<Integer> eList = dungeonList.get(maxNeedIndex);
				int spendV = eList.get(1);
				if(maxNeed <= k && k - spendV > 0) {
					k -= spendV;
					answer++;
					System.out.println("maxNeed 사용");
				}
				// if 통과 못해도 쓰레기라는 거니까 지워버려
				dungeonList.remove(maxNeedIndex);
				System.out.println("maxNeed 버림: " + maxNeed);
			}
			else {
				List<Integer> eList = dungeonList.get(minSpendIndex);
				int needV = eList.get(0);
				if(needV <= k && k - minSpend > 0) {
					k -= minSpend;
					answer++;
					System.out.println("minSpend 사용");
				}
				
				// if 통과 못해도 쓰레기라는 거니까 지워버려
				dungeonList.remove(minSpendIndex);
				System.out.println("minSpend 버림: " + minSpend);
			}
		}
		
	}
}
