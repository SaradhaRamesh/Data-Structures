package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Iterator_in_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<String>animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("\nIterator");
		Iterator<String>it=animals.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.print(",");
		}
		System.out.println ("\nArrayDeque in reverse order:");
		Iterator<String>desIterate=animals.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(",");
		}
	}

}
