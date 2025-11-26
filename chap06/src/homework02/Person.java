package homework02;

public class Person {
	private String name;
	private String address;
	public String phoneNumber;
	public double tall;
	public double weight;
	
	public Person(String _phoneNumber, double _tall, double _weight) {
		phoneNumber = _phoneNumber;
		tall = _tall;
		weight = _weight;
		
		System.out.println("전화번호 :" + phoneNumber + ", 키 :" + tall + ", 몸무게 :" + weight);
	}
}
