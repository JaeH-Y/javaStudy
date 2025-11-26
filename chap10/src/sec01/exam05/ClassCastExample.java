package sec01.exam05;

public class ClassCastExample {
	
	public static void main(String[] args) {
	
		// 상위 타입에 하위 타입을 넣을 경우 자동 타입 변환
		Animal animal = new Dog();
		
		// 하위 타입에 상위 타입을 넣고 싶은 경우 강제 형변환(캐스팅 변환) 필요
//		Dog dog = animal;
		Dog dog = (Dog)animal;
		
//		Cat cat = (Cat)animal;	// 예외 발생
		
		
		changeDog(new Dog());
		changeDog(new Cat());
		
		
	}

	private static void changeDog(Animal animal) {
		
		if(animal instanceof Dog dog) {
			dog = (Dog)animal;
		}
	}
}
// 하나의 자바 파일에 클래스 여러 개 선언 가능(단, public class 한 개만 가능)

class Animal {
	
}

class Dog extends Animal{
	
}
class Cat extends Animal{
	
}