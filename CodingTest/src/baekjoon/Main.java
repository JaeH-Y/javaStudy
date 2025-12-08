package baekjoon;

import java.util.*;


class PlanetInfo{
	int x;
	int y;
	int r;
	public PlanetInfo(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 갯수 받기
		int testCount = sc.nextInt();
		
		// 테스트 케이스 변수 저장 객체 생성
		Map<Integer, List<Integer>> startEndMap = new HashMap<>();
		Map<Integer, Map<Integer, PlanetInfo>> planetsMap = new HashMap<>();
		
		// 케이스 변수 받기
		for(int i = 0; i < testCount; i++) {
			// 위치 변수 받기
			List<Integer> list = new ArrayList<Integer>();
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			startEndMap.put(i+1, list);
			
			// 행성 갯수 받기
			int planetCount = sc.nextInt();
			Map<Integer, PlanetInfo> map = new HashMap<>();
			for(int j = 0; j < planetCount; j++) {
				// 행성 구성요소 받기
				int x = sc.nextInt();
				int y = sc.nextInt();
				int r = sc.nextInt();
				
				// 행성 구성요소 추가
				PlanetInfo planet = new PlanetInfo(x,y,r);
				map.put(j+1, planet);
				// 몇번 째 테스트 케이스의 행성 구성요소인지 필요
			}
			planetsMap.put(i+1, map);
		}
		
		// 풀이 방법: 시작 지점을 감싸는 행성 갯수 + 끝 지점을 감싸는 행성 갯수 = 최소 진입, 탈출 행성 갯수
		// -> 감싸는 기준 마련 => 행성 좌표 +- 반지름 = > 동서남북 좌표
		// ex: 시작 지점 x: -5; y: 1;
		// 행성 1 요소 => x: 1; y: 1; r: 8; => -7(-x),9(y),9(x),-7(-y);
		// 시작지점 x <= 0 ? x vs 행성1[0] : x vs 행성1[2];
		// 시작지점 y <= 0 ? y vs 행성1[1] : y vs 행성1[3];
		// x,y가 모두 행성1에 포함되면 감싸는 행성 갯수 ++;
//		PlanetInfo testInfo = planetsMap.get(1).get(7);
//		System.out.println(testInfo == null);
		for(int i = 1; i <= testCount; i++) {
			test(startEndMap.get(i), planetsMap.get(i));
		}
		sc.close();
	}
	
	public static void test(List<Integer> pointList, Map<Integer, PlanetInfo> planetMap) {
		int startX = pointList.get(0);
		int startY = pointList.get(1);
		int endX = pointList.get(2);
		int endY = pointList.get(3);
		
		int count = 0;
		
		int mapSize = planetMap.size();
		for(int i = 1; i<= mapSize; i++) {
			PlanetInfo info = planetMap.get(i);
			int sXDistance = Math.abs(startX - info.x);
			int sYDistance = Math.abs(startY - info.y);
			int eXDistance = Math.abs(endX - info.x);
			int eYDistance = Math.abs(endY - info.y);
				
			if(sXDistance < info.r && sYDistance < info.r) { 
				count++;
			}
			else if(eXDistance < info.r && eYDistance < info.r){ 
				count++;
			}
		}
		System.out.println(count);
	}
}

