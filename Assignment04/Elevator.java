package assignment04;
import java.util.*;
public class Elevator{
	private int currentFloor;
	private List<Passenger> occupants = new ArrayList<Passenger>();
	private List<Line> lines = new ArrayList<Line>();
	private Direction currentDir = Direction.UP;
	private int capacity;
	private int numFloors;
	private int groundFloor;

	public Elevator(int nf, int gf, int cap){
		capacity = cap;
		numFloors = nf;
		groundFloor = gf;
		currentFloor = gf;
		for(int i = 0; i < numFloors; i++)
			lines.add(null);
	}
	public Direction getCurrentDir(){
		return currentDir;
	}
	public int getCurrentFloor(){
		return currentFloor;
	}
	public int getNumOccupants(){
		return occupants.size();
	}
	public List<Line> getLines(){
		return lines;
	}
	public int getNumFloors(){
		return numFloors;
	}
	public String getFloorName(int index){
	if(index < 0 || index >= numFloors) {
		throw new IllegalArgumentException("Illegal floor number");
		}
	if(index < groundFloor)
		return "B" + (groundFloor - index);
	else if (index > groundFloor)
		return "" + (index + 1 -  groundFloor);
	else 
		return"G";
	}
	/**
	determines index of floor based on the string of the floor
	@param floor a String containing the name of the floor
	@return the index of the floor given in String floor
	*/
	public int getFloorIndex(String floor){
		if (floor.equals("G"))
			return groundFloor;
		else if (floor.substring(0,1).equals("B"))
			return groundFloor - Integer.parseInt(floor.substring(1));
		else
			return (Integer.parseInt(floor) -1 + groundFloor);
	}
	public boolean addOccupants(Passenger p){
		if(occupants.size() < capacity)
			occupants.add(p);
		else
			return false;
		return true;
	}
	public void addLine(String flr,Line ln){
		lines.set(getFloorIndex(flr), ln);
	}
	/**
	 Moves the elevator up and down floors, dropping off occupants to their target floors
	 switching direction when its hits either the top or the bottom. Also picks up people
	 from their floors.
	*/
	public void move(){
		if (currentDir == Direction.UP){
			if(currentFloor < numFloors -1)
				currentFloor++;
			
			else {
				currentDir = Direction.DOWN;
				currentFloor--;
			}
		}
		if (currentDir == Direction.DOWN){
			if(currentFloor > 0)
				currentFloor--;
		
			else{
				currentDir = Direction.UP;
				currentFloor++;
			}
		}
		Iterator iter = occupants.iterator();
		while(iter.hasNext()){
			Passenger p = (Passenger) iter.next();
			if(p!= null && getFloorIndex(p.getDestinationFloor()) == currentFloor)
				iter.remove();
		}
		for(Line temp: lines)
			if(temp != null && temp.getFloor().equals(getFloorName(currentFloor)) && temp.getLine() != null)
				temp.loadElevator();
	}
}
