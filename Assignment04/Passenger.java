package assignment04;
public class Passenger{
	private String destinationFloor;
	private int id;
	private static int nextId = 0;
	public Passenger(String destFL, Elevator elev){
		if(destFL == null) {
			throw new IllegalArgumentException("Cannot give" +
			" null arguments");
		}
		int dest = elev.getFloorIndex(destFL);
		if ( dest < 0 )
			dest = 0;
		destinationFloor = elev.getFloorName(dest);
		id = ++nextId;
	}
	public String getDestinationFloor(){
		return destinationFloor;
	}
	public int getID(){
		return id;
	}
	public String toString(){
		return "" + id;
	}

}
