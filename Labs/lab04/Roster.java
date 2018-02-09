package lab04;
import java.util.ArrayList;
import java.util.List;
public class Roster{
	private List<Student> classRoster = new ArrayList<Student>();
	public List<Student> getClassRoster(){
		return classRoster;
	}
	public void addStudent(Student s){
		classRoster.add(s);
	}
	public void dropStudent(String name){
		for(int i = 0; i < classRoster.size(); i++)
			if(classRoster.get(i).getName().equals(name))
				classRoster.remove(i);
	}
	public String toString(){
		String s = "[";
		for(Student temp : classRoster)
			s += temp.getName()+ ", ";
		return (s + "]");
	}
	public void sortByID(){
		for(int i = 0; i < classRoster.size(); i++)
			for(int j = 1; j < (classRoster.size() -i); j++){
				if(classRoster.get(j-1).getID() > classRoster.get(j).getID()){
					Student temp = classRoster.get(j-1);
					classRoster.set(j-1,classRoster.get(j));
					classRoster.set(j,temp);
				}
			}
	}
}
