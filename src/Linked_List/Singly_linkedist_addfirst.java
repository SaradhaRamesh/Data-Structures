package Linked_List;

import Linked_List.Singly_linkedlist.Node;

public class Singly_linkedist_addfirst {

	
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
			void addFirst(int data) {
				Node newNode= new Node(data);
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					newNode.next=head;
					head=newNode;
				}
			}
			void addLast(int data) {
				Node newNode= new Node(data);
				Node current=head;
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					/*while(current.next!=null) {
						current=current.next;
					}
					current.next=newNode;*/
					}
					tail.next=newNode;
					tail=newNode;
			}
			void addBetween(int pos,int data) {
				Node newNode= new Node(data);
				Node current=head;
				if(head==null) {
					head=newNode;
					tail=newNode;
				}
				else {
					while(current.data!=pos) {
						current=current.next;
					}
					newNode.next=current.next;
					current.next=newNode;
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
					Singly_linkedist_addfirst sll= new Singly_linkedist_addfirst();
					sll.addNode(10);
					sll.addLast(200);
					sll.addNode(5);
					sll.addNode(3);
					//sll.addLast(200);
					//sll.addFirst(100);
					sll.addNode(21);
					sll.addNode(25);
					//sll.addNode(0);
					sll.addBetween(3, 12);
					sll.display();
					

	}

}
