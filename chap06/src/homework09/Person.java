package homework09;

public class Person {
	public String name;
	public int age;
	
	private String name2;
	private int age2;
	
	public Person() {
		
	}


	public String getName2() {
		return name2;
	}


	public void setName2(String name2) {
		this.name2 = name2;
	}


	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}
	
	public void getAll() {
		System.out.println(name2 + "는 " + age2 + "살 입니다.");
	}
	
	
	
}
