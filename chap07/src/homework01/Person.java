package homework01;

public class Person {
	protected String name;
	
	private int age;
	private double height;
	private double weight;
	
	// 생성자 
	public Person() {
		super();
	}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 메소드
	public String toString() {
		String info = "";
		info += "=== " + name + " ===";
		info += "\n";
		info += "나이 : " + age;
		info += "\n";
		info += "키 : " + height;
		info += "\n";
		info += "몸무게 : " + weight;
		info += "\n";
		return  info;
				
	}
	
	// getter, setter
	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// height
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// weight
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
