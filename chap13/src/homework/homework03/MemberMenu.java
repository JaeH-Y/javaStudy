package homework.homework03;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MemberMenu {
	// Scanner 객체 생성
	// MemberController 객체 생성
	Scanner sc = new Scanner(System.in);
	MemberController controller = new MemberController();
	
	public void mainMenu(){
		// 1. 종료 전까지 메뉴 화면 반복 실행
		// 2. 각 메뉴 번호를 입력하면 해당 메소드로 이동
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// 출력 예시)
		// ===== (주)구디에 오신것을 환영합니다. =====
		// 원하시는 메뉴의 번호를 입력하세요.
		// 1. 회원가입 -> joinMember() 실행
		// 2. 로그인 -> logIn() 실행 후 memberMenu() 실행
		// 3. 같은 이름 회원 찾기 -> sameName() 실행
		// 9. 종료 -> "프로그램을 종료합니다." 출력
		// 메뉴 번호 입력 : 
		while (true) {
			System.out.println("===== (주)구디에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입"); // joinMember() 실행
			System.out.println("2. 로그인");	// logIn() 실행 후 memberMenu() 실행
			System.out.println("3. 같은 이름 회원 찾기"); // sameName() 실행
			System.out.println("9. 종료"); // "프로그램을 종료합니다." 출력
			System.out.print("메뉴 번호 입력: ");
			
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				switch (menuNo) {
				case 1: 
					joinMember();
					break;
				case 2: 
					logIn(); 
					memberMenu();
					break;
				case 3: 
					sameName();
					break;
				case 9: 
					System.out.println("프로그램을 종료합니다.");
					return;
				default: 
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					break;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
			}
			catch (RegexException e) {
				System.out.println("유효하지 않은 입력값입니다.");
			}
		}
	}
	
	public void memberMenu() {
		// 1. 로그아웃 전까지 메뉴 화면 반복 실행
		// 2. 각 메뉴 번호 입력하면 해당 메소드로 이동
		// 3. 잘못 입력하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요." 출력
		// ***** 회원 메뉴 *****
		// 회원 메뉴는 회원만 접근할 수 있습니다.
		// 먼저 회원가입, 로그인을 해주세요.
		// 1. 비밀번호 바꾸기 -> changePassword()실행
		// 2. 이름 바꾸기 -> changeName() 실행
		// 3. 로그아웃 -> "로그아웃 되었습니다." 출력 후 mainMenu로 돌아가기
		// (이전에 수행된 메소드로 돌아가려면 break; 대신 return; 코드를 사용)
		while (true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기"); // changePassword()실행
			System.out.println("2. 이름 바꾸기"); // changeName() 실행
			System.out.println("3. 로그아웃"); // "로그아웃 되었습니다." 출력
			System.out.print("메뉴 번호 입력: ");
			
			int menuNo = sc.nextInt();	
			sc.nextLine();
			switch (menuNo) {
				case 1: 
					changePassword();
					break;
				case 2: 
					changeName();
					break;
				case 3: 
					System.out.println("로그아웃 되었습니다.");
					return;
				default: 
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					break;
			}
		}
	}
	
	public void joinMember() {
		// 1. 회원가입에 필요한 아이디, 비밀번호, 이름 입력 받음
		// 2. 비밀번호와 이름은 Member 객체에 담음
		// 3. id와 Member 객체를 MemberController(mc)의 joinMember()로 보내기
		// (mc의 joinMember()를 호출하라는 이야기)
		// 4. mc의 joinMember()로부터 받은 결과에 따라 다른 문장 출력
		// -> true : "성공적으로 회원가입 완료하였습니다."
		// -> false : "중복된 아이디입니다. 다시 입력해주세요." 
		// (false일 경우 회원가입이 완료될때까지 반복)
		System.out.println("=== 1. 회원가입 ===");
		while(true) {
			System.out.print("아이디: ");
			String joinId = sc.nextLine();
			System.out.print("비밀번호: ");
			String joinPw = sc.nextLine();
			System.out.print("이름: ");
			String joinName = sc.nextLine();
			if(!controller.joinMember(joinId, new Member(joinPw, joinName))) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("성공적으로 회원가입 완료하였습니다.");
			break;
		}
		
	}
	public void logIn() {
		// 1. 아이디와 비밀번호를 사용자로부터 입력 받음
		// 2. mc의 logIn() 메소드로 넘겨줌
		// 3. 반환 값이 있으면 "OOO님, 환영합니다!" 출력
		// -> 그 다음 로그인 화면(memberMenu() 메소드 호출)으로 이동
		// -> memberMenu 호출은 mainMenu() 메소드에서 수행
		// 4. 반환 값이 없으면 
		// -> "틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요."출력
		// -> 올바른 아이디와 비밀번호를 입력할때까지 반복
		System.out.println("=== 1. 회원가입 ===");
		while(true) {
			System.out.print("아이디: ");
			String loginId = sc.nextLine();
			System.out.print("비밀번호: ");
			String loginPw = sc.nextLine();
			if(controller.logIn(loginId, loginPw) == null) {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println(loginId+"님, 환영합니다!");
			break;
		}
	}
	public void changePassword() {
		// 1. 아이디와 기존 비밀번호, 변경할 비밀번호 입력 받음
		// 2. mc의 changePassword()로 보내기
		// 3. mc의 changePassword로부터 받은 결과값이 true
		// -> "비밀번호 변경에 성공했습니다." 출력
		// 4. mc의 changePassword로부터 받은 결과값이 false
		// -> "비밀번호 변경에 실패했습니다. 다시 입력해주세요." 출력
		// -> 비밀번호 변경에 성공할 때까지 반복
		System.out.println("=== 1. 비밀번호 바꾸기 ===");
		while(true) {
			System.out.print("아이디: ");
			String checkId = sc.nextLine();
			System.out.print("비밀번호: ");
			String checkPw = sc.nextLine();
			System.out.print("변경 비밀번호: ");
			String changePw = sc.nextLine();
			
			if(!controller.changePassword(checkId, checkPw, changePw)) {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("비밀번호 변경에 성공했습니다.");
			break;
		}
	}
	
	public void changeName() {
		// 1. 아이디와 비밀번호를 입력 받음
		// 2. mc의 logIn()으로 아이디, 비밀번호 전달해서 현재 저장되어 있는 이름 받음
		// 3. mc.logIn()에서 전달받은 문자열이 null이 아닌 경우
		// 3-1.사용자에게 현재 저장되어 있는 이름을 출력해서 보여줌
		// 		사용자로부터 변경할 이름을 입력 받음
		// 		mc의 changeName()으로 id와 함께 넘김
		// 		"이름 변경에 성공하였습니다."출력
		// 3-2. 만일 logIn()으로부터 저장되어 있는 이름을 받지 못했다면
		// "이름 변경에 실패했습니다. 다시 입력해주세요"출력
		// logIn logIn()으로부터 저장되어 있는 이름을 받을 때까지 반복
		System.out.println("=== 2. 이름 바꾸기 ===");
		while(true) {
			System.out.print("아이디: ");
			String checkId = sc.nextLine();
			System.out.print("비밀번호: ");
			String checkPw = sc.nextLine();
			String oldName = controller.logIn(checkId, checkPw);
			if(oldName == null) {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요.");
				continue;
			}
			String changeName = null;
			while(true) {
				System.out.print("변경할 이름(2자 이상): ");
				changeName = sc.nextLine();
				String[] spaceCheck = changeName.split(" ");
				StringBuffer buff = new StringBuffer();
				for(String s : spaceCheck) {
					buff.append(s);
				}
				changeName = buff.toString();
				if(changeName == null || changeName.length() < 2) {
					System.out.println("변경할 이름을 두글자 이상 입력해주세요.");
					continue;
				}
				break;
			}
			controller.changeName(checkId, changeName);
			System.out.println("이름 변경에 성공했습니다.");
			break;
		}
	}
	
	public void sameName() {
		// 1. 검색할 이름을 받고 mc의 sameName()메소드로 넘김. 
		// -> mc의 sameName()은 TreeMap<String,String>을 리턴
		// 2. 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력 
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.print("검색할 이름 : ");
		String checkname = sc.nextLine();
		Map<String, String> treeM = controller.sameName(checkname);
		if(treeM == null || treeM.size() < 1) {
			System.out.println("해당 이름으로 생성 된 계정이 없습니다.");
			return;
		}
		Iterator<Entry<String, String>> iter = treeM.entrySet().iterator();
		StringBuffer buff = new StringBuffer().append(checkname + "-");
		while(iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			buff.append(entry.getKey());
			if(iter.hasNext()) {
				buff.append(", ");
			}
		}
		String result = buff.toString();
		System.out.println(result);
	}
}
