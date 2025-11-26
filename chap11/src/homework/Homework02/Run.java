package homework.Homework02;

public class Run {
	public static void main(String[] args) {
		String[] addresses = {
				"서울특별시 금천구 구로디지털2로 95", "서울특별시 서대문구 연희로 248",
				"울산광역시 남구 돋질로 233", "경상북도 구미시 송정대로 55"};
		
		Practice p = new Practice();
		for(String address : addresses) {
			System.out.println(p.takeState(address));
		}
	}
}
