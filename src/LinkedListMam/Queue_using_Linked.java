package LinkedListMam;

import java.util.*;

public class Queue_using_Linked {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		list.add("Steve");
		list.add("carl");
		list.add("Raj");
		list.addFirst("Negan");
		list.addLast("Rick");
		list.add(2,"sara");
		list.removeFirst();
		list.removeLast();
		list.remove(2);
		Iterator<String>iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	

}
