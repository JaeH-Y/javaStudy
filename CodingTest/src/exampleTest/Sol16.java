package exampleTest;

import java.util.Arrays;
import java.util.Comparator;

public class Sol16 {
	public static void main(String[] args) {
		
		int[] numbers = {30, 3, 34, 5, 9};
		
		String answer = "";
        int len = numbers.length;
        String[] strArr = new String[len];
        StringBuffer buff = new StringBuffer();
        
        for(int i = 0; i < len; i++){
            strArr[i] = numbers[i] + "";
        }
        Arrays.sort(strArr, (a,b) -> (b+a).compareTo(a+b));
        
        for(String s : strArr) {
        	buff.append(s);
        }
//        if(buff.charAt(0) == '0') return "0";
        answer = buff.toString();
        System.out.println(answer);
	}
}
