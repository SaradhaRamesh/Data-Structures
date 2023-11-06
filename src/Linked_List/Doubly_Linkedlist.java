package Linked_List;

public class Doubly_Linkedlist {
class Node{
	public int data;
	public Node next;//pointer to the next node
	public Node prev;//pointer to the previous node
	public Node(int data) {
		this.data=data;
			}
}
Node head=null;
Node tail=null;
public void addNodefront(int val) {
	Node temp=new Node(val);
	if(head!=null) {
		head.prev=temp;
		temp.next=head;
	}
	head=temp;
	if(tail==null) {
		tail=temp;
	}}
public void addNodeBack(int val) {
	Node temp=new Node(val);
	if(tail!=null) {
		tail.next=temp;
		temp.prev=tail;
	}
	tail=temp;
	if(head==null) {
		head=temp;
	}
	System.out.println("New node added at the end:"+val);
}

	public void iterateForward() {
		Node temp= head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
		public void removeNodeFront() {
			Node temp= head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
		}
		}
			public void removeNodeBack() {
				Node temp= tail;
				tail=tail.prev;
				tail.next=null;
				System.out.println("deleted:"+temp.data);
			}
		
			public void iteratBackward() {
				Node temp= tail;
				while(temp!=null) {
					System.out.println(temp.data);
					temp=temp.prev;
				}
			}
			

	public static void main(String[] args) {
		Doubly_Linkedlist dll= new Doubly_Linkedlist();
		dll.addNodefront(2);
		dll.addNodefront(100);
		dll.addNodeBack(1200);
		dll.addNodeBack(2000);
		dll.addNodeBack(500);
		System.out.println("Doubly linked list Before remove:");
		dll.iterateForward();
		dll.removeNodeFront();
		System.out.println("Doubly linked list Before remove:");
		dll.iterateForward();
		dll.removeNodeBack();
		System.out.println("Doubly linked list After remove back:");
		dll.iterateForward();
		System.out.println("Iterate Bcakward:");
		dll.iteratBackward();
	}

}
