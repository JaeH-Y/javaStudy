package homework.condition;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {

		/*
		 * int sum = 0; while(sum != 5) { int dice1 = (int)(Math.random() * 6) + 1; int
		 * dice2 = (int)(Math.random() * 6) + 1;
		 * 
		 * sum = dice1 + dice2; System.out.println("현재 주사위 합: " + sum); }
		 * System.out.println("while Stop");
		 */
		/*
		 * for(int x = 1; x <= 10; x ++) {
		 * 
		 * for(int y = 1; y <= 10; y++) {
		 * 
		 * int sum = (4*x)+(5*y); if(sum == 60) {
		 * System.out.printf("4x + 5y = 60 일 때 x=%d, y=%d \n", x,y); } } }
		 */
		/*
		 * String str = ""; for(;str.length() < 4;) { str += "*";
		 * System.out.println(str); }
		 */
		/*
		 * String str = ""; for(;str.length() < 4;) { str += "*";
		 * System.out.printf("%4s\n",str); }
		 */
		 
	        int n= 13;
	        int w = 3;
	        int num = 4;
	        int answer = 0;
	        int rows = (n/w) + 1;
	        int[][] table = new int[rows][w];
	        int count = 1;
	        Label : for(int i = 0; i < table.length; i++){
	            
	            for(int j=0; j < table[i].length; j++){
	                if(count > n) break Label;
	                if(i%2 == 0)
	                    table[i][j] = count++;
	                else
	                    table[i][table[i].length-1-j] = count++;
	            } 
	        }
	        System.out.println("table.langth=" + table.length);
	        // 이거 row 구할 때 w의 배수로 떨어지는 거 때문에 문제가 생기는듯?
	        // 아예 다시 생각해야겠다.
	        int targetrow = num / w;
	        if(num % w == 0) targetrow = targetrow -1;
	        int targetcol = (num % w) -1;
	        if(targetrow % 2 == 1) {
	        	if(targetcol == -1) {
	        		targetcol = 0;
	        	}
	        	else {
	        		targetcol = w -1 - targetcol;
	        	}
	        }
	        else if(targetcol == -1) {
	        	targetcol = w-1;
	        }
	        System.out.println("rows="+rows);
	        System.out.println("targetrow="+targetrow);
	        System.out.println("targetcol="+targetcol);
	        if(table[rows -1][targetcol] != 0){
	            answer = (rows - targetrow);
	            
	            System.out.println("if문 계산 적용"+table[rows -1][targetcol]);
	            System.out.println("if문 계산 적용");
	        }
	        else answer = (rows -1 - targetrow);
	        
	        System.out.println("answer="+answer);
		
	}

}
