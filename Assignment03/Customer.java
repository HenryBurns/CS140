package assignment03;

public class Customer {
    private String customerName; //name of customer
    private BankAccount account; //Bank Account of customer

    /**
     * constructer for Customer
     *
     * @param cName the name of the customer
     */
    public Customer(String cName){
        customerName = cName;
    }

    /**
     * constructer for customer
     * @param cName name of customer
     * @param bal balance of customer
     */
    public Customer(String cName, double bal){
        customerName = cName;
    account = new BankAccount(bal);
    }

    /**
     * gets bank acct
     * @return returns account
     */
    public BankAccount getAccount(){
        return account;
    }

    /**
     * gets customer name
     * @return customerName
     */
    public String getCustomerName(){
        return customerName;
    }

    /**
     * gets balance from bankacct
     * @return balance
     */
    public double getBalance(){
        return account.getBalance();
    }

    public void deposit(double amt){
        account.deposit(amt);
    }
    public void withdraw(double amt){
        account.withdraw(amt);
    }
    public String toString(){
        return customerName + " has " + account.getBalance()
                + " dollars.";
    }
    public boolean hasMoreFundsThan(Customer other){
        if( account.getBalance() > other.getBalance())
            return true;
        else
            return false;
    }
}
