package Stack;

import java.util.Stack;

public class Printing_top_element_stack {

	public static void main(String[] args) {
		Stack<String>stk= new Stack<>();
		stk.push("Apple");
		stk.push("Grapes");
		stk.push("Mango");
		stk.push("Orange");
		System.out.println("Stack:"+stk);
		//Access top element
		String fruits=stk.peek();
		System.out.println("Element at top:"+fruits);

	}

}
