package homework.Homework06;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] arr = sentence.split(" ");
		int index = -1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요 : ");
		try(sc){
			String word = sc.nextLine();
			if(!sentence.contains(word)) {
				System.out.println("존재하지 않는 단어입니다.");
				return;
			}
			for(int i = 0; i < arr.length; i++) {
				if(arr[i].equals(word)) index = i+1;
			}
			if(index == -1) {
				System.out.println("존재하지 않는 단어입니다.");
				return;
			}
			else if(index >= arr.length) {
				System.out.println("마지막 단어입니다.");
				return;
			}
			System.out.println(word + " 다음 단어: " + arr[index]);
		}
	}
}
