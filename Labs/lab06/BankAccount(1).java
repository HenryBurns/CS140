package lab06;

public class BankAccount {
	private double balance;
	private int idNum;
	private static int numAccounts = 0;
	public BankAccount(double balance){
		if(balance < 0 )
			throw new IllegalArgumentException("input shouldn't be negative");
		this.balance = balance;
		idNum = numAccounts;
		numAccounts++;
	}
	public double getBalance(){
		return balance;
	}
	public int getIdNum(){
		return idNum;
	}
	static void reset(){
		numAccounts = 0;
	}
	@Override
	public String toString(){
		return "Acct. #" + idNum + " has $" + balance;
	}
	public void deposit(double amount){
		if(amount < 0)
			throw new IllegalArgumentException("Deposits must be done with positive values");
		balance += amount;
	}
	public double withdraw(double amount){
		double amt = 0;
		if(amount < 0)
			throw new IllegalArgumentException("Withdrawls must be done with positive values");
		if (amount > balance)
			amt = balance;
			else
				amt = amount;
		balance -= amt;
		return amt;
	}
	
}