package assignment01;

public class Driver4 {
    public static void main(String[] args){
        Name Henry = new Name("Henry");
        Name Alex = new Name("Alex");
        Henry.befriend(Alex);
        System.out.println(Henry.getFriendCount());
        System.out.println(Henry.getFriendNames());
        Henry.unfriend(Alex);
        System.out.println(Henry.getFriendNames());

    }
}
