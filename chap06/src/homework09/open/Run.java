package homework09.open;

import homework09.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "김철수";
		p.age = 20;
		
		System.out.println("이름: " + p.name + ", 나이: " + p.age);
	}
}
