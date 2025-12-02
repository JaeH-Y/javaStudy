package exampleTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sol5 {
	public static void main(String[] args) {
        int[] answer = new int[commands.length];
        int[] array = {1,5,2,6,3,7,4};
        
        List<Integer> answerList = new ArrayList<Integer>();
        for(int[] comm : commands) {
        	int start = comm[0];
        	int end = comm[1];
        	int point = comm[2];
        	List<Integer> list = new ArrayList<Integer>();
        	
        	for(int i = start-1 ; i < end; i++) {
        		list.add(array[i]);
        	}
        	
        	list.sort(Comparator.naturalOrder());
        	answerList.add(list.get(point -1));
        }
        for(int i = 0; i < answerList.size(); i++) {
        	answer[i] = answerList.get(i);
        }
        
	}
}
