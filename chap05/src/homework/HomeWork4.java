package homework;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		
		int[] arr = new int[6];
		int pushIndex=0;
		while(true) {
			if(pushIndex == arr.length) break;
			int isValue = (int)(Math.random() * 45) + 1;
			
			for(int item : arr) {
				if(item == isValue) continue;
			}
			arr[pushIndex++] = isValue;
			
		}
		
		for(int item : arr) {
			System.out.print(item + " ");
		}
	}
}
