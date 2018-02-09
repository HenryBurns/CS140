package lab03;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class SumTest{	
	public void experiment (File file) {
		try(Scanner input = new Scanner(new FileReader(file)))  {
			int sum = 0;
			while(input.hasNextInt()){
					sum += input.nextInt();
					assert(sum >= 0);
				} System.out.println(sum); 
		} catch(InputMismatchException ex){
			System.out.println(ex + "--not a number from nextInt()");
}	catch(FileNotFoundException ex){
			System.out.println("File" + file.getName() + " is not found");
	}
}
public static void main(String[] args) {
		new SumTest().experiment(new File(args[0]));
	}
}
