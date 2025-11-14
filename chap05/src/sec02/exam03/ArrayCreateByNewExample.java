package sec02.exam03;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// new 연산자로 배열 생성
		// 길이가 3인 int 타입 배열 생성
		int[] arr1 = new int[3];
		
		// 기본값(초기값)? 0
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		
		System.out.println();
		
		double[] arr2 = new double[3];
		
		// 기본값(초기값)? 0.0
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		System.out.println();
		
		String[] arr3 = new String[3];
		
		// 기본값(초기값)? null
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
		// 정리:
		// 배열은 값 목록을 이용해서 생성 또는 길이를 지정하여 배열 객체를 생성
		// 배열 생성 시 지정된 타입으로만 저장 가능
		// 배열은 처음 생성 시 길이가 정해지면 변경 불가
		// 추후 이런 한계점을 개선한 ArrayList를 학습
	}

}
