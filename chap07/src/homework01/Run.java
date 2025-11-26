package homework01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
		students[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		students[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for(Student st: students) {
			System.out.println(st.toString());
		}
		
		
		Employee[] employees = new Employee[10];
		int currentIndex = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
			System.out.print("이름 : ");
			String isName = sc.nextLine();

			System.out.print("나이 : ");
			int isAge = sc.nextInt();
			sc.nextLine();
			
			System.out.print("키 : ");
			double isHeight = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("몸무게 : ");
			double isWeight = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("급여 : ");
			int isSalary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("부서 : ");
			String isDept = sc.nextLine();
			
			System.out.print("계속 추가하시겠습니까? ");
			String isStop = sc.nextLine();
			
			employees[currentIndex++] = new Employee(isName, isAge, isHeight, isWeight, isSalary, isDept);
			if("n".equalsIgnoreCase(isStop)) break;
		}
		
		for(Employee emp : employees) {
			if(emp != null)
			System.out.println(emp.toString());
		}
		
		
		
		
	}
}
