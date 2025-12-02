package sec01.exam06.quiz;

import java.util.Objects;

public class Food {

	private String name;
	private int price;
	
	
	// 생성자
	public Food() {
	}
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	// 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}

	
	
	
}
