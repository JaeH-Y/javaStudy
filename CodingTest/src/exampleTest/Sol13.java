package exampleTest;

import java.util.Arrays;

public class Sol13 {
	public static void main(String[] args) {
		
		int[] people = {53, 53, 60};
		int limit = 100;
		
		int answer = 0;
        int left = 0;
        int right = people.length - 1;
		
        Arrays.sort(people);
        
        while(left <= right) {
        	
        	if(people[left] + people[right--] <= limit) left++;
        	
        	answer++;
        }
		
		System.out.println(answer);
	}
}
