package exampleTest;

import java.util.*;

public class Solution3 {

	public static void main(String[] args) {
		
		
		Map<Integer, Integer> stuMap = new HashMap<Integer, Integer>();
		
		for(int i = 1; i <= n; i++) {
			stuMap.put(i, 1);
		}
		
		for(int l : lost) {
			int value = stuMap.get(l);
			stuMap.put(l, --value);
		}
		
		for(int r : reserve) {
			int value = stuMap.get(r);
			stuMap.put(r, ++value);
		}
		
		List<Integer> empty = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> entry : stuMap.entrySet()) {
			if(entry.getValue() == 0) empty.add(entry.getKey());
		}
		
		for(int emp : empty) {
			if(stuMap.get(emp - 1) == 2) {
				stuMap.put(emp-1, 1);
				stuMap.put(emp, 1);
			}
			else if(stuMap.get(emp + 1) == 2) {
				stuMap.put(emp+1, 1);
				stuMap.put(emp, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : stuMap.entrySet()) {
			if(entry.getValue() > 0) answer++;
		}
		
		
		
		
		
		
		
		
		
	}
}
