package Queue;

import java.util.LinkedList;

public class Queue_using_linkedlist_2 {

	public static void main(String[] args) {
		LinkedList<Integer> numbers= new LinkedList<Integer>();
		numbers.add(11);
		numbers.add(5);
		numbers.offer(25);
		numbers.offer(34);
		numbers.offer(96);
		numbers.offer(112);
		int accessedelement=numbers.peek();
		System.out.println("Access Element:"+accessedelement);
		int removedNumber1 = numbers.poll();
		System.out.println("Removed Elements:"+removedNumber1);
		int removedNumbe2 = numbers.poll();
		System.out.println("Removed Elements:"+removedNumbe2);
		System.out.println("updated Queue:"+numbers);
	}

}
