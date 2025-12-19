package exampleTest;

public class Sol33 {
	public static void main(String[] args) {
		
		String name = "JEROEN";
		
		int answer = 0;
		int gap = Math.abs(('A' - 'Z') / 2);
		int len = name.length();
		for(char c : name.toCharArray()) {
			int distance = c - 'A';
			
			if(distance > gap) {
				distance = ('Z' - c) + 1;
			}
			answer += distance;
		}
		
		int move = len - 1;
		
		for (int i = 0; i < len; i++) {
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            // 우->좌로 꺾기
            move = Math.min(move, 2 * i + (len - next));
            // 좌->우로 꺾기
            move = Math.min(move, i + 2 * (len - next));
        }
		
		answer += move;
		System.out.println(answer);
	}
}
