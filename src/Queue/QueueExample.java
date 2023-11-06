package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer>numbers=new LinkedList<>();
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue:"+numbers);
		int accessedNumber=numbers.peek();
		System.out.println("Access Element:"+accessedNumber);
		//Remove elemnts from the queue 
				int removedNumber = numbers.poll();
				System.out.println("Removed Elements:"+removedNumber);
				
				System.out.println("Updated queue:"+numbers);
	}

}
