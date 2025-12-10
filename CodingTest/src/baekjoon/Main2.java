package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		int needTreeHeight = sc.nextInt();
		
		// 나무 담을 Map 선언
		Map<Integer, Integer> treeMap = new HashMap<Integer, Integer>();
		// 나무의 높이 종류 Set 선언
		Set<Integer> heightSet = new HashSet<Integer>();
		// Map, Set에 요소 담기
		for(int i = 0; i < numOfTree; i++) {
			int treeheight = sc.nextInt();
			heightSet.add(treeheight);
			if(!treeMap.containsKey(treeheight)) treeMap.put(treeheight, 1);
			else {
				int basicNum = treeMap.get(treeheight);
				treeMap.replace(treeheight, ++basicNum);
			}
		}
		
		// List에 높이 내림차순 정렬
		List<Integer> heightList = new ArrayList<Integer>(heightSet);
		Collections.sort(heightList,Comparator.reverseOrder());
		System.out.println(heightList);
		// 상승 시 성공 실패 인덱스 저장
		int lastsuccessIndex = 0;
		int firstFailedIndex = heightList.size() - 1;
		
		// 하강 시 성공 실패 인덱스 저장
		int lastFailedIndex = 0;
		int firstSuccessIndex = heightList.size() + 1;
		
		while(true) {
			
			// 높이 절반 나누기
			int centerIndex = heightList.size()/2;
			int total = 0;
			while(true) {
				// 하향식
				System.out.println(centerIndex);
				total = 0;
				int centerheight = heightList.get(centerIndex);
				for(int i = centerIndex; i >= 0; i--) {
					int key = heightList.get(i);
					int trees = treeMap.get(key);
					int gap = key - centerheight;
					System.out.println("key: " + key + ", trees: " + trees + ", gap: " + gap);
					if(gap > 0) total += gap*trees;
				}
				System.out.println("total: " + total + ", need: " + needTreeHeight);
				// 자른 나무 길이 합이 필요한 것보다 적을 때
				if(total < needTreeHeight) {
					// 다음 낮은 높이에서는 가능한지 확인
					lastFailedIndex = centerIndex++;
				}
				else {
					// 성공하면 while 종료
					firstSuccessIndex = centerIndex;
					break;
				}
			}
			// 바로 성공하면 상향 탐색
			if(firstSuccessIndex == (heightList.size()/2)) {
				total = 0;
				while(true) {
					// 상향식
					int centerheight = heightList.get(centerIndex);
					for(int i = centerIndex; i >= 0; i--) {
//						System.out.println("i: " + i + "size: " + heightList.size());
						int key = heightList.get(i);
						int trees = treeMap.get(key);
						int gap = key - centerheight;
						System.out.println("key: " + key + ", trees: " + trees + ", gap: " + gap);
						if(gap > 0) total += gap*trees;
					}
					System.out.println("centerIndex: " + centerIndex + ", total: " + total);
					// 자른 나무 길이 합이 필요한 것보다 많을 때
					if(total >= needTreeHeight) {
						// 성공하면 그 다음 높이
						lastsuccessIndex = centerIndex--;
					}
					else {
						// 실패하면 break;
						firstFailedIndex = centerIndex;
						break;
					}
				}
				if(firstSuccessIndex == lastsuccessIndex) {
					// 상향식도 중앙, 하향식도 중앙일 때
					for(int i = heightList.get(firstFailedIndex); i > heightList.get(lastsuccessIndex); i--) {
						
					}
					System.out.println(heightList.get(firstSuccessIndex));
				}
				else if(firstSuccessIndex == (heightList.size()/2)) {
					System.out.println("에러? => " + "firstSuccessIndex: " + firstSuccessIndex
							+ ",lastsuccessIndex: " + lastsuccessIndex);
					return;
				}
				else {
					// firstSuccess에서 올라갈 한계 범위 지정
					for(int i = heightList.get(firstSuccessIndex); i < heightList.get(lastFailedIndex); i++) {
						int t = 0;
						for(int j = firstSuccessIndex; j < heightList.size(); j++) {
							int key = heightList.get(j);
							int trees = treeMap.get(key);
							int gap = key - i;
							if(gap > 0) t += trees * gap;
						}
						if(t >= needTreeHeight) {
							System.out.println(t);
							return;
						}
					}
					System.out.println("뭐지 쇼발?");
				}
			}
			else {
				// lastFailedIndex에서 내려갈 한계 범위 지정
				for(int i = heightList.get(lastFailedIndex) -1; i > heightList.get(firstSuccessIndex); i--) {
					int t = 0;
					for(int j = lastFailedIndex; j >= 0; j--) {
						int key = heightList.get(j);
						int trees = treeMap.get(key);
						int gap = key - i;
						if(gap > 0) t += trees * gap;
					}
					if(t >= needTreeHeight) {
						System.out.println(t);
						return;
					}
				}
				System.out.println(heightList.get(firstSuccessIndex));
				System.out.println("뭐지 쇼발?");
			}
		}
	}
}
