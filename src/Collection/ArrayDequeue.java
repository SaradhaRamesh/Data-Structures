package Collection;

import java.util.*;

public class ArrayDequeue {

	public static void main(String[] args) {
		Deque<String>dq= new ArrayDeque<String>();
		dq.add("Glenn");
		dq.add("Negan");
		dq.addFirst("Rick");
		dq.addLast("Maggie");
		dq.add("Daryl");
		System.out.println("Elements in queue:"+dq);
		System.out.println("Removed Elements in queue:"+dq.removeLast());
		System.out.println("Head:"+dq.element());
		System.out.println("poll():"+dq.pollLast());
		//return the first element.if queue is empty it will return null
		System.out.println("peek():"+dq.peek());
		System.out.println("Elements in queue:"+dq);
		
	}

}
