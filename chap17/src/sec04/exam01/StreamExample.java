package sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Product> list = new ArrayList<Product>();
		for (int i = 1; i <= 5; i++) {
			Product product = new Product(i, "상품" + i, "멋진 회사", (int) (Math.random() * 10000));
			list.add(product);
		}
		
		// 객체 스트림 얻기 + 객체 출력하기
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
		
		list.stream().forEach(System.out::println);
		
		// (참고) Iterable 인터페이스에 정의된 forEach()도 있음
		// 여러 중간 처리 필요 없이 단순 순회 작업 시
		list.forEach(p -> System.out.println(p));
		
	}

}
