package exampleTest;

import java.util.HashMap;
import java.util.Map;

public class Sol19 {
	public static Map<Integer, Integer> fiboMap = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		
		TempClass tmp = new TempClass();
		int n = 3;
		int result = tmp.func(5);
		System.out.println(result);
		System.out.println(fiboMap);
	}
}
