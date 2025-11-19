package exampleTest;

import java.util.*;

class Solution2 {
	
	
	public static void main(String[] args) {
		int[] section = {2,3,6};
		int m = 4;
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int area : section){
            map.put(area,area);
        }
        
        int answer = 0;
        
        while(map.size() > 0){
            int firstsec = m;
            int range = firstsec + (m-1);
            for(int i = firstsec; i <= range; i++){
                if(map.containsKey(i)){
                    map.remove(i);
                }
                if(map.size() < 1) break;
            }
            answer++;
        }
        System.out.println(answer);
	}
}