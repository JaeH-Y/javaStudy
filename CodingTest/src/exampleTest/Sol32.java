package exampleTest;

import java.util.List;

public class Sol32 {
	public static String[] alpha = {"A", "E", "I", "O", "U"};
	public static int count = 0;
	char[] calpha = {'A', 'E', 'I', 'O', 'U'};
	public static void main(String[] args) {
		String word = "EIO";
		
		int answer = 0;
		
		if(findWord(word, "", 0)) 
		System.out.println(count);
	}
	public static boolean findWord(String word, String compare, int depth) {
		
		StringBuilder buff = new StringBuilder().append(compare);
		for(int i = 0; i < 5; i++) {
			if(buff.length()>= 5) return false;
			buff.append(alpha[i]);
			count++;
			if(word.equals(buff.toString())) return true;
			if(findWord(word, buff.toString(), depth+1)) return true;
			buff.setLength(depth);
		}
		return false;
	}
}
