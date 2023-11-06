

public class Singly_linked_list_practice_exercies {
	class Node{
		int data;//data type can be anything
		Node next;//Node --->class Name
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public Node head=null;
	public Node tail=null;
	void addNode1(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	void addBeginning(int data) {
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
			}
			tail.next=newNode;
			tail=newNode;
	}
	
	void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty.");
		}
			else {	System.out.println("Singly linked list are: ");
			while(current!=null) {//only while loop will work
				System.out.println(current.data+" ");
				current=current.next;
			}
			}
	}
		void deleteNodeFront() {
			if(head==null)
				return;
			Node temp=head;
			head=head.next;
			
		}
		
		void deleteNodeBack() {
	
				if(head == null)
					return;
				else {
					if(head!= tail) {
						Node curr = head;
						while(curr.next != tail) {
							curr = curr.next;
						}
						tail = curr;
						tail.next =null;
						
					}
					else {
						head = tail = null;
					}
				}
				
				
			}
		public void deleteElement(int data) {
			Node temp=head;
			if(head==null)
				System.out.println("list is empty.");
			else {
				if(temp.data==data) {
					temp=temp.next;
					head=temp;
				}
				else {
					while(temp.next.data!=data) {
						temp=temp.next;
					}
					if(temp.next==null)
						System.out.println("Element is not present in the list");
					else {
						temp.next=temp.next.next;
					}
				}
			}
		}
	    void insertAfter(Node prevNode, int newData) {
	        if (prevNode == null) {
	            System.out.println("Previous node cannot be null.");
	            return;
	        }

	        Node newNode = new Node(newData);
	        newNode.next = prevNode.next;
	        prevNode.next = newNode;
	    }

			
			
		
	
	public static void main(String[] args) {
		Singly_linked_list_practice_exercies s11= new Singly_linked_list_practice_exercies();
		s11.addNode1(2);
		s11.addNode1(4);
		s11.addBeginning(6);
		s11.addLast(10);
		s11.addNode1(12);
		s11.display();
		s11.deleteNodeFront();
		s11.deleteNodeBack();
		s11.deleteElement(4);
		//s11.insertAfter(Node,24);
		s11.display();
	}

}
