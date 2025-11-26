package homework.homework04;

public class NumberController {

	public NumberController() {
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException {
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		if(min < 1 || max > 100) throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		
		if(num1 % num2 == 0) return true;
		else return false;
	}
}
