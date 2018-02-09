package lab03;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayFromFile{
	private int[] array;
	public ArrayFromFile(String filename) {
		// try-with-resources block (sc is the resource we are trying to use)
		try (Scanner sc = new Scanner(new File(filename))) {
			array = new int[sc.nextInt()];
			for(int i = 0; i < array.length; i++)
				array[i] = sc.nextInt();
		} catch (Exception e) {
			array = new int[0];
		}
	}
	public int[] getArray(){
		return array;
			}
		
	public String toString(){
		return Arrays.toString(array);
	}
	public void removeOddElements(){
		int cntr = 0;
		for(int num: array)
			if (num%2 == 0)
				cntr++;
		int[] temp = new int[cntr];
		int index = 0;
		for(int value: array){
			if(value%2 == 0){
				temp[index] = value;
				index++;
			}
		}
		array =temp;
	}
}
