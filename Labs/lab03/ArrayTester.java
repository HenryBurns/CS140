package lab03;
import java.util.Arrays;
public class ArrayTester{
	public static void main(String[] args){
		if (args.length == 1){
			ArrayFromFile fileArray = new ArrayFromFile(args[0]);
			System.out.println(fileArray);
			fileArray.removeOddElements();
			System.out.println("Expected: 20, 8, 46");
			System.out.println(fileArray);
			int array[] = new int[5];
			System.out.println(Arrays.toString(array));
			int n = 0;
			for (int i : array) {
			i = n;
			n++; // shorthand to increment by 1
			}
			for( int i : array)
				System.out.println(i);
			String[] arr = { "Hello", "Goodbye", "Farewell", "Hi Shawn"};
			for( String temp : arr)
				System.out.println(temp + " " + temp.length());
		} 
		else
			throw new IllegalArgumentException("Incorrect number of arguments passed");
		}
	}
			
