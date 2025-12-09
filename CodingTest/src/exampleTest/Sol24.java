package exampleTest;

public class Sol24 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
		    if (i % 2 == 0) {
		        result += arr[i];
		    } else {
		        result -= arr[i];
		    }
		}

		System.out.println(result);
	}
}
