package exampleTest;

import java.util.HashSet;
import java.util.Set;

public class Sol4 {
	public static void main(String[] args) {
		
		int[] nums = {3,1,2,3};
		int length = nums.length;
		
		int answer = 0;
		
		Set<Integer> list = new HashSet<>();
		
		for(int i : nums) {
			list.add(i);
		}
		
		if(list.size() >= (length/2))
			answer = length/2;
		else
			answer = list.size();
	}
}
