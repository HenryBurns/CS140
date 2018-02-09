package assignment02;
public class Bank{
	private Customer[] customers = new Customer[2000];
	public void createTestAccounts(){
		for(int i = 0; i < 1999; i++){
			customers[i] = new Customer("Name" + i, 100 + (Math.random()*10000));
			}
	}
	public double computeInterestToPay(double rate){
		double interest = 0.0;
		for(int i = 0; i < 1999; i++){
			if(customers[i].getBalance() >999){
				interest += 1.5* rate * customers[i].getBalance()/1200;}
			else
				interest += rate/1200 * customers[i].getBalance();
			}
		return interest;
		}
	}			
