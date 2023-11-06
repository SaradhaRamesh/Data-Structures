package Queue;

import java.util.*;

public class Array_Dequeue {

	public static void main(String[] args) {
		Deque<Integer>numbers = new ArrayDeque<>();
		//add elemets to the deque 
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque: "+numbers);
		
		//Access elemnts of the deque 
		int firstElement = numbers.peekFirst();
		System.out.println("First element: "+firstElement);
		
		int lastElement = numbers.peekLast();
		System.out.println("Last Element: "+lastElement);
		
		//Remove elements from the deque 
		int removedNumber1 = numbers.pollFirst();
		System.out.println("Remove First Element:"+removedNumber1);
		int removedNumber2 = numbers.pollLast();
		System.out.println("Remove Last Element:"+removedNumber2);
		System.out.println("Updated Dequeue:"+numbers);
		
		
		
	}

}
