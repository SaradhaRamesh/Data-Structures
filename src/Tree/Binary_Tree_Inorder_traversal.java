package Tree;
class Node{
	int item;
	Node  left,right;
	public Node(int key) {
		item=key;
		left=right=null;
	}
	
}
public class Binary_Tree_Inorder_traversal {
	Node root;
	Binary_Tree_Inorder_traversal(){
		root=null;
	}
	void inorder(Node node) {
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.item+"->");
		inorder(node.right);
	}
	public static void main(String[] args) {
		Binary_Tree_Inorder_traversal tree=new Binary_Tree_Inorder_traversal();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);
		System.out.println("Inorder tree traversal");
		tree.inorder(tree.root);
	}

}
