package Linked_List;

public class Circularlist_Add_first_last {
static class Node{
	int data;
	Node next;
	
}
static Node addToEmpty(Node last,int data) {
	if(last!=null) 
		return last;
	//allocate memory to the new node
	Node newNode= new Node();
	//assign data to the new node
	newNode.data=data;
	//assign last to the newNode
	last=newNode;
	//create link to itself
	newNode.next=last;
	return last;
	
}
//add node to the front
static Node addFront(Node last,int data) {
	if(last==null)
		return addToEmpty(last,data);
	//allocate memory to the new node
	Node newNode=new Node();
	//add data to the node
	newNode.data=data;
	//store address to the current node
	newNode.next=last.next;
	last.next = newNode; 
	return last;
}
//add node to the End
static Node addEnd(Node last, int data) {
	if(last==null)
		return addToEmpty(last,data);
	//allocate memory to the new node
	Node newNode = new Node();
	//add data to the node
	newNode.data = data;
	//store the address of the head node to next of newNode
	newNode.next = last.next;
	//point the current last node to the newNode
	last.next = newNode;
	//make newNode as the last node
	last = newNode;
	return last;
		
}
//add After
static Node addAfter(Node last,int data,int item) {
	if(last==null)
		return null;
	Node newNode,p;
	p=last.next;
	do {
		//if the item is found,place newnode after it
		if(p.data==item) {
			//allocate memory to the new node
			newNode=new Node();
			//add data to the node
			newNode.data=data;
			//make the next of the current node as the next of newNode
			newNode.next=p.next;
			//put newNode to the next of p
			p.next=newNode;
			if(p==last)
				last=newNode;
			return last;
		}
		p=p.next;
		
	}while(p!=last.next);
	System.out.println(item+" the given node is not present in the list");
	return last;
}
//delete node
static Node deleteNode(Node last,int key) {
	//if linked list is empty
	if(last==null)
		return null;
	//if the list contains only the single node
	if(last.data==key&&last.next==last) {
		last=null;
	return last;
}
Node temp= last,d=new Node();
//if last is to be deleted
if(last.data==key){
	//find the node before the last node
	while(temp.next!=last) {
		temp=temp.next;
	}
	//point temp node to the next of last
	temp.next=last.next;
	last=temp.next;
	
}
//travel to the node to be deleted
while(temp.next!=last&&temp.next.data!=key) {
	temp=temp.next;
}
//if node to be delete was found
if((temp.next.data==key)){
	d=temp.next;
	temp.next=d.next;
}
return last;
}
//traverse of the list
static void traverse(Node last) {
	Node p;
	if(last==null) {
		System.out.println("List is empty.");
		return;
	}
	p=last.next;
	do {
		System.out.print(p.data+" ");
		p=p.next;
	}while(p!=last.next);
}
	public static void main(String[] args) {
		Node last=null;
		last=addToEmpty(last,6);
		last=addEnd(last,8);
		last=addFront(last,2);
		last=addAfter(last,10,2);
		last=deleteNode(last,6);
		traverse(last);

	}

}
