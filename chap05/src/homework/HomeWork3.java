package homework;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num < 3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			int[] arr = new int[(num*2)-1];
			int decreaseVal = num -1;
			System.out.println(arr.length);
			for(int i=0; i<arr.length; i++) {
				if(i >= num) {
					arr[i] = decreaseVal--;
				}
				else {
					arr[i] = i+1;
				}
				System.out.print(arr[i]+", ");
			}
			break;
		}
	}
}
