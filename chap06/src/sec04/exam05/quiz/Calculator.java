package sec04.exam05.quiz;

public class Calculator {
	int getEvenTotal(int startNum, int endNum) {
		int sum = 0;
		for(int i = startNum; i <=endNum; i++) {
			if(i % 2 == 0)
			sum += i;
		}
		
		return sum;
	}
}
