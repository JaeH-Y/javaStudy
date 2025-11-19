package sec03.exam03.quiz;

public class Animal {
	String kind;
	int age;
	
	
	
	Animal(int _age){
		kind = "사람";
		age = _age;
	}
	
	Animal(String _kind){
		kind = _kind;
		age = 1;
	}
	
	Animal(String _kind, int _age){
		kind = _kind;
		age = _age;
	}
	
	
	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
