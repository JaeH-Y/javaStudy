package homework03;

public class Library {
	
	// Method
	
	public String MergeStringAandB(String a, String b) {
		return a+b;
	}
	
	
	public int MultipleBigAandB(int a, int b) {
		if(a < b) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return a*b;
	}
	
	public boolean CheckEqualsString(String a, String b) {
		return a.equals(b);
	}
	
	
	
	
	
}
