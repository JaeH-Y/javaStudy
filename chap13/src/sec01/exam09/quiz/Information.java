package sec01.exam09.quiz;

public class Information {
	
	private String phone;
	private int salary;
	
	
	// 생성자
	public Information() {
	}
	public Information(String phone, int salary) {
		this.phone = phone;
		this.salary = salary;
	}
	
	
	// Getter/Setter
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	// 오버라이딩
	@Override
	public String toString() {
		return "[전화번호=" + phone + ", 월급=" + salary + "]";
	}
	
	
	
	
	
	
}
