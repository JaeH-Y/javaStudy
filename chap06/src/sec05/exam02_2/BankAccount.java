package sec05.exam02_2;

public class BankAccount {
	
	// interestRate는 모든 고객에게 적용되는 금리
	static double interestRate = 2.5; // 금리(모든 계좌에 공통 적용)
	String owner;	// 계좌주
	double balance; // 잔액
	
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public void printInfo() {
		System.out.println(owner + "님의 잔액: "+balance+ ", 금리: " + interestRate + "%");
	}
	
	
	
}
