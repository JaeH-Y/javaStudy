package exampleTest;

import java.util.*;
import java.util.Map.Entry;
public class Sol6 {
	public static void main(String[] args) {
		int[] answer = new int[3];
		int[] answers = {1,3,2,4,2};
        int[] aStyle = {1,2,3,4,5,1,2,3,4,5};
        int[] cStyle = {3,3,1,1,2,2,4,4,5,5};
        int[] bStyle = {2,1,2,3,2,4,2,5};
        for(int i = 0; i < answers.length; i++){
            answer[0] = answers[i] == aStyle[i % aStyle.length] ? answer[0] + 1 : answer[0];
            answer[1] = answers[i] == bStyle[i % bStyle.length] ? answer[1] + 1 : answer[1];
            answer[2] = answers[i] == cStyle[i % cStyle.length] ? answer[2] + 1 : answer[2];
        }
        List<Integer> list = new ArrayList<>();
        for(int ans : answer){
            list.add(ans);
        }
        list.sort(Collections.reverseOrder());
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
    
            for(int j = 0; j < answer.length; j++){
                if(answer[j] == list.get(i)){
                    if(result[i] == j+1){
                        continue;
                    }
                    result[i] = j+1;
                    list.set(i, null)
                    break;
                }
            }
        }
	}
}
