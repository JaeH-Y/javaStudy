package homework08;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonus;
	private String phone;
	private String address;
	
	
	public Employee() {
		
	}
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonus,
			String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.phone = phone;
		this.address = address;
	}
	public int getEmpNo() {
		System.out.println("사번 : " +empNo);
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	public String getEmpName() {
		System.out.println("=== "+empName+"의 정보 ===");
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getDept() {
		System.out.println("부서 : "+dept);
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getJob() {
		System.out.println("직급 : "+job);
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getAge() {
		System.out.println("나이 : "+age);
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		String text = "";
		if(gender == 'm' || gender == 'M') text = "남";
		else text = "여";
		System.out.println("성별 : "+text);
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getSalary() {
		System.out.println("월급 : "+salary);
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String getPhone() {
		System.out.println("전화번호 : "+phone);
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		System.out.println("주소 : "+address);
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
