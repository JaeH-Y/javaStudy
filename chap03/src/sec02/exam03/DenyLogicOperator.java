package sec02.exam03;

public class DenyLogicOperator {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		int x = 5;
		if(x < 1 || x > 10) {
			System.out.println("1보다 작거나 10보다 큰 수");
		}
		if(!(x >= 1 && x <= 10)) {
			System.out.println("1보다 작거나 10보다 큰 수");
		}
		if(x >= 1 && x <= 10) {
			System.out.println("1이상이고 10이하인 수");
		}
		
		
		
		
		
	}

}
