package sec01.exam03_2;

import java.util.ArrayList;

public class PaymentExample {
	public static void main(String[] args) {
		
		// 카드 결제
		CardPayment cardP = new CardPayment();
		cardP.pay(50000);
		System.out.println();
		
		// Paypal 결제
		PaypalPayment payP = new PaypalPayment();
		payP.pay(30000);
		System.out.println();

		// 계좌이체 결제
		BankTranferPayment bankP = new BankTranferPayment();
		bankP.pay(20000);
		System.out.println();
		
		
		
		
		
	}
}
