package Queue;

import java.util.*;

public class RemoveFirst_RemoveLast {

	public static void main(String[] args) {
		ArrayDeque<String>animals=new ArrayDeque<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Horse");
		animals.add("Hen");
		animals.add("Tiger");
		animals.add("Lion");
		System.out.println("ArrayDeque:"+animals);
		String element=animals.remove();
		System.out.println("Removed Element:"+element);
		System.out.println("New Array Deque:"+animals);
		animals.remove("Cow");
		System.out.println("New Array Deque:"+animals);
		//System.out.println("Removed specifiedelement:");
		String firstElement=animals.removeFirst();
		System.out.println("Removed firstElement:"+firstElement);
		String lastElement=animals.removeLast();
		System.out.println("Removed lastElement:"+lastElement);
		animals.clear();
		System.out.println("ArrayDeque:"+animals);
		
	}

}
