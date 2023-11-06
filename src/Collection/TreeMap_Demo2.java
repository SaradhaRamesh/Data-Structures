package Collection;

import java.util.*;

public class TreeMap_Demo2 {

	public static void main(String[] args) {
		TreeMap<String,Integer>t = new TreeMap<String,Integer>();
		t.put("roy", new Integer(90));
		t.put("Shelly", new Integer(80));
		t.put("keats", new Integer(95));
		t.put("charles", new Integer(38));
		Set s= t.entrySet();
		Iterator i=s.iterator();
		System.out.println("the following are marks: ");
		System.out.println("names\t\tmarks");
		while(i.hasNext()) {
			Map.Entry e = (Map.Entry)i.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
			}
		if(t.containsKey("roy"))
			System.out.println("Map contains the entry'roy");
		else
			System.out.println("Map doesnot contains the entry'roy");
		t.put("macbetch", new Integer(58));
		i=s.iterator();
		System.out.println("tree map after modified is: ");
		System.out.println("name\t\tmarks");
	}

}
