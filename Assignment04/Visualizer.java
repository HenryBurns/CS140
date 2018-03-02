package assignment04;
import java.util.*;
public class Visualizer{
	public static void main(String[] args){
		Elevator elev = new Elevator(15,5,10);
		Line line = new Line("G", elev);
		List<Passenger> pass = line.getLine();
		Line line1 = new Line("6", elev);
		List<Passenger> pass1 = line1.getLine();
		Line line2 = new Line("B4", elev);
		List<Passenger> pass2 = line2.getLine();
		for(int i = 0; i < 6; i++)
			pass.add(new Passenger("9", elev));
		for(int i = 0; i <3 ; i++)
			pass.add(new Passenger("3",elev));
		for(int i = 0 ;i <3 ; i++)
			pass.add(new Passenger("B5", elev));
		for(int i = 0; i < 2; i++)
			pass2.add(new Passenger("G", elev));
		for(int i = 0; i < 2; i++)
			pass1.add(new Passenger("5", elev));
		for(int i = 0; i < 1; i++)
			pass2.add(new Passenger("B2", elev));
		for(int i = 0 ;i <3 ; i++)
			pass1.add(new Passenger("7", elev));
		for(int i = 0 ;i <3 ; i++)
			pass2.add(new Passenger("B1", elev));
		showElev(elev); 
		elev.getLines().get(elev.getCurrentFloor()).loadElevator(); //NEW
		for(int i = 0; i < 35; i++) {
			showElev(elev);
			elev.move();
		}
	}
	public static void showElev(Elevator e){
		String temp = "";
		for(int i = e.getNumFloors() -1; i >-1; i--){
			Line line = e.getLines().get(i);
			if( line != null && line.getLine().size() != 0)
				temp = line.getLine().toString();
			else
				temp = "";
			if( i == e.getCurrentFloor())
				System.out.println(e.getFloorName(i) + ">\t\t" + e.getNumOccupants() +"\t\t" + temp);
			else
				System.out.println(e.getFloorName(i) + "\t\t0\t\t" + temp);
			}
		System.out.println("+++++++++++++++++++++");
	}
}
