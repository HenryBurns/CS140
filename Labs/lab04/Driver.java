package lab04;
import java.util.ArrayList;
import java.util.List;
public class Driver{
	public static void main(String[] args){
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();
		int[] arr = new int[2];
		arr[0] = 3;
		arr[1] = 3;
		int[] nll = null;
		List<Integer> nllList = null;
		try{
			if(ArrayListPractice.isEqual(first, second))
				System.out.println("The ArrayLists are equal");
			else 
				System.out.println("The ArrayLists are not equal");
			ArrayListPractice.appendArray(first, arr);
			for(int i = 0; i < first.size(); i++)
				System.out.print( first.get(i) + " ");
			System.out.println();
			if(ArrayListPractice.isEqual(first, second))
				System.out.println("The ArrayLists are equal");
			else 
				System.out.println("The ArrayLists are not equal");

			System.out.println(ArrayListPractice.RemoveAll(first, 3) + " should print 2");
			ArrayListPractice.appendArray(first,nll);
			} catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		try{
			ArrayListPractice.isEqual(first,nllList);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			}
		try{
			ArrayListPractice.RemoveAll(nllList, 1);
		} catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			}
		
		}
}
