package ch2;

public class Company implements Runnable {

	private Account account;

	public Company(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("adding");
			account.addAmount(1000);
		}
	}
}
