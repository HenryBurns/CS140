package lab04;
import java.util.ArrayList;
import java.util.List;
public class RosterTester{
	public static void main(String[] args){
		Roster studs = new Roster();
		Student Chad = new Student(44,"Chad");
		Student Dude = new Student(12,"Dude");
		Student Bobe = new Student(4,"Bobe");
		Student Alex = new Student(27,"Alex");
		studs.addStudent(Chad);
		studs.addStudent(Bobe);
		studs.addStudent(Dude);
		studs.addStudent(Alex);
		System.out.println(studs);
		studs.dropStudent("Dude");
		System.out.println(studs);
		studs.sortByID();
		System.out.println(studs);
		List<Student> testing = new ArrayList<Student>();
		testing = studs.getClassRoster();
		for(Student s : testing)
			System.out.println("Name: " + s.getName() + " ID: " + s.getID());
	}
}
