package java_20160812_Account;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------");
		
		Account account = new Account(); // 통장개설
		account.deposit(100);
		System.out.println("잔액 : " + account.getBalance());
		
		account.withdraw(70);
		System.out.println("잔액 : " + account.getBalance());
		
		account.withdraw(70);
		System.out.println("잔액 : " + account.getBalance());
		
		System.out.println("----------------------------------");
		
		MinusAccount minusAccount = new MinusAccount(1000);
		System.out.println("잔액 : " + minusAccount.getBalance());
		
		minusAccount.withdraw(500);
		System.out.println("잔액 : " + minusAccount.getBalance());
		
		minusAccount.withdraw(500);
		System.out.println("잔액 : " + minusAccount.getBalance());
		
		minusAccount.withdraw(500);
		System.out.println("잔액 : " + minusAccount.getBalance());
		
		System.out.println("----------------------------------");
		
		Account account2 = new MinusAccount(1000);
		System.out.println("잔액 : " + account2.getBalance());
		
		account2.withdraw(200);
		System.out.println("잔액 : " + account2.getBalance());
		
		account2.withdraw(900);
		System.out.println("잔액 : " + account2.getBalance());
		
		System.out.println("----------------------------------");
		
	}

}
