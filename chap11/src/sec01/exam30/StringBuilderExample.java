package sec01.exam30;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder
		// 문자열을 변경 가능한 객체로 다루기 위해 만들어졌으며,
		// 문자열을 이어붙이거나 수정할 때 보다 효율적이고 성능상 유리
		// 다중 연산 시 메모리 절약 가능
		
		// StringBuffer와 완전 동일, 동기화 기능만 제거(싱글쓰레드인 경우 StringBuilder가 약간의 성능이 향상됨)
		// 동기화란?
		// 멀티 쓰레드 환경에서 동시에 변경하려고 할 때 데이터 보호 기능
		// 즉, StringBuffer는 동기화가 보장됨(동시 제어 방어 됨), StringBuilder는 동기화 보장 안됨(동시 제어 방어 안됨)
		
		StringBuilder sb = new StringBuilder("Java");
		
		// 기존 문자열의 끝에 주어진 값을 추가
		sb.append(" Program Study");
		sb.append(" now ").append("start");
		System.out.println(sb.toString());
		
		// 지정한 인덱스 위치에 주어진 값을 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		// 지정한 인덱스의 문자를 주어진 문자로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		// 지정한 시작 인덱스부터 끝 인덱스 이전까지의 문자열을 다른 문자열로 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		// 지정한 시작 인덱스부터 끝 인덱스 이전까지의 문자열을 삭제
		sb.delete(4,5);
		System.out.println(sb.toString());
		
		// 현재 Stringuilder에 담긴 문자열의 길이를 반환
		int length =  sb.length();
		System.out.println("총 문자수: "+ length);
		
		// 현재 StringBuilder에 담긴 문자열 내용을 String 객체로 반환
		String result = sb.toString();
		System.out.println(result);
		
		// 정리:
		// 내부에서 문자열을 저장해서 조작하기 떄문에 변경이 있을 때마다 객체를 만들지 않음
		// 문자열을 많이 변경할 경우 String보다 StringBuilder를 쓰는게 성능상 좋음
		
		
		
	}
}
