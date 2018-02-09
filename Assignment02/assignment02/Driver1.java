package assignment02;


public class Driver1{
	public static void main(String[] args){
		BankAccount1[] test;
		test = new BankAccount1[3];
		test[1] = new BankAccount1("guy",1);
		test[0] = new BankAccount1("dude",17);
		test[2] = new BankAccount1("Richey", 237);
		String name = Question1.longestName(test);
		System.out.println(name + " has the longest name");
		System.out.println(Question1.lowestBankBalance(test)+ " is the lowest balance");
		System.out.println(Question1.averageBankBalance(test)+ " is the average balance");
		Customer[] people = new Customer[2];
		people[0] = new Customer("Other Test Guy", 4.3);
		people[1] = new Customer("test person", 1.2);
		System.out.println(Question1.averageCustomerBalance(people)+ " This is the" + 
" average customer balance");
		System.out.println(Question1.greatestCustomerBalance(people)+ " This is the"+
" greatest customer balance");
		}
	}
