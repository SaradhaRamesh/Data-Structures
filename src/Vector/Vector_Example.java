package Vector;

import java.util.*;

public class Vector_Example {

	public static void main(String[] args) {
		Vector<String>vec = new Vector<String>(2);
		vec.addElement("Apple");
		vec.addElement("orange");
		vec.addElement("mango");
		vec.addElement("fig");
		System.out.println("size is :"+vec.size());
		System.out.println("Default capacity increment is:"+vec.capacity());
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		System.out.println("size after addition :"+vec.size());
		System.out.println("capacity after increment is :"+vec.capacity());
		Enumeration en = vec.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
			System.out.print(en.nextElement());
	}

}
