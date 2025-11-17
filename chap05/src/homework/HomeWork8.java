package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
	public static void main(String[] args) {
		
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		
		String[] todayMenu = Arrays.copyOf(menu, menu.length+add.length);
		System.arraycopy(add, 0, todayMenu, menu.length, add.length);
		
		System.out.print("어제 메뉴판: ");
		for(String item : menu) {
			System.out.print(item + ", ");
		}
		System.out.println();
		
		System.out.print("오늘 메뉴판: ");
		for(String item : todayMenu) {
			System.out.print(item + ", ");
		}
		
	}
}
