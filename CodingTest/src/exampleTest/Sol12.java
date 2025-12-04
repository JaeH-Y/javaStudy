package exampleTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sol12 {
	public static void main(String[] args) {
		
		int[] people = {53, 53, 60};
		int limit = 100;
		
		int answer = 0;
        int nextNeedWeight = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int we : people){
        	// 2명이서 못타는 케이스 제외
            nextNeedWeight = limit - we;
            if(nextNeedWeight < 1) {
            	answer++;
            	continue;
            }
            if(!map.containsKey(we)) {
            	map.put(we, 1);
            	continue;
            }
            int val = map.get(we);
            map.replace(we, ++val);
        }
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        list.sort(Comparator.reverseOrder());
        while(map.size() > 1) {
        	int bigWeightKey = list.get(0);
        	int bigCount = map.get(bigWeightKey);
        	nextNeedWeight = limit - bigWeightKey;
        	int smallWeightKey = 0;
        	// 짝 찾기
        	for(int i = 1; i < list.size(); i++) {
        		if(list.get(i) <= nextNeedWeight) {
        			smallWeightKey = list.get(i);
        			int smallCount = map.get(smallWeightKey);
        			if(bigCount <= smallCount) {
        				answer += bigCount;
        				map.remove(bigWeightKey);
        				list.remove(0);
        				smallCount -= bigCount;
        				bigCount = 0;
        				if(smallCount == 0) {
        					map.remove(smallWeightKey);
        					list.remove(i-1);
        				}
        				map.replace(smallWeightKey, smallCount);
        				break;
        			}
        			else {
        				answer += smallCount;
        				bigCount -= smallCount;
        				map.replace(bigWeightKey, bigCount);
        				map.remove(smallWeightKey);
        				list.remove(i);
        			}
        		}
        	}
        	// 더이상 짝을 찾을 수 없을 때
        	if(bigCount > 0) {
        		if(bigWeightKey * 2 <= limit) {
        			answer += bigCount /2;
        			if(bigCount % 2 == 1) answer++;
        		}
        		else {
        			answer += bigCount;
        		}
        		map.remove(bigWeightKey);
        		list.remove(0);
        	}
        }
        if(map.size() == 1) {
        	for(Entry<Integer, Integer> entry : map.entrySet()) {
        		int val = entry.getValue();
        		if(entry.getKey() * 2 > limit) {
        			answer += val;
        			break;
        		}
        		answer += val/2;
        		if(val % 2 == 1) answer++;
        	}
        }
        
        System.out.println(answer);
	}
}
