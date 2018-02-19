package assignment03;
import java.util.Optional;
public class Question3{
	/**
	 Finds the average bank balance for all the bank accounts in the
	 given array.
	 @param accs the array of BankAccount1 elements to examine
	 @return an optional object containing the average of the balances of the accounts in accs
	 @return an empty optional Object if accs is null, empty, or all elements are null
	*/	
	public static Optional<Double> averageBankBalance(BankAccount1[] accs){
		if(accs == null)
			return Optional.empty();
		if(accs.length == 0)
			return Optional.empty();
		double bal = 0;
		int cntr = 0;
		for (BankAccount1 temp : accs){
			if(temp != null){
				bal+= temp.getBalance();
				cntr++;
				}
			}
		if(cntr == 0)
			return Optional.empty();
		bal /= accs.length;
		return Optional.of(bal);
	}
	/**
	 Find the account in the array parameter that has the small
	 the smallest balance and in the case of a tie, return the
	 first such account. 
	 @param accs the array of BankAccount1 elements to examine
	 @return an optional object containing the bank account in the array accs that has the
	 smallest balance. If there is more than one, then return the 
	 first of them.
	 @return an empty Optional object if accs is null, empty, or all elements are null
	*/
	public static Optional<BankAccount1> lowestBankBalance(BankAccount1[] accs){
	if(accs == null)
		return Optional.empty();
	if(accs.length == 0)
		return Optional.empty();
	int indx = 0;
	int cntr = 0;
	double min = Double.MAX_VALUE;
	 for(int i = 0; i < accs.length; i++){
		if(accs[i] != null)
			if( accs[i].getBalance() < min){
				min = accs[i].getBalance();
				indx = i;
				cntr++;
		}
	}
	if(cntr == 0)
		return Optional.empty();
	return Optional.of(accs[indx]);
	}
	/**
     In the array accs find the names of the customers and
	 return the longest name. If at least two names have the same
	 length, return the last one in the array of greatest length. 
	 @param accs the array of BankAccount1 elements to examine
	 @return an Optional object containing the longest name of all the customerNames in
	 the customers in accs. If there is a tie for the length,
	 return the LAST name.
	 @return an empty Optional object if accs is null, empty, or all elements are null
	*/
	public static Optional<String> longestName(BankAccount1[] accs){
	if(accs == null)
		return Optional.empty();
	if(accs.length == 0)
		return Optional.empty();
	int longestlength = 0;
	String name = "";
	int cntr = 0;
		for( BankAccount1 temp: accs){
			if(temp != null)
				if (temp.getCustomerName().length() >= longestlength){
					longestlength = temp.getCustomerName().length();
					name = temp.getCustomerName();
					cntr++;
				}
			}
		if(cntr == 0)
			return Optional.empty();
	return Optional.of(name); }
	 /** Finds the average bank balance for all the bank accounts of the Customers in the given array.
	 @param accs the array of Customer elements to examine
	 @return an object containing the average of the balances of the customer accounts
	 of the customers in accs
	 @return an empty Optional object if accs is null, empty, or all elements are null
	 */
	 public static Optional<Double> averageCustomerBalance(Customer[] accs){
		 if(accs == null)
			 return Optional.empty();
		 if(accs.length == 0)
			 return Optional.empty();
		 double bal = 0.0;
		int cntr = 0;
		for(Customer temp: accs){
			if(temp != null){
				bal += temp.getBalance();
				cntr++;
				}
			}
		bal /= cntr;
		return Optional.of(bal);
		}
	/**
	 Find the Customer in the array parameter that has the largest
	 balance in their account field and in the case of a tie, return the
	 LAST such account. 
	 @param accs the array of Customer elements to examine
	 @return an Optional Object containingthe Customer with the largest bank account in the array accs. 
	 If there is more than one, then return the last of them.
	 @return an empty Optional object if accs is null, empty or all elements are null
	*/
	public static Optional<Customer> greatestCustomerBalance(Customer[] accs){
	if(accs == null)
		return Optional.empty();
	if(accs.length == 0)
		return Optional.empty();
	int cntr = 0;
	double bal = -Double.MAX_VALUE;
		Customer ansr = accs[0];
			for(Customer temp: accs){
				if(temp != null && temp.getBalance() > bal){
					bal = temp.getBalance();
					ansr = temp;
					cntr++;
					}
				}
		if(cntr == 0)
			return Optional.empty();
		return Optional.of(ansr);
		}
	}
