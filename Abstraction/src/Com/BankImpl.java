package Com;

public class BankImpl implements Bank {

	int bal=5000;

	@Override
	public void deposit(int amount) {
		System.out.println("the amount deposited is : " +amount);
		bal=bal+amount;
		System.out.println("amount deposited successfully " +bal);

	}



	public void withdraw(int amount) {
		System.out.println("the amount withdrawed is : " +amount);
		bal=bal-amount;
		System.out.println("amount withdrawed " +bal);
	}


	public void checkBalance() {
		System.out.println("the balance is :  " +bal);
	}




	public static void main(String[] args) {
		Bank b = new BankImpl();
		b.deposit(10000);
		b.withdraw(2000);
		b.checkBalance();

	}
}
