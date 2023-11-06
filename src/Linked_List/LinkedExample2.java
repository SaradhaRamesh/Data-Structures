package Linked_List;

import java.util.*;


public class LinkedExample2 {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<String>();
		LinkedList<String>llistobj= new LinkedList<String>();
		ArrayList<String>arraylist= new ArrayList<String>();
		arraylist.add("string1");
		arraylist.add("string2");
		arraylist.add("string3");
		llistobj.addAll(arraylist);//arrayList to linkedList
		System.out.println(llistobj);
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("TECH Mahindra");
		list.add(2,"Zoho");
		list.set(1,"Imarticus");
		list.add("Imarticus");
		list.forEach(System.out::println);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.lastIndexOf("Imarticus"));
		list.poll();
		list.pollFirst();
		list.pollLast();
		list.forEach(System.out::println);
		}
}
