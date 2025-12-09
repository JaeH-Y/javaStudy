package sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
	public static void main(String[] args) {
		// stream() -> 순차 처리
		// parallelStream() 또는 stream().parallel() => 병렬 처리
		// 예: 100개의 요소가 있으면 1~50번 요소는 쓰레드A, 51~100까지는 쓰레드B에서 처리
		// (참고) 쓰레드 수는 CPU 코어 수에 기반
		
		List<String> list = new ArrayList<String>();
		
		list.add("홍길동");
		list.add("동길동");
		list.add("서길동");
		list.add("남길동");
		list.add("북길동");
		
//		list.stream().forEach(x -> System.out.println(x + ": " + Thread.currentThread().getName()));
		list.stream().parallel().forEach(x -> System.out.println(x + ": " + Thread.currentThread().getName()));
		// 참고: 요소가 적을 때는 병렬 스트림이 오히려 더 느릴 수 있음
		// 쓰레드를 만드는 것도 비용이 든다
		
	}
}
