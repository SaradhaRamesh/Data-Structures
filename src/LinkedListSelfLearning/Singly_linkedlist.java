package LinkedListSelfLearning;

public class Singly_linkedlist {
 Node head;
	class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
		 next=null;
	 }
	}
	Singly_linkedlist(){
		head=null;
	}
	
	public void add(int data) {
		Node newNode =new Node(data);
		if(head==null)
			head=newNode;
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void insertAtPos(int pos,int data) {
		Node newNode=new Node(data);
		if(pos==0) {
			add(data);
			return;
		}
		Node temp=head;
		for(int i=1;i<pos;i++)
			temp=temp.next;
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void insertAtEnd(int data) {
	Node newNode = new Node(data);
    
    	
	Node temp=head;
    while (temp.next!= null) 
		temp=temp.next;
		temp.next=newNode;
		newNode.next=null;
	}
	
    
	
	public void display() {
	    Node temp = head;
	    while (temp != null) {
	        System.out.println(temp.data + " ");
	        temp = temp.next;
	    }
	}
	public static void main(String[] args) {
		Singly_linkedlist list = new Singly_linkedlist();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.insertAtEnd(5);
		list.insertAtPos(0, 0);
		list.add(21);
		list.insertAtPos(7, 25);
		list.display();

	}

}
