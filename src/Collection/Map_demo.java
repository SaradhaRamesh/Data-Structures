package Collection;
import java.util.*;
public class Map_demo {

	public static void main(String[] args) {
		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(12,"chaitanya");
		hmap.put(2,"Rahul");
		hmap.put(7,"Singh");
		hmap.put(49,"ajeet");
		hmap.put(3,"anuj");
		Set set =hmap.entrySet();
		Iterator iterator= set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry=(Map.Entry)iterator.next();
			System.out.print("Key is: "+mentry.getKey()+" & value is:");
			System.out.println(mentry.getValue());
		}
		String var = hmap.get(2);
		System.out.println("Value at index 2 is:"+var);
		hmap.remove(3);
		System.out.println("map value after removal :");
		Set set2 = hmap.entrySet();
		Iterator iterator2=set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry2=(Map.Entry)iterator2.next();
			System.out.print("Key is"+mentry2.getKey()+" & value is: ");
			System.out.println(mentry2.getValue());
		}
		
	}

}
