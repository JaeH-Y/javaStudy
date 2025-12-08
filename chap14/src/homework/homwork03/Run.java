package homework.homwork03;

import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		FileMenu menu = new FileMenu();
		try {
			menu.mainMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
