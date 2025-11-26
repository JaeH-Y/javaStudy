package sec02.exam04;

public class CatchOrderExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		// 2가지 예외가 발생 가능
		// 하나의 try catch문으로 합치기(다중 catch 사용)
		try {
			data1 = args[0]; // 실행 예외 발생
			data2 = args[1];
			// "a20" 같이 문자가 섞이면 실행 예외 발생
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}
		catch (NumberFormatException | NullPointerException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}
		catch (Exception e) {
			// 모든 예외는 Exception을 상속 받음 = 모든 예외 객체가 대입 가능함(제일 마지막에 위치해야함)
			// Exception 타입을 쓰는 경우 => 예외 타입과 상관없이 공통적으로 예외 처리를 할 때
			System.out.println("실행에 문제가 있습니다.");
		}
		finally {
			System.out.println("다시 실행하세요.");
		}
		
		// (참고) 자바 7 이상부터 멀티캐치 구문 가능
		// 여러 예외를 |로 연결해서 하나의 catch 블록에서 처리 가능
		
		
				
	}
}
