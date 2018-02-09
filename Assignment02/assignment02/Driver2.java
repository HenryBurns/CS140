package assignment02;

public class Driver2{
	public static void main(String[] args){
		Bank piggy = new Bank();
		piggy.createTestAccounts();
		System.out.println(piggy.computeInterestToPay(12.7));
		}
	}
