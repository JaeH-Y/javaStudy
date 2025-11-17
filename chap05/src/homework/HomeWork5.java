package homework;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] choices = {"가위", "바위", "보"};
		int gamecount, draw, win, lose;
		gamecount = draw = win = lose = 0;
		while(true) {
			int randVal = (int)(Math.random() * 90) + 1;
			// 가위바위보 승리 계산 활용
			int comIndex = randVal%3;
			int userIndex = 0;
			String comSet = choices[comIndex];
			
			System.out.print("가위바위보 : ");
			
			String inputM = sc.nextLine();
			System.out.println("컴퓨터 : "+ comSet);
			System.out.println("사용자 : "+inputM);
			
			boolean inputVaild = false;
			
			for(int i =0; i<choices.length;i++) {
				if(choices[i].equals(inputM)) {
					inputVaild = true;
					userIndex = i;
				}
			}
			
			if(!inputVaild) {
				if("stop".equals(inputM)) break;
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			if(comSet.equals(inputM)) {
				System.out.println("비겼습니다.");
				draw++;
			}
			if((userIndex + 1) % 3 == comIndex) {
				System.out.println("졌습니다.");
				lose++;
			}
			if((userIndex + 2) % 3 == comIndex) {
				System.out.println("이겼습니다.");
				win++;
			}
			gamecount++;
		}
		
		System.out.println(gamecount+"전 " + win + "승 " + draw +"무 " + lose+"패");
		
		sc.close();
		
	}
}
