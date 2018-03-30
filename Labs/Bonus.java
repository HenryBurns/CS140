package lab09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bonus {
	
	public static void main(String[] args) {
		// Up to you how you use this main method, feel free to change it
		Comparator<String> awesomeComp = (i, j) -> j.length() - i.length(); // lambda expression
		BinarySearchTree<String> tree = new BinarySearchTree<>(awesomeComp);
		tree.insert("Hi");
		tree.insert("Hello");
		tree.insert("<3 Lander");
		tree.insert("kablewey");
		tree.insert("a");
		tree.insert("smurfs");
		tree.insert("purple");
		tree.prettyPrint();
	}
}

