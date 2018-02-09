package assignment01;
public class Driver2 {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane Smith", 100.0);
        Customer dude = new Customer("dude guy", 0);
        System.out.println(cust);
        System.out.println(cust.hasMoreFundsThan(dude));
        System.out.println(dude.hasMoreFundsThan(cust));
    }
}