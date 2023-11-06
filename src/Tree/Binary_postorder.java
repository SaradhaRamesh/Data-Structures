package Tree;
class Node2{
	int item;
	Node  left,right;
	public Node2(int key) {
		item=key;
		left=right=null;
	}
	
}
public class Binary_postorder {
	Node root;
	Binary_postorder(){
		root=null;
	}
	void postorder(Node node) {
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.item+"->");
	
	}
	
	public static void main(String[] args) {
		Binary_postorder tree=new Binary_postorder();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);
		System.out.println("Preorder tree traversal");
		tree.postorder(tree.root);


	}

}
