package sec03.exam02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장될 List 컬렉션
	List<Product> list = new ArrayList<Product>();
	// 키보드 입력 Scanner 생성
	Scanner sc = new Scanner(System.in);
	// 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	private int counter;
	
	public void showMenu() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			try {
				switch (selectNo) {
				case "1": registerProduct(); break; // Product 등록
				case "2": showProducts(); break; // 등록된 모든 Product 정보 보기
				case "3": return; // 프로그램 종료
				default: System.out.println("1부터 3중에 선택하세요.");
				}
			}
			catch (Exception e) {
				System.out.println("기타 예외 발생");
				e.printStackTrace();
			}
		}
	}
	
	public void registerProduct() {
		// Quiz: 예외 처리까지 추가
		while(true) {
			try {
				System.out.print("상품명: ");
				String name = sc.nextLine();
				System.out.print("가격: ");
				int price = sc.nextInt();
				
				System.out.print("재고: ");
				int stock = sc.nextInt();
				
				list.add(new Product(++counter, name, price, stock));
			}
			catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				sc.nextLine();
				continue;
			}
			break;
		}
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + ". 상품명: " + p.getName() + "\t 가격: " + p.getPrice() + " 원\t 재고: " + p.getStock()+"EA");
		}
	}
	
}
