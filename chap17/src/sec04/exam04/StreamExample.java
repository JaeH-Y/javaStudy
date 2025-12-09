package sec04.exam04;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) throws Exception {
		// data.txt 파일의 경로(Path) 객체 얻기
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		File file = new File(StreamExample.class.getResource("data.txt").getPath());
		System.out.println(file);
		System.out.println(path);
		// Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성, 기본 UTF-8 문자셋으로 읽음
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		// 총 5개의 요소가 흘러감
		stream.forEach(line -> System.out.println(line));
		stream.close();
		
	}

}
