package exampleTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol31 {
	public static void main(String[] args) {
		int n = 9;
		int[][] wires = {{1,3}, {2,3}, {3,4}, {4,5}, {4,6}, {4,7}, {7,8}, {7,9}};
		
		
		int answer = n;
		List<List<Integer>> wireList = new ArrayList<>();
		
		for(int i = 0; i <= n; i++) {
			wireList.add(new ArrayList<Integer>());
		}
		for(int[] xy : wires) {
			int x = xy[0];
			int y = xy[1];
			// 1 <-> 3 연결
			wireList.get(x).add(y);
			wireList.get(y).add(x);
		}
		
		for(int[] top : wires) {
			// 끊을 지점
			int xTop = top[0];
			int yTop = top[1];
			
			boolean[] visited = new boolean[n+1];
			Queue<Integer> que = new LinkedList<Integer>();
			
			visited[xTop] = true;
			que.offer(xTop);
			// 나에서 끊으면 최소한 나는 확보
			int count = 1;
			
			while(!que.isEmpty()) {
				int conn = que.poll();
				
				for(int next : wireList.get(conn)) {
					
					// 끊을 지점은 노카운트(+ 루프 방지)
					if((conn == xTop && next == yTop) || (conn == yTop && next == xTop)) continue;
					
					// 루프 방지(1 <-> 3 탐지 했으면 3 <-> 1은 무시) + 3과 연결된 다른 애들도 확인해야함
					if(!visited[next]) {
						visited[next] = true;
						que.offer(next);
						count++;
					}
						
				}
			}
			// 최대 간선 수에서 내가 연결한 수 * 2 빼면 나와 상대방 간선 수 차이
			int gap = Math.abs(n - (count * 2));
			answer = Math.min(gap, answer);
		}
		System.out.println(answer);
		
	}
}
