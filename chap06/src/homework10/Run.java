package homework10;

public class Run {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		
		st1.setName("김철수");
		st1.setClassName("A");
		
		st2.setName("홍길동");
		st2.setClassName("F");
		
		st3.setName("이영희");
		st3.setClassName("B");
		
		
		System.out.println(st1.getStudentNo() + st1.getName() + st1.getClassName());
		System.out.println(st2.getStudentNo() + st2.getName() + st2.getClassName());
		System.out.println(st3.getStudentNo() + st3.getName() + st3.getClassName());
		
	}
}
