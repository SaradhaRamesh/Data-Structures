package LinkedListMam;

public class Circular_linkedlist {
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
}
//head&tail pointers
public Node head=null;
public Node tail=null;
//method to add at end of the list
public void add(int data) {
	//create new node
	Node newNode= new Node(data);
	//check if list is empty
	if(head==null) {
		head=newNode;
		tail=newNode;
		newNode.next=head;
	}
	else {
		//tail will point to new node
		tail.next=newNode;
		//new node will become new tail
		tail=newNode;
		//since it is circular linked list tail will point to head
		tail.next=head;
	}
}
public void display() {
	Node current=head;
	if(head==null) {
		System.out.println("List is empty");
		return;
	}
	else {
		System.out.println("Node of the circular linked list:");
		do {
			System.out.print(" "+current.data);
			current=current.next;
		}while(current!=head);
		System.out.println();
	}
}
	public static void main(String[] args) {
		Circular_linkedlist cl= new Circular_linkedlist();
		//Add data to the list
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.display();

	}

}
