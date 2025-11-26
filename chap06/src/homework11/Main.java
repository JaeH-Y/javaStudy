package homework11;

public class Main {
	public static void main(String[] args) {
		Account first = new Account("123-456-789", 100000);
		Account second = new Account("987-654-321", 50000);
		
		
		first.deposit(30000);
		second.withdraw(100000);
		
		
		Bank trans = new Bank();
		
		trans.transfer(first, second, 50000);
		
		System.out.println("계좌번호: "+first.getAccountNumber());
		System.out.println("현재 잔액: "+first.getBalance());
		System.out.println("계좌번호: "+second.getAccountNumber());
		System.out.println("현재 잔액: "+second.getBalance());
	}
}
