package Stack;

import java.util.*;

public class Finding_element_position_SearchMethod {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();
		System.out.println(stk.isEmpty());
		stk.push("Mca book");
		stk.push("Hp");
		stk.push("Dell");
		stk.push("Dell1");
		System.out.println("Stack:"+stk);
		//take the position from top
		int location=stk.search("Hp");
		System.out.println("location of Hp "+location);
		System.out.println(stk.search("test"));
		System.out.println("Size of the element "+stk.size());
		Iterator iterator=stk.iterator();
		while(iterator.hasNext())
		{
			Object values=iterator.next();
			System.out.println(values);
		}
		//for java 8 version
		System.out.println("\nFor Each:");
	stk.forEach(n-> System.out.println(n));
	//for printing in reverse order
	ListIterator<String>ListIterator=stk.listIterator(stk.size());
	System.out.println("\nIteration over the stack from top to bottom:");
	while(ListIterator.hasPrevious()) {
		String avg=ListIterator.previous();
		System.out.println(avg);
	}
	}

}
