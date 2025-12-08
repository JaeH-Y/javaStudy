package sec02.exam01;

public class ButtonExample {
	public static void main(String[] args) {
		// Ok 버튼 생성
		Button okBtn = new Button();
		
		// Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		okBtn.setClickListener(() -> {
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		
		okBtn.click();
		
		// Cancel 생성
		Button cancelBtn = new Button();
		
		cancelBtn.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
		
		cancelBtn.click();
		
	}
}
