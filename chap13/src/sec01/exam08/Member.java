package sec01.exam08;

import java.util.Objects;

public class Member implements Comparable<Member>{

	private String name;
	private int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Getter/Setter
	public String getName() {
		return name;
	}
	
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

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
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Member o) {
		int r = this.age < o.age ? -1 : this.age > o.age ? 1 : 0;
		return r;
	}
	
	
	
}
