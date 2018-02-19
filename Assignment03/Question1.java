package assignment03;
public class Question1{
	/**
	 Finds the average bank balance for all the bank accounts in the
	 given array.
	 Assume accs is not null or empty an no account in accs is null.
	 @param accs the array of BankAccount1 elements to examine
	 @return the average of the balances of the accounts in accs
	 @throws IllegalArgumentException if account is null, empty, or contains all	 null elements
	*/	
	public static double averageBankBalance(BankAccount1[] accs){
		if(accs == null)
			throw new IllegalArgumentException("Input should not be null");
		if(accs.length == 0)
			throw new IllegalArgumentException("Input should not be empty");
		double bal = 0;
		int cntr = 0;
		for (BankAccount1 temp : accs){
			if(temp != null){
				bal+= temp.getBalance();
				cntr++;
				}
			}
		if(cntr == 0)
			throw new IllegalArgumentException("Input should contain non-null elements");
		bal /= accs.length;
		return bal;
	}
	/**
	 Find the account in the array parameter that has the small
	 the smallest balance and in the case of a tie, return the
	 first such account. 
	 Assume accs is not null or empty an no account in accs is null.
	 @param accs the array of BankAccount1 elements to examine
	 @return the bank account in the array accs that has the
	 smallest balance. If there is more than one, then return the 
	 first of them.
	 @throws IllegalArgumentException if array is null, empty, or contains all null elements
	*/
	public static BankAccount1 lowestBankBalance(BankAccount1[] accs){
	if(accs == null)
		throw new IllegalArgumentException("Input should not be null");
	if(accs.length == 0)
		throw new IllegalArgumentException("Input should not be empty");
	int indx = 0;
	int cntr = 0;
	double min = Double.MAX_VALUE; 
	for(int i = 0; i < accs.length; i++){
		if(accs[i] != null)
			if(cntr == 0){
				min = accs[i].getBalance();
				cntr++;
				}
			else if ( accs[i].getBalance() < min){
				min = accs[i].getBalance();
				indx = i;
				cntr++;
		}
	}
	if(cntr == 0)
		throw new IllegalArgumentException("Input should contain non-null elements");
	return accs[indx];
	}
	/**
     In the array accs find the names of the customers and
	 return the longest name. If at least two names have the same
	 length, return the last one in the array of greatest length. 
	 @param accs the array of BankAccount1 elements to examine
	 @return the longest name of all the customerNames in
	 the customers in accs. If there is a tie for the length,
	 return the LAST name.
	 @throws IllegalArgumentException if array is empty, null, or contains only null elements
	*/
	public static String longestName(BankAccount1[] accs){
	if(accs == null)
		throw new IllegalArgumentException("Input should not be null");
	if(accs.length == 0)
		throw new IllegalArgumentException("Input should not be empty");
	int longestlength = 0;
	String name = "";
	int cntr = 0;
		for( BankAccount1 temp: accs){
			if(temp != null)
				if (temp.getCustomerName().length() > longestlength){
					longestlength = temp.getCustomerName().length();
					name = temp.getCustomerName();
					cntr++;
				}
			}
	if(cntr == 0)
		throw new IllegalArgumentException("Input should contain non-null elements");
		return name;
		}
	
	/**
	 Finds the average bank balance for all the bank accounts of the
	 Customers in the given array.
	 Assume accs is not null or empty an no Customer in accs is null
	 and no account in any Customer is null.
	 @param accs the array of Customer elements to examine
	 @return the average of the balances of the customer accounts of
	 the customers in accs
	 @throws IllegalArgumentException if array is null, empty, or contains only		 null elements
    */
	public static double averageCustomerBalance(Customer[] accs){
	if(accs == null)
		throw new IllegalArgumentException("Input should not be null");
	if(accs.length == 0)
		throw new IllegalArgumentException("Input should not be empty");
	double bal = 0.0;
	int cntr = 0;
		for(Customer temp: accs){
			if(temp != null){
				cntr++;
				bal += temp.getBalance();
				}
			}
		
		if(cntr == 0)
			throw new IllegalArgumentException("Input should contain non-null elements");
		bal /= accs.length;
		return bal;
		}
	/**
	 Find the Customer in the array parameter that has the largest
	 balance in their account field and in the case of a tie, return the
	 LAST such account. 
	 Assume accs is not null or empty an no Customer in accs is null
	 and no account in any Customer is null.
	 @param accs the array of Customer elements to examine
	 @return the Customer with the largest bank account in the array accs. 
	 If there is more than one, then return the last of them.
	 @throws IllegalArgumentException if array is null, empty, or contains only		 null elements.
	*/
	public static Customer greatestCustomerBalance(Customer[] accs){
	if(accs == null)
		throw new IllegalArgumentException("Input should not be null");
	if(accs.length == 0)
		throw new IllegalArgumentException("Input should not be empty");
	double bal = 0.0;
		Customer ansr = null;
	int cntr = 0;
			for(Customer temp: accs){
				if(temp != null && (cntr == 0 || temp.getBalance() > bal)){
					bal = temp.getBalance();
					ansr = temp;
					cntr++;
					}
				}
		if(cntr == 0)
			throw new IllegalArgumentException("Input should contain non-null elements");
		return ansr;
		}
	}
