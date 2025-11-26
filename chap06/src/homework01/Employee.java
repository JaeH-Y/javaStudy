package homework01;

public class Employee {
	public String name;
	public String team;
	String position;
	int salary;
	private int bonus;
	
	public Employee(String _name, String _team) {
		name = _name;
		team = _team;
		System.out.println("이름: "+name+", 팀: "+team);
	}
}
