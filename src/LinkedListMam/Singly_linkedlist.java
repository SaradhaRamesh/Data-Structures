package LinkedListMam;
//import java.util.*;
public class Singly_linkedlist {
	class Node{
		int data;//data type can be anything
		Node next;//Node --->class Name
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		public Node head= null;
		public Node tail= null;
		void addNode(int data) {
			Node newNode= new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
						}
		}
			public void display() {
				Node current = head;
				if(head==null) {
					System.out.println("List is empty: ");
				}
				else {	System.out.println("Singly linked list are: ");
				while(current!=null) {//only while loop will work
					System.out.println(current.data+" ");
					current=current.next;
				}
				}
				
			}
			public static void main(String[] args) {
				Singly_linkedlist sll= new Singly_linkedlist();
				sll.addNode(10);
				sll.addNode(5);
				sll.addNode(3);
				sll.display();
			}
		
	}



