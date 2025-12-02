package exampleTest;

import java.util.*;

public class Sol7 {
	public static void main(String[] args) {
		int answer = 0;
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		String str = "1 2 3 5 -8 -10";
		String[] sArr = str.split(" ");
		
        List<Integer> list = new ArrayList<>();
        for(int num : ingredient){
            list.add(num);
            if(list.size() > 3){
                int last = list.size() - 1;
                if(list.get(last - 3) == 1 &&
                   list.get(last - 2) == 2 &&
                   list.get(last - 1) == 3 &&
                   list.get(last) == 1){
                    answer++;
                    list.remove(last - 3);
                    list.remove(last - 3);
                    list.remove(last - 3);
                    list.remove(last - 3);
                }
            }
        }
        System.out.println(answer);
	}
}
