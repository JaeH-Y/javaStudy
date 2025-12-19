package exampleTest;

public class Sol34 {
	public static void main(String[] args) {
		String number = "4177252841";
		int k = 4;
		
		int len = number.length();
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < len; i++) {
			char c = number.charAt(i);
			
			while(k > 0 && builder.length() > 0 && builder.charAt(builder.length() - 1) < c) {
				builder.deleteCharAt(builder.length() - 1);
				k--;
			}
			
			builder.append(c);
		}
		
		if(k > 0) {
			builder.setLength(builder.length() - k);
		}
	}
}
