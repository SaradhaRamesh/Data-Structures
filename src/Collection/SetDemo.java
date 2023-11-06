package Collection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
	int count[]= {34,22,10,60,30,22};
	Set<Integer>set= new HashSet<Integer>();
	for(int i=0;i<count.length;i++) {
		set.add(count[i]);
		}
	System.out.println(set);
	TreeSet<Integer>SortedSet= new TreeSet<Integer>(set);
	System.out.println("The sorted list is:");
	System.out.println(SortedSet);
	System.out.println("The first element of the list is:"+SortedSet.first());
	System.out.println("The last element of the list is:"+SortedSet.last());
	}

}
