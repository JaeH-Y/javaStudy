package sec02.exam07;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");

		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);    
		System.out.println(strArray[0].equals(strArray[2])); // 내부 문자열을 비교하고 싶을 때
		
		
		String a = "aBcDeFg";
		String b = "";
        
        for(int i=0; i< a.length(); i++){
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                b += (a.charAt(i)+ "").toUpperCase();
            }
            else if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
            	b += (a.charAt(i) + "").toLowerCase();
            }
        }
        System.out.println(b);
	} 
}

