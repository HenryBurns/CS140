package assignment03;
public class Driver2{
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
			System.out.println(Question2.averageBankBalance(none));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question2.averageBankBalance(allNull));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(Question2.averageBankBalance(empty));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question2.averageBankBalance(test));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}

		try{
			System.out.println(Question2.lowestBankBalance(none));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		try{
			System.out.println(Question2.lowestBankBalance(allNull));
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		 try {
			System.out.println(Question2.lowestBankBalance(empty));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		 try {
			System.out.println(Question2.lowestBankBalance(test));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question2.longestName(none));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question2.longestName(allNull));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.longestName(empty));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.longestName(test));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
	}
	 try {
			System.out.println(Question2.averageCustomerBalance(noCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.averageCustomerBalance(allNullCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question2.averageCustomerBalance(emptyCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.averageCustomerBalance(testCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.greatestCustomerBalance(noCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.greatestCustomerBalance(allNullCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	 try {
			System.out.println(Question2.greatestCustomerBalance(emptyCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	try {
			System.out.println(Question2.greatestCustomerBalance(testCust));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
