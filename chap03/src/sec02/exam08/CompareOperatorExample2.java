package sec02.exam08;

import java.util.Scanner;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);	// true
		System.out.println((double)v2 + "==" + v3);	// true
		// v2가 double 타입으로 변환됨, 1.0 == 1.0 => true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v2 == v3);	// false
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이 때문에 false
		System.out.println(v4 + "==" + (double)v5);
		// 자바에서는 0.1을 float나 double로 저장하면 정확히 0.1이 저장되지 않음
		// 이는 부동소수점 표현의 한계 때문이며, 이진수로 정확히 표현할 수 없는 10진수이기 때문
		// v4도 정확히 0.1인건 아님(매우매우매우매우 근사값)
		
		//해결책
		// 1. double -> float로 바꿔서 비교
		System.out.println((float)v4 == v5);
		
		// 2. 정수로 바꿔서 비료
		System.out.println((int)(v4*10) == (int)(v5*10));
		
		// 정리 : float 타입과 double 타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일하는 것이 좋음(주로 double 사용)
		
		
	}

}
