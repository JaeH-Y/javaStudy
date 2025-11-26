package exampleTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
	
	
	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		ArrayList<Integer> names = new ArrayList<>();
		ArrayList<Integer> renames = new ArrayList<>();
		
		renames.reversed();
		renames.sort(Comparator.reverseOrder());
		names.addAll(renames);
		names.addLast(null);
		
		
		int[] yearning = {5, 10, 1, 3};
		names.containsAll(yearning);
		findPatt
		
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"},
				{"kon", "kain", "may", "coni"}};
		
		
		int[] answer = new int[name.length];
        for(int i =0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j<photo[i].length; j++){
                int findIndex = CheckMiss(name, photo[i][j]);
                if(findIndex != -1){
                    sum += yearning[findIndex];
                }
                
            }
            answer[i] = sum;
            
        }
        for(int item : answer) {
        	System.out.println(item);
        }
	}
	
    
    public static int CheckMiss(String[] name, String nameInPhoto){
        int index = -1;
        for(int i = 0; i < name.length; i++){
            if(name[i].equals(nameInPhoto)){
                index = i;
                    break;
            }
        }
        return index;
    }
}