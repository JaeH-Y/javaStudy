package exampleTest;

public class TempClass {
	public int func(int n){
		if(Sol19.fiboMap.containsKey(n)) return Sol19.fiboMap.get(n);
		else {
			int value = 0;
			if(n <= 1) value = n;
			else {
				int first = func(n-1);
				int second = func(n-2);
				value = first + second;
				System.out.println("n= " + n + "first= " + first+ "second= " + second+ "value= " + value);
			}
			Sol19.fiboMap.put(n, value);
			return value;
		}
    }
}
