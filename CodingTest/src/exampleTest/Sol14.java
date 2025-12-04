package exampleTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sol14 {
	public static void main(String[] args) {
		
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		int k = 6;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int key : tangerine) {
			if(!map.containsKey(key)) {
				map.put(key, 1);
				continue;
			}
			int val = map.get(key);
			map.replace(key, ++val);
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((e1, e2) -> e2.getValue() - e1.getValue());
		
		for(Entry<Integer, Integer> entry : list) {
			k -= entry.getValue();
//			answer++;
			if(k <= 0) break;
		}
		
		
	}
}
