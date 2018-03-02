package lab06;

public class SavingsAccount extends BankAccount{
	private double rate;
	public SavingsAccount(double balance, double rate){
		super(balance);
		if(rate < 0)
			throw new IllegalArgumentException("rate should be positive");
		this.rate = rate;
		
	}
	@Override
	public void deposit(double amount){
		double amt =  amount + (amount*rate);
		super.deposit(amt);
	}
	public double getRate(){
		return rate;
	}
	@Override
	public String toString(){
		String ansr = super.toString() + " @ N%";
		return ansr;
	}
}