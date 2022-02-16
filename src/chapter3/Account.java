package chapter3;

public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if(balance > 0.0)
			this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double withdrawalAmount) {
		if(withdrawalAmount <= balance)
			balance = balance - withdrawalAmount;
		System.out.println("Withdrawal amount exceeded account balance");
	}
}
