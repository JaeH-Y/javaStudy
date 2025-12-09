package exampleTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Sol23 {
	public static void main(String[] args) {
		
		int bridge_length = 2;
		int weight = 10;
		int nowWeight = weight;
		int[] truck_weights = {7,4,5,6};
		
		int answer = 0;
        Queue<Integer> que = new LinkedList<Integer>();
        Queue<List<Integer>> timeQue = new LinkedList<>();
        for(int truck : truck_weights) {
        	que.offer(truck);
        }
        while(true) {
        	answer++;
        	if(timeQue.size() > 0) {
        		List<Integer> popTruckAndTimeList = new ArrayList<Integer>(timeQue.peek());
        		
        		int spendTime = answer - popTruckAndTimeList.get(1);
        		if(spendTime >= bridge_length) {
        			timeQue.poll();
        			nowWeight += popTruckAndTimeList.get(0);
        			System.out.println(popTruckAndTimeList.get(0) + "번 트럭 다리 내려옴, 시간: " + answer);
        			System.out.println("소요시간: " + spendTime);
        		}
        	}
        	if(que.size() > 0) {
        		int nowTruck = que.peek();
        		if(nowWeight - nowTruck >= 0) {
        			List<Integer> addTruckAndTimeList = new ArrayList<Integer>();
        			addTruckAndTimeList.add(nowTruck);
        			addTruckAndTimeList.add(answer);
        			timeQue.offer(addTruckAndTimeList);
        			nowWeight -= nowTruck;
        			que.poll();
        			System.out.println(nowTruck + "번 트럭 다리 올라감, 시간: " + answer);
        		}
        	}
        	if(que.isEmpty() && timeQue.isEmpty()) break;
        	
        }
		
		
        System.out.println(answer);
	}
}
