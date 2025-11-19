package homework;

public class HomeWork1 {
	public static void main(String[] args) {
		int[] arr = {152, 180, 165, 158, 171};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
//					System.out.print(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]+","+arr[4]+"\n");
				}
			}
		}
		for(int item : arr) {
			System.out.print(item + ", ");
		}
	}
}
