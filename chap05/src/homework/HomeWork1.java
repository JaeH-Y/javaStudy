package homework;

public class HomeWork1 {
	public static void main(String[] args) {
		int[] arr = {152, 180, 165, 158, 171};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
//					System.out.print(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+"\n");
				}
			}
		}
		for(int item : arr) {
			System.out.print(item + ", ");
		}
	}
}
