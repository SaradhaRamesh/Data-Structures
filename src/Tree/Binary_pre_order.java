package Tree;
class Node1{
	int item;
	Node  left,right;
	public Node1(int key) {
		item=key;
		left=right=null;
	}
	
}
public class Binary_pre_order {
	Node root;
	Binary_pre_order(){
		root=null;
	}
	void preorder(Node node) {
		if(node==null)
			return;
		System.out.print(node.item+"->");
		preorder(node.left);
	preorder(node.right);
	}
	public static void main(String[] args) {
		Binary_pre_order tree=new Binary_pre_order();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);
		System.out.println("Preorder tree traversal");
		tree.preorder(tree.root);

	}

}
