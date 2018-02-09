package lab04;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ArrayListPractice{
	public static int RemoveAll(List<Integer> arr, int e){
		int cntr = 0;
		if( arr == null)
			throw new IllegalArgumentException("the arraylist should not be null");
		Iterator<Integer> iter = arr.iterator();
		while(iter.hasNext()){
		    if((Integer) iter.next() == e) 
				iter.remove();
				cntr++;
	        }
		return cntr;
		}
	public static boolean isEqual(List<Integer> alpha, List<Integer> other) {
		if(alpha == null || other == null)
			throw new IllegalArgumentException("neither input should be null");
		if(alpha.size() != other.size())
			return false;
		if(alpha.size() == 0)
			return true;
		for(int i = 0; i < alpha.size(); i++)
			if(alpha.get(i) != other.get(i))
				return false;
		return true;
	}
	public static void appendArray(List<Integer> arrList, int[] arr){
			if(arr == null || arrList == null)
				throw new IllegalArgumentException("Input should not be null");
		for(int i = 0; i < arr.length; i++)
			arrList.add(arr[i]);
		
	}
	public static ArrayList<Integer> sumElementWise(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
		if (arr1.size() < arr2.size()){
			for(int i = 0; i < arr1.size(); i++)
				arr2.add((arr2.get(i) + arr1.get(i)));
		return arr2;}
		else{
			for(int i = 0; i < arr1.size(); i++)
				arr1.add((arr2.get(i) + arr1.get(i)));
		return arr1;}
		}
	}
