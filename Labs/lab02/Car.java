package lab02;
public class Car {
	private String carType;
	private double topSpeed;
	public Car (String aCarType, double aTopSpeed) {
		carType = aCarType;
		topSpeed = aTopSpeed;
	}
	public String getCarType(){
		return carType;
	}
	public double getTopSpeed(){
		return topSpeed;
	}
}
