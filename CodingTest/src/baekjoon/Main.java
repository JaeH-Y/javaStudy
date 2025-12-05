package baekjoon;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 갯수 받기
		int testCount = sc.nextInt();
		
		// 테스트 케이스 변수 저장 객체 생성
		Map<Integer, List<Integer>> startEndMap = new HashMap<>();
		Map<Integer, Map<Integer, List<PlanetInfo>>> planetsMap = new HashMap<>();
		
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
			for(int j = 0; j < planetCount; j++) {
				// 행성 구성요소 받기
				int x = sc.nextInt();
				int y = sc.nextInt();
				int r = sc.nextInt();
				
				// 행성 구성요소 추가
				List<PlanetInfo> infoList = new ArrayList<>();
				PlanetInfo planet = new PlanetInfo(x,y,r);
				infoList.add(planet);
				
				Map<Integer, List<PlanetInfo>> map = new HashMap<>();
				map.put(j+1, infoList);
				// 몇번 째 테스트 케이스의 행성 구성요소인지 필요
				planetsMap.put(i+1, map);
			}
		}
		
		
		// 풀이 방법: 시작 지점을 감싸는 행성 갯수 + 끝 지점을 감싸는 행성 갯수 = 최소 진입, 탈출 행성 갯수
		// -> 감싸는 기준 마련 => 행성 좌표 +- 반지름 = > 동서남북 좌표
		// ex: 시작 지점 x: -5; y: 1;
		// 행성 1 요소 => x: 1; y: 1; r: 8; => -7(-x),9(y),9(x),-7(-y);
		// 시작지점 x <= 0 ? x vs 행성1[0] : x vs 행성1[2];
		// 시작지점 y <= 0 ? y vs 행성1[1] : y vs 행성1[3];
		// x,y가 모두 행성1에 포함되면 감싸는 행성 갯수 ++;
		
		
		
	}
}
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
