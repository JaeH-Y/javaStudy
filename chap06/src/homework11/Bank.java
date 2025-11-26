package homework11;

public class Bank {
	void transfer(Account sender, Account receiver, int amount) {
		sender.deposit(amount);
		receiver.withdraw(amount);
	}
}
