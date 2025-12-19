package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 나무 개수
		int numOfTree = sc.nextInt();
		// 필요한 나무 길이
		int nTH = sc.nextInt();
		
		Set<Integer> heightSet = new HashSet<Integer>();
		Map<Integer, Integer> treeMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < numOfTree; i++) {
			int tHeight = sc.nextInt();
			heightSet.add(tHeight);
			if(!treeMap.containsKey(tHeight)) treeMap.put(tHeight, 1);
			else {
				int trees = treeMap.get(tHeight);
				treeMap.replace(tHeight, ++trees);
			}
		}
		
		List<Integer> hList = new ArrayList<Integer>(heightSet);
		hList.sort(Collections.reverseOrder());
		
		int left = 0;
		int right = hList.get(0);
		int findHeight = 0;
		while(left <= right) {
			
			// 중간 값 추출
			int mid = (left + right) / 2;
			// 합계 값 담기
			long total = 0;
			// 맵 조회 인덱스 담기
			int startIndex = hList.size() - 1;
			// 낮은 순서대로 조회(맨 처음 스킵)
			if(hList.get(hList.size()-1) < left) {
				for(int i = hList.size()-1; i >=0; i--) {
					int tH = hList.get(i);
					// 리스트에서 나온 높이가 기준 높이 이상인 최저값을 탐색해서 startIndex에 담기
					if(tH >= mid) {
						startIndex = i;
						break;
					}
				}
			}
			
			for(int i = startIndex; i >= 0; i--) {
				int hKey = hList.get(i);
				int trees = treeMap.get(hKey);
				int gap = hKey - mid;
				if(gap > 0) total += (long)trees * (long)gap;
			}
			
			
			if(total >= nTH) {
				
				// 많이 캔 경우 저장하고 더 높이 캐는 가정 실행
				findHeight = mid;
				left = mid + 1;
			}
			else {
				
				// 적게 캔 경우 줄이기
				right = mid -1;
			}
			
		}
		System.out.println(findHeight);
	}
}
