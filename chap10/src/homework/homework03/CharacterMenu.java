package homework.homework03;

public class CharacterMenu {
	public void menu(String msg) {
		CharacterController controller = new CharacterController();
		try {
			System.out.println("'"+msg+"'에 포함된 영문자 개수: "+controller.countAlpha(msg));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
