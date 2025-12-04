package exampleTest;

import java.util.ArrayList;
import java.util.List;

public class Sol18 {
	public static void main(String[] args) {
		String s = "cdcd";
		int answer = -1;
		List<Character> list = new ArrayList<>();
		for(char c : s.toCharArray()){
			list.add(c);
			while(list.size() > 1) {
				int lastIndex = list.size() -1;
				if(list.get(lastIndex) == list.get(lastIndex - 1)) {
					list.remove(lastIndex - 1);
					list.remove(lastIndex - 1);
				}
				else break;
			}
		}
		if(list.size() == 0) answer = 1;
		System.out.println(answer);
	}
}
