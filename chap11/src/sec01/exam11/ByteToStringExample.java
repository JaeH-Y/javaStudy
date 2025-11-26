package sec01.exam11;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes); // 각각의 keycode 값을 문자로 바꾸고 문자열로 리턴함
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); 	// 주어진 인덱스 위치(6)부터 몇개까지
		System.out.println(str2);
	}
}
