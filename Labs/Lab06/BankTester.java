package lab06;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankTester {
	List<BankAccount> accounts;
	List<Object> objects;
	//we can initialize some objects to be used in later tests
	//using the Before keyword ensures this method is called before 
	//the test methods are called

	//Please note that this method is rerun before the start of each test,
	//which means the BankAccounts will have their numId's increased 
	//each time the account is called.

	//we will fix this issue by adding an @After method, which is run 
	//after each test ends
	@Before
	public void initialize(){
		accounts = new ArrayList<BankAccount>();
		accounts.add(new BankAccount(100.0));
		accounts.add(new CheckingAccount(700.0, 10));
		accounts.add(new BankAccount(500.0));
		accounts.add(new SavingsAccount(100.0, .1));
		accounts.add(new CheckingAccount(103.0, 4));
		accounts.add(new SavingsAccount(500.0, .05));
	}

	@After
	public void resetIdNum(){
		BankAccount.reset();
		accounts.clear();
	}


	//the @Test is necessary, without it the test will not be run
	@Test
	public void testBankAccDeposit() {
		BankAccount bacc = new BankAccount(700.00);
		bacc.deposit(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(800.00, bacc.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("BankAccount's deposit() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testCheckingAccWithdraw(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two doubles, we need to give it some small value for it to see 
			//if the expected and actual value are close enough to equaling one another
			assertEquals(700.00, checking.getBalance(), 1e-6);
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's withdraw() method failed: " + e.getMessage());
			throw e;
		}
	}
	@Test
	public void testCheckingAccGetWithdrawCount(){
		CheckingAccount checking = new CheckingAccount(1000.00, 10);
		for(int i = 0; i < 3; i++) checking.withdraw(100);
		try {
			//when comparing two integers, we don't need a third argument 
			//since ints can be checked for equality
			assertEquals(3, checking.getWithdrawCount());
		}
		//here if there is an assertion error, we can catch it 
		//and print the error message out, then throw the AssertionError
		//so that the test still fails. 
		catch(AssertionError e){
			System.out.println("CheckingAccount's getWithdrawCount() method failed: " + e.getMessage());
			System.out.println("Make sure you adjust the withdrawCount in your CheckingAccount's withdraw() method!");
			throw e;
		}
	}
	//TODO: Add some of your own additional tests. Keep each test in a separate test function.
	//This isolates testing a single method or case to a single testing method. Otherwise, 
	//if you try to do too much testing in one tester method, you could throw an error
	//for a test and never find the errors of the other tests you put in that method. 


	@Test
	public void dynamicDispatchPrinting(){
		//FILL IN AS SPECIFIED
		System.out.println(accounts);
		for(BankAccount b : accounts){
			if(b instanceof SavingsAccount){
				System.out.println("SavingsAccount: ");
			}
			else if(b instanceof CheckingAccount){
				System.out.println("CheckingAccount: ");
			}
			//note that we do this as an else block
			//since SavingsAccount and CheckingAccounts are also
			//considered to be instances of BankAccount
			//since they are subclasses of BankAccount.
			else{
				System.out.println("BankAccount: ");
			}
			System.out.println(b);

		}
	}
		@Test
		public void myTesting(){
			for(BankAccount temp : accounts)
				temp.deposit(10.0);
			assertEquals(accounts.get(0).getBalance(), 110.0, 1e-6);
			assertEquals(accounts.get(1).getBalance(), 710.0, 1e-6);
			assertEquals(accounts.get(2).getBalance(), 510.0, 1e-6);
			System.out.println(accounts.get(5).getBalance());
			assertEquals(accounts.get(3).getBalance(), 111.0, 1e-6);
			assertEquals(accounts.get(4).getBalance(), 113.0, 1e-6);
			assertEquals(accounts.get(5).getBalance(), 510.5, 1e-6);

		}
	}

