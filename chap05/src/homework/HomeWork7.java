package homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7 {
	public static void main(String[] args) {
		
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] copyReport = Arrays.copyOf(report, report.length);
		copyReport[0] = "Team Feedback";
		
		System.out.print("원본 보고서: ");
		
		for(String item : report) {
			System.out.print(item + ", ");
		}
		
		System.out.println();
		
		System.out.print("복사된 보고서: ");
		for(String item : copyReport) {
			System.out.print(item + ", ");
		}
	}
}
