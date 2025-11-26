package homework.homework03;

public class CharacterController {

	public CharacterController() {
		super();
	}
	public int countAlpha(String s) throws CharCheckException{
		int count = 0;
		
		for(char c : s.toCharArray()) {
			if(c == ' ') throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			if((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A')) count++;
		}
		
		return count;
	}
}
