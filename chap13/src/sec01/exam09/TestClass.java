package sec01.exam09;

import java.util.Objects;

public class TestClass {
	private String name;
//	private String firstSSN;
//	private int gender;
	private int age;
	
	
	// 생성자
	public TestClass() {
	}
	public TestClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// Getter/Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getFirstSSN() {
//		return firstSSN;
//	}
//	public void setFirstSSN(String firstSSN) {
//		this.firstSSN = firstSSN;
//	}
//	public int getGender() {
//		return gender;
//	}
//	public void setGender(int gender) {
//		this.gender = gender;
//	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestClass other = (TestClass) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "TestClass [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	
}
