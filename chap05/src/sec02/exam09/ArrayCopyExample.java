package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 사용
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		// src: 복사할 원본 배열
		// srcPos: 원본 배열에서 복사할 위치
		// dest: 붙여넣을 대상 배열
		// destPos: 대상 배열에 붙여넣을 위치
		// length: 몇 개를 복사할지
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int j = 0; j < newStrArray.length; j++) {
			System.out.println(newStrArray[j]);
		}
		System.out.println("-----------------------------");
		
		
		// 3. Arrays.copyOf() 메소드 이용
		
		// Arrays.copyOf(T[] original, int newLength)
		// original: 복사할 원본 배열
		// newLength: 복사할 새 배열의 길이(기존보다 작거나 클 수 있음)
		
		String[] newStrArr2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		
		for (int j = 0; j < newStrArr2.length; j++) {
			System.out.print(newStrArr2[j] + ", ");
		}
		System.out.println();
		
		String ta = "helloworld";
		String tb = "llowor";
		
		
		
		
		
	}
}
