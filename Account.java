package Pratice;
public class Account {
	private int id;
	private double balance;
	private double InterestRate;
	public Account(int id, double balance, double interestRate) {
		super();
		this.id = id;
		this.balance = balance;
		InterestRate = interestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	
}
