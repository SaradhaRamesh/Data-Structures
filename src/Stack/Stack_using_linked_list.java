package Stack;

import java.util.*;
class  Node{
	protected int data;
	protected Node link;
	public Node() {
		link=null;
		data=0;
	}
	public Node(int d,Node n) {
		data=d;
		link=n;
	}
	public void setLink(Node n) {
		link=n;
	}
	public void setData(int d) {
		data=d;
	}
	public Node getLink() {
		return link;
	}
	public int getData() {
		return data;
	}
}
class linkedStack{
	protected Node top;
	protected int size;
	public linkedStack() {
		top=null;
		size=0;
	}
	public boolean isEmpty() {
		return top==null;
	}
	public int getSize() {
		return size;
	}
	public void push(int data) {
		Node nptr = new Node(data,null);
		if(top==null)
			top=nptr;
		else {
			nptr.setLink(top);
			top=nptr;
		
	}
		size++;
		}
	public int pop() {
		if(isEmpty())
			throw new NoSuchElementException("underflow Exception");
		return top.getData();
	}
	public void display() {
		System.out.print("\nStack=");
	}
	
}
	public class Stack_using_linked_list {
	    public static void main(String[] args) {
	    	Scanner s= new Scanner(System.in);
	    	Stack_using_linked_list ls=new Stack_using_linked_list();
	    	System.out
	       	    }
	}
