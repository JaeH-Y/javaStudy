package homework.Homework02;

public class Practice {

	public String takeState(String address) {
		String[] add = address.split(" ");
		for(String gu : add) {
			if(gu.charAt(gu.length()-1) == '구') {
//				System.out.println(gu);
				return gu;
			}
		}
		return null;
	}

}
