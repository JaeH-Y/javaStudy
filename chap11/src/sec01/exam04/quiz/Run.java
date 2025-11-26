package sec01.exam04.quiz;

public class Run {
//	Quiz
//	학생 클래스의 객체 중 학번과 이름이 같다면 같은 학생이 되도록 Student 클래스를 수정하시오.
//
//	[출력]
//	[학번=100, 이름=홍길동, 전공=경영]과 [학번=100, 이름=홍길동, 전공=컴공]학생은 같은 학생입니다.
//	[학번=100, 이름=홍길동, 전공=경영]과 [학번=200, 이름=홍길동, 전공=컴공]학생은 다른 학생입니다.
	
	public static void main(String[] args) {
		Student s1 = new Student(100, "홍길동", "경영");
		Student s2 = new Student(100, "홍길동", "컴공"); // 복수전공
		Student s3 = new Student(200, "홍길동", "컴공"); // 동명이인
		
		if (s1.equals(s2)) {
			System.out.println(s1 + "과 " + s2 + "학생은 같은 학생입니다.");
		} else {
			System.out.println(s1 + "과 " + s2 + "학생은 다른 학생입니다.");
		}
		
		if (s2.equals(s3)) {
			System.out.println(s2 + "과 " + s3 + "학생은 같은 학생입니다.");
		} else {
			System.out.println(s2 + "과 " + s3 + "학생은 다른 학생입니다.");
		}
		
		System.out.println("\"홍길동\".hashCode() : " + "홍길동".hashCode());
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
		System.out.println("s3.hashCode() : " + s3.hashCode());
	}

}
