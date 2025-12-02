package homework.homework01;

import java.util.Objects;

public class Book implements Comparable<Book>{
	// Fields
	private String title;
	private String author;
	private String category;
	private int price;
	
	// Constructor
	public Book() {
		super();
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	// Getter, Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// Object Overrider
	@Override
	public String toString() {
		return title + "(" + author + ")" + ", " + category + ", " + price + "원";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) || Objects.equals(category, other.category) || price == other.price
				|| Objects.equals(title, other.title) || title.contains(other.title);
	}

	// Comparable Overrider
	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
		
	}
	
	
	
}
