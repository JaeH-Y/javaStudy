package sec07.exam01;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Student other) {
		// 점수 기준 오름차순
//		if (this.score < other.score) {
//			return -1;
//		} else if (this.score > other.score) {
//			return 1;
//		} else {
//			return 0;			
//		}
		
		// 위 비교 연산을 이미 구현한 메소드
		return Integer.compare(this.score, other.score);
	}
	
}
