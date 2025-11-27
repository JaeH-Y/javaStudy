package exampleTest;

import java.util.*;

class Solution2 {
	
	
	public static void main(String[] args) {
		
		String[] keymap = {"ABACD", "BCEFD"};
		String[] targets = {"ABCD","AABB"};

		int[] answer = new int[targets.length];
		
        Map<Character, Integer> keys = new HashMap<>();
        keys.containsKey(keys)
        Arrays.parallelSort(keymap);
        for(int i  = 0; i < keymap.length; i++) {
        	
        	for(int j = 0; j < keymap[i].length(); j++) {
        		char item = keymap[i].charAt(j);
        		
        		int index = keys.getOrDefault(item, j+1);
        		
        		keys.put(item, Math.min(index, j+1));
        	}
        }
        keys.forEach(null);
        
        for(int i = 0; i < targets.length; i++) {
        	
        	for(int j = 0; j < targets[i].length(); j++) {
        		int finalIndex = keys.getOrDefault(targets[i].charAt(j), -1);
        		if(finalIndex == -1) {
        			answer[i] = -1;
        			break;
        		}
        		answer[i] += finalIndex;
        	}
        }
        
        Map<Integer,Integer> countScore = new HashMap<>();
        int last = 0;
        countScore.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByKey().reversed()).forEach(entry -> {
        	int value = entry.getValue();
    		value += last;
    		
        	int box = value / m;
        	int lost = value % m;
        	last = lost;
        	
        	int a = (box * entry.getKey());
        });
        
//        System.out.println(answer);
	}
}