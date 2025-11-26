package sec02.exam06.quiz;

public class Account {
	
	private String user;
	private long balance;
	
	public Account() {
		super();
	}

	// 생성자
	public Account(String user, long balance) {
		super();
		this.user = user;
		this.balance = balance;
	}

	// getter
	public String getUser() {
		return user;
	}

	public long getBalance() {
		return balance;
	}
	
	// 메소드
	public void deposit(int amount) {
		// 입금 금액만큼 잔액에 더하고 출력 예시와 같은 메시지를 출력합니다.
		balance += amount;
		System.out.println(amount + "원이 입금되었습니다. [잔액: "+balance+"원]");
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException{
		if(balance < amount) { 
			long gap = amount - balance;
			throw new InsufficientBalanceException("잔액이 "+gap+"원 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount + "원이 출금되었습니다. [잔액: "+balance+"원]");
		// 출금 금액이 잔액보다 크면 InsufficientBalanceException을 발생시키고 호출한 쪽으로 예외를 떠넘깁니다.
		//출금이 성공하면 잔액에서 차감하고, 출력 예시와 같은 메시지를 출력합니다.
	}
	
	
	
	
	
	
	

}
