package lab02;
public class race{
	public static void main(String[] args) {
		Car[] race = new Car[3];
		race[0] = new Car("Little Red Wagon", 2);
		race[1] = new Car("Chevy", 1);
		race[2] = new Car("BMW", 3);
		for(int i = 0; i < race.length; i++) {
			System.out.println("car type: " + race[i].getCarType());
		}
		for( Car test : race) {
			System.out.println("car speed: " + test.getTopSpeed());
		}
		System.out.println("Expected avg top speed: " + 2.0);
		System.out.println("avg top speed: " + averageTopSpeed(race));
		System.out.println("Expected avg fastest speed: " + 3.0);
		System.out.println("fastest speed: " + fastestSpeed(race));
	}
	public static double averageTopSpeed(Car[] cars) {
		double avg = 0.0;
		for(int i = 0; i < cars.length; i++) {
			avg += cars[i].getTopSpeed();
		}
		avg /= cars.length;
		return avg;
	}
	public static double fastestSpeed(Car[] cars){
		double max = cars[0].getTopSpeed();
		for(int i = 0; i < cars.length; i++) {
			if (cars[i].getTopSpeed() > max)
				max = cars[i].getTopSpeed();
			}
		return max;
	}
}
