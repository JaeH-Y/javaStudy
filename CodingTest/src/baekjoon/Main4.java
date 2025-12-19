package baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		int carCount = sc.nextInt();
		sc.nextLine();
		List<String> inList = new ArrayList<String>();
		Map<String, Integer> outMap = new HashMap<String, Integer>();
		for(int i = 0; i < carCount; i++) {
			inList.add(sc.nextLine());
		}
		for(int j = 0; j < carCount; j++) {
			outMap.put(sc.nextLine(), j);
		}
		for(int k = 0; k < inList.size(); k++) {
			String inCar = inList.get(k);
			int outRank = outMap.get(inCar);
			if(k == 0) {
				answer += outRank;
				continue;
			}
			if(outRank > answer + k) {
				System.out.println("outRank: " + outRank + ", answer: " + answer + ", K: " + k);
				answer += outRank - (answer + k);
			}
		}
		System.out.println(answer);
	}
}
