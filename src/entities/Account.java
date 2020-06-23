package entities;

public class Account {
	private int accountNumber;
	private String holder;
	private double balance;
	
	public Account(int accountNumber, String holder, double initialBalance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialBalance);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getSaldo() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5.0;
	}
	
	public String toString() {
		return "Account number: "
			+ getAccountNumber()
			+ ", Holder: "
			+ getHolder()
			+ ", Balance: "
			+ String.format("%.2f", getSaldo());
	}
}
