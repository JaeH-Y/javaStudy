package exampleTest;

import java.util.*;
import java.util.Map.Entry;

public class Sol21 {
	public static void main(String[] args) {
		
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		int answer = 1;
		Map<String, List<String>> clotheMap = new HashMap<>();
		
		for(String[] clothe : clothes ) {
			List<String> list = new ArrayList<String>();
			if(!clotheMap.containsKey(clothe[1])) {
				list.add(clothe[0]);
				clotheMap.put(clothe[1], list);
			}else {
				list = clotheMap.get(clothe[1]);
				list.add(clothe[0]);
				clotheMap.replace(clothe[1], list);
			}
		}
		
		for(Entry<String, List<String>> entry : clotheMap.entrySet()) {
			answer *= entry.getValue().size() + 1;
		}
		answer -= 1;
		
		System.out.println(answer);
	}
}
