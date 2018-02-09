package assignment03;
public class Driver1{
	public static void main(String[] args){
		BankAccount1[] none = null;
		BankAccount1[] empty = new BankAccount1[0];
		BankAccount1[] test = new BankAccount1[3];
		test[0] = new BankAccount1("College Professor", 1000000);
		test[2] = new BankAccount1("College Student", -10);
		test[1] = null;
		BankAccount1[] allNull = new BankAccount1[1];
		allNull[0] = null;
		Customer[] noCust = null;
		Customer[] emptyCust = new Customer[0];
		Customer[] testCust = new Customer[3];
		testCust[0] = new Customer("Capitalist pig", 4000000);
		testCust[2] = new Customer("Karl Marx", -20);
		testCust[1] = null;
		Customer[] allNullCust = new Customer[1];
		allNullCust[0] = null;
		try{
			System.out.println(Question1.averageBankBalance(none));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question1.averageBankBalance(allNull));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(Question1.averageBankBalance(empty));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question1.averageBankBalance(test));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question1.lowestBankBalance(none));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(Question1.lowestBankBalance(allNull));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		 try {
			System.out.println(Question1.lowestBankBalance(empty));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		 try {
			System.out.println(Question1.lowestBankBalance(test) + " WHYYY");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question1.longestName(none));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question1.longestName(allNull));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.longestName(empty));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.longestName(test));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
	}
	 try {
			System.out.println(Question1.averageCustomerBalance(noCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.averageCustomerBalance(allNullCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question1.averageCustomerBalance(emptyCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.averageCustomerBalance(testCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.greatestCustomerBalance(noCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.greatestCustomerBalance(allNullCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question1.greatestCustomerBalance(emptyCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question1.greatestCustomerBalance(testCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
