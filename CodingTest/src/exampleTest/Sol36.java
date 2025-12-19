package exampleTest;

import java.util.ArrayDeque;
import java.util.Queue;

public class Sol36 {
	public static int count = 0;
	public static void main(String[] args) {
		int x = 10;
		int y = 40;
		int n = 30;
		
		int answer = 0;
		answer = findNum(x,y,n);
		System.out.println("answer : "  + answer);
	}
	public static int findNum(int x, int y, int n) {
        // 거리 배열: x~y까지만 관리 (x가 y보다 크면 불가능)
        if (x > y) return -1;
        if (x == y) return 0;

        int[] dist = new int[y + 1];
        for (int i = 0; i <= y; i++) dist[i] = -1;

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(x);
        dist[x] = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();
            int nextDist = dist[cur] + 1;

            int[] nexts = {cur * 2, cur * 3, cur + n};
            for (int nx : nexts) {
                if (nx > y) continue;
                if (dist[nx] != -1) continue; // 이미 더 빨리 방문했음
                dist[nx] = nextDist;
                if (nx == y) return nextDist;
                q.offer(nx);
            }
        }

        return -1;
    }
}
