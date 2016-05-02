package tree;

public class TreeTraversal {

	public static void main(String[] args) {
		Node tree = populateNode();
		//inOrder(tree);
		//preOrder(tree);
		postOrder(tree);
	}

	/**
	 * Prints Post-Order traversal L-R-N
	 * @param root
	 */
	static void postOrder(Node root) {
		if (root == null)
			return;

		if (root.getLeft() != null)
			postOrder(root.getLeft());

		if (root.getRight() != null)
			postOrder(root.getRight());

		System.out.println(root.getData());
	}

	/**
	 * Prints Pre-Order traversal N-L-R
	 * @param root
	 */
	static void preOrder(Node root) {
		if (root == null)
			return;

		System.out.println(root.getData());

		if (root.getLeft() != null)
			preOrder(root.getLeft());

		if (root.getRight() != null)
			preOrder(root.getRight());
	}

	/**
	 * Prints In-Order traversal L-N-R
	 * @param root
	 */
	static void inOrder (Node root) {
		if (root == null)
			return;
		
		if (root.getLeft() != null)
			inOrder(root.getLeft());
		
		System.out.println(root.getData());

		if (root.getRight() != null)
			inOrder(root.getRight());
	}

	private static Node populateNode() {
		Node n1 = new Node(2, null, null);
		Node n2 = new Node(5, null, null);
		Node n3 = new Node(11, null, null);
		Node n4 = new Node(6, n2, n3);
		Node n5 = new Node(7, n1, n4);
		Node n6 = new Node(4, null, null);
		Node n7 = new Node(9, n6, null);
		Node n8 = new Node(5, null, n7);
		Node n9 = new Node(2, n5, n8);
		return n9;
	}
}

class Node {

	private int data;
	private Node left;
	private Node right;
	
	public Node() {
	}

	public Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

}
