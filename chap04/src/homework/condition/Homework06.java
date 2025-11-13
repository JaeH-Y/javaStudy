package homework.condition;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int designS = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int developS = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int dbConS= sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int langUseS = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int infoS = sc.nextInt();
		
		int isFailed = 0;
		
		isFailed = infoS < 40 ? 5 : isFailed; 
		isFailed = langUseS < 40 ? 4 : isFailed; 
		isFailed = dbConS < 40 ? 3 : isFailed; 
		isFailed = developS < 40 ? 2 : isFailed; 
		isFailed = designS < 40 ? 1 : isFailed; 
		
		int avgScore = (designS + developS + dbConS + langUseS + infoS) / 5;
		String infoMessage = "";
		
		if(avgScore >= 60 && isFailed == 0) {
			infoMessage ="합격을 축하합니다!";
		}
		else if(avgScore < 60 && isFailed == 0){
			infoMessage ="평균 점수 60점 미만으로 불합격입니다.";
		}
		
		if(isFailed == 1) {
			infoMessage ="소프트웨어설계 과목 과락으로 불합격입니다.";
		}
		else if(isFailed == 2) {
			infoMessage ="소프트웨어개발 과목 과락으로 불합격입니다.";
		}
		else if(isFailed == 3) {
			infoMessage ="데이터베이스구축 과목 과락으로 불합격입니다.";
		}
		else if(isFailed == 4) {
			infoMessage ="프로그래밍언어활용 과목 과락으로 불합격입니다.";
		}
		else if(isFailed == 5) {
			infoMessage ="정보시스템구축관리 과목 과락으로 불합격입니다.";
		}
		
		
		System.out.println(infoMessage);
		
		sc.close();
	}

}
