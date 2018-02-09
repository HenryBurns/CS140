package assignment03;
public class Question2{
	/**
	 Finds the average bank balance for all the bank accounts in the
	 given array.
	 Assume accs is not null or empty an no account in accs is null.
	 @param accs the array of BankAccount1 elements to examine
	 @return the average of the balances of the accounts in accs
	 @return 0.0 if accs is null, empty, or all elements are null
	*/	
	public static double averageBankBalance(BankAccount1[] accs){
		if(accs == null)
			return 0.0;
		if(accs.length == 0)
			return 0.0;
		double bal = 0;
		int cntr = 0;
		for (BankAccount1 temp : accs){
			if(temp != null){
				bal+= temp.getBalance();
				cntr++;
				}
			}
		if(cntr == 0)
			return 0.0;
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
	 @return null if accs is null, empty, or all elements are empty
	*/
	public static BankAccount1 lowestBankBalance(BankAccount1[] accs){
	if(accs == null)
		return null;
	if(accs.length == 0)
		return null;
	int indx = 0;
	int cntr = 0;
	double min = accs[0].getBalance();
	for(int i = 1; i < accs.length; i++){
		if(accs[i] != null)
			if( accs[i].getBalance() < min){
				min = accs[i].getBalance();
				indx = i;
				cntr++;
		}
	}
	if(cntr == 0)
		return null;
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
	 @return null if accs is null, empty, or all elements are null
	*/
	public static String longestName(BankAccount1[] accs){
	if(accs == null)
		return null;
	if(accs.length == 0)
		return null;
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
			return null;
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
	 @return 0.0 if accs is null, empty, or all elements are null
    */
	public static double averageCustomerBalance(Customer[] accs){
	if(accs == null)
		return 0.0;
	if(accs.length == 0)
		return 0.0;
	double bal = 0.0;
	int cntr = 0;
		for(Customer temp: accs){
			if(temp != null){
				bal += temp.getBalance();
				cntr++;
				}
			}
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
	 @return null if accs is null, empty or all elements are null
	*/
	public static Customer greatestCustomerBalance(Customer[] accs){
	if(accs == null)
		return null;
	if(accs.length == 0)
		return null;
	int cntr = 0;
	double bal = accs[0].getBalance();
		Customer ansr = accs[0];
			for(Customer temp: accs){
				if(temp != null && temp.getBalance() > bal){
					bal = temp.getBalance();
					ansr = temp;
					cntr++;
					}
				}
		if(cntr == 0)
			return null;
		return ansr;
		}
	}
