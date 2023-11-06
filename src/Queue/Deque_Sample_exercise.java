package Queue;

import java.util.*;

public class Deque_Sample_exercise {

	public static void main(String[] args) {
		Deque<String>numbers = new ArrayDeque<>();
		//add elemets to the deque 
		numbers.offer("one");
		numbers.offer("two");
		numbers.offer("three");
		numbers.offer("four");
		numbers.offer("five");
		numbers.offerFirst("red");
		numbers.offerLast("blue");
		System.out.println("Deque: "+numbers);
		
		//Access elemnts of the deque 
		String peekElement = numbers.peek();
		System.out.println("First element: "+peekElement);
		
		
		//Remove elements from the deque 
		String removedNumber1 = numbers.pollFirst();	
		System.out.println("Removed element: "+removedNumber1);
		String removedNumber2 = numbers.pollLast();	
		System.out.println("Removed element: "+removedNumber2);
		System.out.println("Deque: "+numbers);
		numbers.remove("three");
		System.out.println("Deque: "+numbers);
		System.out.println("\nArrayDeque in reverse order:");
		//using descending iterator()
		Iterator<String> desIte = numbers.descendingIterator();
		while(desIte.hasNext()) {
			System.out.print(desIte.next());
			System.out.print(" ");
		}
	}

}
