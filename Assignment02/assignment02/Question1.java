package assignment02;
public class Question1{

	public static double averageBankBalance(BankAccount1[] accs){
		double bal = 0;
		for (BankAccount1 temp : accs){
			bal+= temp.getBalance();
			}
		bal /= accs.length;
		return bal;
	}
	
	public static BankAccount1 lowestBankBalance(BankAccount1[] accs){
	int indx = 0;
	double min = accs[0].getBalance();
	for(int i = 1; i < accs.length; i++){
		if( accs[i].getBalance() < min){
			min = accs[i].getBalance();
			indx = i;
		}
	}
	return accs[indx];
	}

	public static String longestName(BankAccount1[] accs){
		int longestlength = 0;
		String name = "";
		for( BankAccount1 temp: accs){
			if (temp.getCustomerName().length() > longestlength)
				longestlength = temp.getCustomerName().length();
				name = temp.getCustomerName();
			}
		return name;
		}

	public static double averageCustomerBalance(Customer[] accs){
		double bal = 0.0;
		for(Customer temp: accs){
			bal += temp.getBalance();
			}
		bal /= accs.length;
		return bal;
		}
	public static Customer greatestCustomerBalance(Customer[] accs){
		double bal = accs[0].getBalance();
		Customer ansr = accs[0];
			for(Customer temp: accs){
				if(temp.getBalance() > bal){
					bal = temp.getBalance();
					ansr = temp;
					}
				}
		return ansr;
		}
	}
