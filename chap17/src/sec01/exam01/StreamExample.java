package sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("고길동");
		
		// 외부 반복자 이용
		for(String name:set) {
			System.out.println(name);
		}
		System.out.println();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("While Breaked");
		System.out.println();
		
		// 내부 반복자 이용
		Stream<String> stream = set.stream();
		
		// 익명 구현 객체 사용 시 
		System.out.println("익명 구현 객체 사용");
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// 스트림은 한 번 사용하면 재사용 불가, 다시 얻어서 사용
		stream = set.stream();
		
		// 데이터를 어떻게 처리할 지 스트림한테 람다식으로 제공한다
		System.out.println();
		System.out.println("람다식 사용");
		stream.forEach(x -> {
			System.out.println(x);	
		});
		
		System.out.println();
		System.out.println("람다식 사용 2");
		stream = set.stream();
		stream.forEach(x -> System.out.println(x));
		
		stream = set.stream();
		System.out.println();
		System.out.println("축약형 람다식 사용");
		stream.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
	}
}
