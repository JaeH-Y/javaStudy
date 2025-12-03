package exampleTest;

public class Soll11 {
	public static void main(String[] args) {
		
		int brown = 8;
		int yellow = 1;
		
		int[] answer = new int[2];
        int y = 3;
        int x = (brown + yellow) / 3;
        while(x >= y){
        	System.out.println("x: " + x);
        	System.out.println("y: " + y);
            int xCon = (x * 2) + ((y-2) * 2);
            int yCon = (y-2) * (x-2);
            System.out.println("yCon: " + yCon);
            if(xCon == brown && yCon == yellow){
                answer[0] = Math.max(x,y);
                answer[1] = Math.min(x,y);
                break;
            }
            y++;
            x = (brown + yellow) / y;
        }
        
        System.out.println("answer[0]: " + answer[0]);
        System.out.println("answer[1]: " + answer[1]);
	}
}
