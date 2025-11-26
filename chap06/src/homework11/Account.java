package homework11;

public class Account {

	private String accountNumber;
	private int balance;
	
	
	
	
	
	public Account() {
		super();
	}
	
	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	
	
	
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance -= amount;
		System.out.println(amount+"원을 출금했습니다. 현재 잔액: "+balance + "원");
	}
	
	public void withdraw(int amount) {
		balance += amount;
		System.out.println(amount+"원을 입금했습니다. 현재 잔액: "+balance + "원");
	}
	
	
	
	
	
	
	
}
