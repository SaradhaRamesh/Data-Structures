package Practice_linkedlist;

public class Singly_linkedlist_addbegining {
 Node head;
	class Node{
	 int data;
	 Node next;
	 Node(int data){
		 this.data=data;
		 next=null;
	 }
	}
	Singly_linkedlist_addbegining(){
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
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
	public static void main(String[] args) {
		Singly_linkedlist_addbegining list = new Singly_linkedlist_addbegining();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.display();

	}

}
