package Stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_sample {
		static void reversePrint(Stack<Integer> s) {
			if(s.isEmpty())
				return;
			int x=s.peek();
			s.pop();
			System.out.print(x+" ");
			reversePrint(s);
			s.push(x);
		}
	public static void main(String[] args) {
	Stack<Integer>stk=new Stack<>();
	stk.push(24);
	stk.push(5);
	stk.push(11);
	stk.push(36);
	stk.push(65);
	stk.pop();
	Iterator<Integer>iterator=stk.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next());
		System.out.print(" ");
	}
	System.out.println(" ");
	reversePrint(stk);
/*	ListIterator<Integer>ListIterator=stk.listIterator(stk.size());
	while(ListIterator.hasPrevious()) {
		int avg=ListIterator.previous();
		System.out.print(avg+" ");
	}*/
	
	}

}
