package homework01;

public class Employee extends Person {
	
	private int salary;
	private String dept;
	
	
	// 생성자
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	// 메소드
	@Override
	public String toString() {
		String info = "";
		info += "급여 : " + salary;
		info += "\n";
		info += "부서 : " + dept;
		info += "\n";
		return super.toString() + info;
	}

	// getter, setter
	// salary
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// dept
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
}
