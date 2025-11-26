package homework.Homework01;

public class Run {
	public static void main(String[] args) {

		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] arr = str.split("\n");
		String[][] info = new String[arr.length][];
		for(int i = 0; i < arr.length; i++) {
			info[i] = arr[i].split(",");
		}
		
		for(String[] persons : info) {
			String name = persons[0];
			int age = Integer.parseInt(persons[1]);
			String address = persons[2];
			char gender = persons[3].charAt(0);
			
			Person p = new Person(name, age, address, gender);
			System.out.println(p);
		}
	}
}
