package exampleTest;

import java.util.*;
import java.util.Map.Entry;
public class Sol15 {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		int answer = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int key : citations) {
			if(!map.containsKey(key)) {
				map.put(key, 1);
				continue;
			}
			int val = map.get(key);
			map.replace(key, ++val);
		}
		
		List<Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		list.sort((a,b) -> b.getKey() - a.getKey());
		System.out.println(list);
		int count = 0;
		for(Entry<Integer, Integer> entry : list) {
			count += entry.getValue();
			if(count >= entry.getKey()) {
				answer = entry.getKey();
				
				break;
			}
		}
		System.out.println(answer);
		
	}
}
