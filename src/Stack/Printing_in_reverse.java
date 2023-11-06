package Stack;

import java.util.*;

public class Printing_in_reverse {
static void reversePrint(Stack<Integer>st) {
	if(st.isEmpty())
		return;
	int x=st.peek();
	st.pop();
	
	System.out.print(st);
	st.push(x);
}
static void dispaly(Stack<Integer>st) {
	System.out.println("Stack:"+st);
}
	public static void main(String[] args) {
		  char ch='y';
		  Scanner s= new Scanner(System.in);
		  Stack<Integer>st=new Stack<Integer>();
	
	        do {
	            System.out.println("Linked Stack Operations");
	            System.out.println("1. push");
	            System.out.println("2. pop");
	            System.out.println("3. peek");
	            System.out.println("4. check empty");
	            System.out.println("5. size");

	           
	            System.out.print("Enter your choice: ");
	            int option=s.nextInt();

	            switch (option) {
	                case 1:
	                    System.out.print("Enter integer element to push: ");
	                    int element = s.nextInt();
	                    st.push(element);
	                 // st.display();
	                    break;
	                case 2:
	                    try {
	                        int poppedElement = st.pop();
	                        System.out.println("Popped Element = " + poppedElement);
	                      // st.display();
	                    } catch (IllegalStateException e) {
	                        System.out.println("Error: Underflow Exception");
	                    }
	                    break;
	                case 3:
	                    try {
	                        int peekedElement = st.peek();
	                        System.out.println("Peek Element = " + peekedElement);
	                       // st.display();
	                    } catch (IllegalStateException e) {
	                        System.out.println("Error: Underflow Exception");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Empty status = " + st.isEmpty());
	                   // st.display();
	                    break;
	                case 5:
	                    System.out.println("Size = " + st.size());
	                   // st.display();
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }

	            System.out.print("Do you want to continue (Type y or n): ");
	            ch = s.next().charAt(0);
	        } while (ch == 'y' || ch == 'Y');



	}

}
