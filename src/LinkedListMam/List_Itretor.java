package LinkedListMam;

import java.util.*;

public class List_Itretor {

	public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("c");
	a1.add("a");
	a1.add("e");
	a1.add("b");
	a1.add("d");
	a1.add("f");
	System.out.print("original content of a1:");
	Iterator itr = a1.iterator();
	while(itr.hasNext()) {
		Object element = itr.next();
		System.out.print(element+" ");
	}
	System.out.println();
	ListIterator litr = a1.listIterator();
	while(litr.hasNext())
	{
		Object element= litr.next();
		litr.set(element+"+");
	}
	System.out.print("modified content of a1:");
	itr = a1.iterator();
	while(itr.hasNext())
	{
		Object element = itr.next();
		System.out.print(element+" ");
	}
	System.out.println();
	
	System.out.print("modified list backward");
	while(litr.hasPrevious())
	{
		Object element = litr.previous();
		System.out.print(element+" ");
	}
	System.out.println();
	}
	

}
