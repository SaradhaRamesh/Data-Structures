package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<String>();
		q.add("Rick");
		q.add("Maggie");
		q.add("GGlen");
		q.add("Negan");
		q.add("Daryl");
		System.out.println("Elements in queue:"+q);
		//remove the first element
		System.out.println("Removed element:"+q.remove());
		//return the head of the queue(first element of queue)
		System.out.println("Head:"+q.element());
		//remove and return the head.if queue is empty it will return null
		System.out.println("poll():"+q.poll());
		//return the first element.if queue is empty it will return null
		System.out.println("peek():"+q.peek());
		System.out.println("Elements in queue:"+q);
	}

}
