package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union_Intersection {

	public static void main(String[] args) {
		Integer []A= {1,2,3,4,5};
		Integer []B= {5,3,6,7,9};
		Set<Integer> set1=new HashSet<Integer>();
		//aslist --->put all elements at single time
		set1.addAll(Arrays.asList(A));
		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		Set<Integer> union_data = new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union of set1 & set 2 is: ");
		System.out.println(union_data);
		
		//Finding intersection of set1 & set2
				Set<Integer> intersection_data = new HashSet<Integer>(set1);
				intersection_data.retainAll(set2);
				System.out.print("Intersection of set1 & set 2 is: ");
				System.out.println(intersection_data);


	}

}
