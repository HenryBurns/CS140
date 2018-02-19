package assignment04;
public class Tester{
	public static void main(String[] args){
	Elevator e = new Elevator(20, 10, 10);
	int test1 = 0;
	int test2 = 10;
	int test3 = 19;
	String tst1 = "B10";
	String tst2 = "G";
	String tst3 = "10";
	System.out.println(e.getFloorName(test1)+ " expected to be B10");
	System.out.println(e.getFloorName(test2)+ " expected to be G");
	System.out.println(e.getFloorName(test3)+ " expected to be 10");
	System.out.println(e.getFloorIndex(tst1)+ " expected to be 0");
	System.out.println(e.getFloorIndex(tst2)+ " expected to be 10");
	System.out.println(e.getFloorIndex(tst3)+ " expected to be 19");
	}
}
